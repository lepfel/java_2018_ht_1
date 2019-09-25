package ru.milandr.courses.pavlyuk;

public class Shop {

    private int floor;
    private String productsType;
    private String region;
    private String name;
    private boolean shopOnline;


    public Shop(String productsType) {
        this.productsType = productsType;
    }

    public Shop(int floor, String productsType, String name) {
        this.floor = floor;
        this.productsType = productsType;
        this.name = name;
        this.region = "Moscow";
        this.shopOnline = true;
    }

    public Shop(int floor, String name) {
        this.floor = floor;
        this.productsType = "Clothes";
        this.region = "Florida";
        this.name = name;
        this.shopOnline = false;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        if (floor < 0) {
            System.out.println("error");
        }
        this.floor = floor;
    }

    public String getProductsType() {
        return productsType;
    }

    public void setProductsType(String productsType) {
        this.productsType = productsType;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isShopOnline() {
        return shopOnline;
    }

    public void setShopOnline(boolean shopOnline) {
        this.shopOnline = shopOnline;
    }
}