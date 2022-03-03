package com.yumumu.riceApi.enums;

/**
 *  可用状态
 */
public enum AvailableStatus {

    PLAYER_ALIVE(1, "存活"),
    PLAYER_DEAD(2, "死亡"),

    ITEM_ENABLE(101, "可用"),
    ITEM_DISABLE(102, "禁用");

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

    AvailableStatus(Integer value, String name) {
        this.value = value;
        this.name = name;
    }
}
