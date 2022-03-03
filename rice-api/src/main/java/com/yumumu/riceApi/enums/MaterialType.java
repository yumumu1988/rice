package com.yumumu.riceApi.enums;

/**
 *  材料枚举类型
 */
public enum MaterialType {
    COMMON(1, "通用"),
    EQUIPMENT(2, "装备"),
    EXP(3, "经验"),
    GOLD(4, "金币");

    private Integer value;
    private String name;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    MaterialType(Integer value, String name) {
        this.value = value;
        this.name = name;
    }
}
