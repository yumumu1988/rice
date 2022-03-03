package com.yumumu.riceApi.model.basic;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 *  主角人物
 */
@Data
public class Hero implements Serializable {
    private static final long serialVersionUID = -2188180798351238027L;

    //  人物id
    private Integer id;

    //  人物名称
    private String name;

    //  人物描述
    private String description;

    //  阵营信息
    private Camp camp;

    //  职业

    //  基础属性
    private List<RootAttribute> attributeList;

}
