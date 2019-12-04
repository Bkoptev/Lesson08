package com.qa.pom.base;


public enum BreadCrumbCategories {
    HOME("Return to Home"),
    WOMEN("Women"),
    TOPS("Tops"),
    TSHIRTS("T-shirts"),
    FADED_SHORT_SLEEVE_TSHIRTS("Faded Short Sleeve T-shirts");

    private String name;

    BreadCrumbCategories(String name) {
        this.name = name;

    }
    public String getName() {
        return name;
    }





}
