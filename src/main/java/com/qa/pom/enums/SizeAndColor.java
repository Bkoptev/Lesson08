package com.qa.pom.enums;

public enum SizeAndColor {
    S("S"),
    M("M"),
    L("L"),
    ORANGE("Orange"),
    GREEN("Green"),
    YELLOW("Yellow"),
    BEIGE("Beige"),
    PINK("Pink"),
    WHITE("White"),
    BLACK("Black"),
    BLUE("Blue");

    private String value;

    SizeAndColor(String name) {
        this.value = name;
    }

    public String getValue() {

        return value;
    }
}
