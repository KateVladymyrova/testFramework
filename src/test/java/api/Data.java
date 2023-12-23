package api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = Data.class)
public class Data {
    @JsonProperty("Ref")
    public String ref;
    @JsonProperty("SettlementType")
    public String settlementType;
    @JsonProperty("Latitude")
    public String latitude;
    @JsonProperty("Longitude")
    public String longitude;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("DescriptionRu")
    public String descriptionRu;
    @JsonProperty("DescriptionTranslit")
    public String descriptionTranslit;
    @JsonProperty("SettlementTypeDescription")
    public String settlementTypeDescription;
    @JsonProperty("SettlementTypeDescriptionRu")
    public String settlementTypeDescriptionRu;
    @JsonProperty("SettlementTypeDescriptionTranslit")
    public String settlementTypeDescriptionTranslit;
    @JsonProperty("Region")
    public String region;
    @JsonProperty("RegionsDescription")
    public String regionsDescription;
    @JsonProperty("RegionsDescriptionRu")
    public String regionsDescriptionRu;
    @JsonProperty("RegionsDescriptionTranslit")
    public String regionsDescriptionTranslit;
    @JsonProperty("Area")
    public String area;
    @JsonProperty("AreaDescription")
    public String areaDescription;
    @JsonProperty("AreaDescriptionRu")
    public String areaDescriptionRu;
    @JsonProperty("AreaDescriptionTranslit")
    public String areaDescriptionTranslit;
    @JsonProperty("Index1")
    public String index1;
    @JsonProperty("Index2")
    public String index2;
    @JsonProperty("IndexCOATSU1")
    public String indexCOATSU1;
    @JsonProperty("Delivery1")
    public String delivery1;
    @JsonProperty("Delivery2")
    public String delivery2;
    @JsonProperty("Delivery3")
    public String delivery3;
    @JsonProperty("Delivery4")
    public String delivery4;
    @JsonProperty("Delivery5")
    public String delivery5;
    @JsonProperty("Delivery6")
    public String delivery6;
    @JsonProperty("Delivery7")
    public String delivery7;
    @JsonProperty("SpecialCashCheck")
    public int specialCashCheck;
    @JsonProperty("Warehouse")
    public String warehouse;

    @JsonCreator
    public Data(@JsonProperty("ref") String ref, @JsonProperty("settlementType")String settlementType,
                @JsonProperty("latitude")String latitude, @JsonProperty("longitude")String longitude,
                @JsonProperty("description")String description, @JsonProperty("descriptionRu")String descriptionRu,
                @JsonProperty("descriptionTranslit")String descriptionTranslit,
                @JsonProperty("settlementTypeDescription")String settlementTypeDescription,
                @JsonProperty("settlementTypeDescriptionRu")String settlementTypeDescriptionRu,
                @JsonProperty("settlementTypeDescriptionTranslit")String settlementTypeDescriptionTranslit,
                @JsonProperty("region")String region, @JsonProperty("regionsDescription")String regionsDescription,
                @JsonProperty("regionsDescriptionRu")String regionsDescriptionRu,
                @JsonProperty("regionsDescriptionTranslit")String regionsDescriptionTranslit,
                @JsonProperty("area")String area, @JsonProperty("areaDescription")String areaDescription,
                @JsonProperty("areaDescriptionRu")String areaDescriptionRu,
                @JsonProperty("areaDescriptionTranslit")String areaDescriptionTranslit,
                @JsonProperty("index1")String index1, @JsonProperty("index2")String index2,
                @JsonProperty("indexCOATSU1")String indexCOATSU1, @JsonProperty("delivery1")String delivery1,
                @JsonProperty("delivery2")String delivery2, @JsonProperty("delivery3")String delivery3,
                @JsonProperty("delivery4")String delivery4, @JsonProperty("delivery5")String delivery5,
                @JsonProperty("delivery6")String delivery6, @JsonProperty("delivery7")String delivery7,
                @JsonProperty("specialCashCheck")int specialCashCheck, @JsonProperty("warehouse")String warehouse) {
        this.ref = ref;
        this.settlementType = settlementType;
        this.latitude = latitude;
        this.longitude = longitude;
        this.description = description;
        this.descriptionRu = descriptionRu;
        this.descriptionTranslit = descriptionTranslit;
        this.settlementTypeDescription = settlementTypeDescription;
        this.settlementTypeDescriptionRu = settlementTypeDescriptionRu;
        this.settlementTypeDescriptionTranslit = settlementTypeDescriptionTranslit;
        this.region = region;
        this.regionsDescription = regionsDescription;
        this.regionsDescriptionRu = regionsDescriptionRu;
        this.regionsDescriptionTranslit = regionsDescriptionTranslit;
        this.area = area;
        this.areaDescription = areaDescription;
        this.areaDescriptionRu = areaDescriptionRu;
        this.areaDescriptionTranslit = areaDescriptionTranslit;
        this.index1 = index1;
        this.index2 = index2;
        this.indexCOATSU1 = indexCOATSU1;
        this.delivery1 = delivery1;
        this.delivery2 = delivery2;
        this.delivery3 = delivery3;
        this.delivery4 = delivery4;
        this.delivery5 = delivery5;
        this.delivery6 = delivery6;
        this.delivery7 = delivery7;
        this.specialCashCheck = specialCashCheck;
        this.warehouse = warehouse;
    }

