package com.yumumu.riceApi.model.basic;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 *  阵营类
 */
@Data
public class Camp implements Serializable {
    private static final long serialVersionUID = -8696587993862110678L;

    //  阵营id
    private Integer id;

    //  阵营名称
    private String name;

    //  阵营描述
    private String description;

    //  阵营属性
    private List<RootAttribute> attributeList;
}
