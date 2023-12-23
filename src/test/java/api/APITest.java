package api;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.*;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;


public class APITest extends BaseApiTest {
    String API_key = "ec5892c3ba3669a17810458d6212730a";
    final String JSON_SCHEMA_PATH = "src/main/resources/np_address_schema.json";

    private Map<String, Object> reqBody = new HashMap<>();


    @BeforeEach
    public void setReqBody() {
        Map<String, Object> methodProperties = new HashMap<>();

        methodProperties.put("FindByString", "Київ");
        methodProperties.put("Limit", 3);

        reqBody.put("apiKey", API_key);
        reqBody.put("modelName", "Address");
        reqBody.put("calledMethod", "getSettlements");
        reqBody.put("methodProperties", methodProperties);
    }

    @Test
    public void validateThatSuccess() {
        given()
                .spec(requestSpecification)
                .contentType(ContentType.JSON)
                .body(reqBody)
                .when()
                .post()
                .then()
                .spec(responseSpecification)
                .body("success", equalTo(true));
    }

    @Test
    public void validateRegions() {
        given()
                .spec(requestSpecification)
                .contentType(ContentType.JSON)
                .body(reqBody)
                .when()
                .post()
                .then()
                .spec(responseSpecification)
                .body("data.Description", hasItems("Київ", "Київ", "Київець"))
                .body("data.AreaDescription", hasItems("Миколаївська область", "Київська область", "Львівська область"))
                .body("data.RegionsDescription", hasItems("Доманівський р-н", "", "Миколаївський р-н"))
                .body("info.totalCount", equalTo(9))
                .body("success", equalTo(true));
    }

    @Test
    public void validateJsonSchema() {
        File jsonSchemaFile = new File(JSON_SCHEMA_PATH);
        given()
                .spec(requestSpecification)
                .body(reqBody)
                .contentType(ContentType.JSON)
                .when()
                .post()
                .then()
                .spec(responseSpecification)
                .assertThat()
                .body(matchesJsonSchema(jsonSchemaFile));
    }

    @Test
    public void testWithPojoUsage() {
        List<Data> dataData = given()
                .spec(this.requestSpecification)
                .when()
                .contentType(ContentType.JSON)
                .when()
                .body(this.reqBody)
                .post()
                .then()
                .spec(responseSpecification)
                .extract()
                .body().jsonPath().getList("data[0].Description", Data.class);

        System.out.println(dataData);
        dataData.forEach(el -> Assertions.assertTrue(el.getDescription().contains("Київ")));
    }
}