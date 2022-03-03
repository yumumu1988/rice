package com.yumumu.riceApi.model.basic;

import com.yumumu.riceApi.enums.AttributeType;
import com.yumumu.riceApi.model.basic.abs.UniqObject;
import lombok.Data;

import java.io.Serializable;

/**
 *  根属性
 */
@Data
public class RootAttribute extends UniqObject implements Serializable {
    private static final long serialVersionUID = -5568612108863933405L;

    //  属性名称
    private String name;

    //  属性值
    private Double value;

    //  属性类别
    private AttributeType type;

}
