package com.yumumu.riceApi.enums;

/**
 *  技能类别
 */
public enum SkillType {
    ZHUDONG(1, "主动技能"),
    BEIDONG(2, "被动技能"),

    COMMON(101, "普通技能"),
    KILL(102, "必杀技能");

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

    SkillType(Integer value, String name) {
        this.value = value;
        this.name = name;
    }
}
