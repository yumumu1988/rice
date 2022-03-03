package com.yumumu.riceApi.enums;

/**
 *  场景动作类型
 */
public enum GamingActionType {

    PASS(1, "略过"),
    SKIP(2, "跳过"),
    NORMAL(3, "正常");

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

    GamingActionType(Integer value, String name) {
        this.value = value;
        this.name = name;
    }
}
