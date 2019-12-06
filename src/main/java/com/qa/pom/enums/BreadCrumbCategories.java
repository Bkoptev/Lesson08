package com.qa.pom.enums;

public enum BreadCrumbCategories {
    HOME("Return to Home"),
    WOMEN("Women"),
    TOPS("Tops"),
    TSHIRTS("T-shirts"),
    FADED_SHORT_SLEEVE_TSHIRTS("Faded Short Sleeve T-shirts");

    private String value;

    BreadCrumbCategories(String name) {
        this.value = name;
    }

    public String getValue() {

        return value;
    }

    /**
     * Generate string with expected breadcrumb
     *
     * @return string with expected breadcrumb
     */
    public static String stringOfCategories() {
        String s;
        return s =
                BreadCrumbCategories.HOME.getValue()
                        + BreadCrumbCategories.WOMEN.getValue()
                        + BreadCrumbCategories.TOPS.getValue()
                        + BreadCrumbCategories.TSHIRTS.getValue()
                        + BreadCrumbCategories.FADED_SHORT_SLEEVE_TSHIRTS.getValue();
    }
}
