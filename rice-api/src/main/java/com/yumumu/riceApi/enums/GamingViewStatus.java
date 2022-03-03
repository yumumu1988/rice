package com.yumumu.riceApi.enums;

/**
 *  游戏场景结果
 */
public enum GamingViewStatus {
    WAITING(0, "未开始"),
    SUCCEED(1, "成功"),
    FAILED(2, "失败"),
    TIE(3, "平局");

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

    GamingViewStatus(Integer value, String name) {
        this.value = value;
        this.name = name;
    }
}