    public String getRef() {
        return ref;
    }

    public String getSettlementType() {
        return settlementType;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        description = description;
    }

    public String getDescriptionRu() {
        return descriptionRu;
    }

    public String getDescriptionTranslit() {
        return descriptionTranslit;
    }

    public String getSettlementTypeDescription() {
        return settlementTypeDescription;
    }

    public String getSettlementTypeDescriptionRu() {
        return settlementTypeDescriptionRu;
    }

    public String getSettlementTypeDescriptionTranslit() {
        return settlementTypeDescriptionTranslit;
    }

    public String getRegion() {
        return region;
    }

    public String getRegionsDescription() {
        return regionsDescription;
    }

    public String getRegionsDescriptionRu() {
        return regionsDescriptionRu;
    }

    public String getRegionsDescriptionTranslit() {
        return regionsDescriptionTranslit;
    }

    public String getArea() {
        return area;
    }

    public String getAreaDescription() {
        return areaDescription;
    }

    public String getAreaDescriptionRu() {
        return areaDescriptionRu;
    }

    public String getAreaDescriptionTranslit() {
        return areaDescriptionTranslit;
    }

    public String getIndex1() {
        return index1;
    }

    public String getIndex2() {
        return index2;
    }

    public String getIndexCOATSU1() {
        return indexCOATSU1;
    }

    public String getDelivery1() {
        return delivery1;
    }

    public String getDelivery2() {
        return delivery2;
    }

    public String getDelivery3() {
        return delivery3;
    }

    public String getDelivery4() {
        return delivery4;
    }

    public String getDelivery5() {
        return delivery5;
    }

    public String getDelivery6() {
        return delivery6;
    }

    public String getDelivery7() {
        return delivery7;
    }

    public int getSpecialCashCheck() {
        return specialCashCheck;
    }

    public String getWarehouse() {
        return warehouse;
    }

    @Override
    public String toString() {
        return "Data{" +
                "ref='" + ref + '\'' +
                ", settlementType='" + settlementType + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", description='" + description + '\'' +
                ", descriptionRu='" + descriptionRu + '\'' +
                ", descriptionTranslit='" + descriptionTranslit + '\'' +
                ", settlementTypeDescription='" + settlementTypeDescription + '\'' +
                ", settlementTypeDescriptionRu='" + settlementTypeDescriptionRu + '\'' +
                ", settlementTypeDescriptionTranslit='" + settlementTypeDescriptionTranslit + '\'' +
                ", region='" + region + '\'' +
                ", regionsDescription='" + regionsDescription + '\'' +
                ", regionsDescriptionRu='" + regionsDescriptionRu + '\'' +
                ", regionsDescriptionTranslit='" + regionsDescriptionTranslit + '\'' +
                ", area='" + area + '\'' +
                ", areaDescription='" + areaDescription + '\'' +
                ", areaDescriptionRu='" + areaDescriptionRu + '\'' +
                ", areaDescriptionTranslit='" + areaDescriptionTranslit + '\'' +
                ", index1='" + index1 + '\'' +
                ", index2='" + index2 + '\'' +
                ", indexCOATSU1='" + indexCOATSU1 + '\'' +
                ", delivery1='" + delivery1 + '\'' +
                ", delivery2='" + delivery2 + '\'' +
                ", delivery3='" + delivery3 + '\'' +
                ", delivery4='" + delivery4 + '\'' +
                ", delivery5='" + delivery5 + '\'' +
                ", delivery6='" + delivery6 + '\'' +
                ", delivery7='" + delivery7 + '\'' +
                ", specialCashCheck=" + specialCashCheck +
                ", warehouse='" + warehouse + '\'' +
                '}';
    }
}
