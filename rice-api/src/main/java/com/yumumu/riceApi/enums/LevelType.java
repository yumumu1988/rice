package com.yumumu.riceApi.enums;

/**
 *  等级类别
 */
public enum LevelType {
    HERO(1, "人物等级"),
    SKILL(2, "技能等级"),
    EQUIP(3, "装备等级");

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

    LevelType(Integer value, String name) {
        this.value = value;
        this.name = name;
    }
}
