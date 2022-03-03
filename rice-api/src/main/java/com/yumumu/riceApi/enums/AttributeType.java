package com.yumumu.riceApi.enums;

/**
 *  属性类别
 */
public enum AttributeType {

    //  基础属性
    HP(1, "生命"),
    FY(2, "防御"),
    SD(3, "速度"),
    GJ(4, "攻击"),
    MZ(5, "命中"),
    BJ(6, "暴击"),

    //  元素属性
    AN(101, "暗"),
    GUANG(102, "光"),
    MU(103, "木"),
    SHUI(104, "水"),
    HUO(105, "火"),

    //  增益属性
    BUFF_AN(201, "暗+"),
    BUFF_GUANG(202, "光+"),
    BUFF_MU(203, "木+"),
    BUFF_SHUI(204, "水+"),
    BUFF_HUO(205, "火+"),

    //  减益属性
    DE_BUFF_AN(301, "暗-"),
    DE_BUFF_GUANG(302, "光-"),
    DE_BUFF_MU(303, "木-"),
    DE_BUFF_SHUI(304, "水-"),
    DE_BUFF_HUO(305, "火-");

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

    AttributeType(Integer value, String name) {
        this.value = value;
        this.name = name;
    }
}
