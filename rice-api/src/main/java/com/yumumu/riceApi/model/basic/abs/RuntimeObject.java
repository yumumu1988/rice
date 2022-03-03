package com.yumumu.riceApi.model.basic.abs;

import lombok.Data;

import java.io.Serializable;

/**
 *  运行时类，无数据库中记录对应
 */
@Data
public abstract class RuntimeObject implements Serializable {
    private static final long serialVersionUID = -1481395417375359098L;

    //  唯一id
    private String uniqId;

    //  描述
    private String description;

}
