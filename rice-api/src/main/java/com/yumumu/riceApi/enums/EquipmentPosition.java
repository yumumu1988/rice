package com.yumumu.riceApi.enums;

/**
 *  装备未知枚举类
 */
public enum EquipmentPosition {
    WEAPON(1, "武器"),
    ARMOUR(2, "盔甲"),
    ORNAMENT(3, "饰品");

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

    EquipmentPosition(Integer value, String name) {
        this.value = value;
        this.name = name;
    }
}
