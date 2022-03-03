package com.yumumu.riceApi.model.basic.abs;

import lombok.Data;

import java.io.Serializable;

/**
 *  实体类，对应数据库中某一条记录的类
 */
@Data
public abstract class InstanceObject implements Serializable {
    private static final long serialVersionUID = -1903286390322816020L;

    //  id
    private Integer id;

    //  名称
    private String name;
}
