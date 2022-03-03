package com.yumumu.riceApi.enums;

/**
 * 游戏场景类型
 */
public enum GamingViewType {
    FIGHTING(1, "战斗"),
    PREPARE(2, "准备"),
    MOVING(3, "移动");

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

    GamingViewType(Integer value, String name) {
        this.value = value;
        this.name = name;
    }
}
