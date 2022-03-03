package com.yumumu.riceApi.model.basic;

import com.yumumu.riceApi.enums.MaterialType;
import lombok.Data;

import java.io.Serializable;

/**
 *  材料类：资源材料、升级材料
 */
@Data
public class Material<T> implements Serializable {

    private static final long serialVersionUID = 1628733891661456655L;

    //  材料id
    private Integer id;

    //  材料名称
    private String name;

    //  材料类型
    private MaterialType materialType;

    //  材料内容
    private T materialDetail;
}
