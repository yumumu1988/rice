package com.yumumu.riceApi.model.basic;

import com.yumumu.riceApi.model.basic.abs.RuntimeObject;

import java.io.Serializable;

/**
 *  加成类（无实体）
 */
public class RootBuff extends RuntimeObject implements Serializable {
    private static final long serialVersionUID = 6097673841291652960L;

    //  增（减）益加成
    private RootAttribute buff;

    //  增益持续时间。
    private Integer duration;

}
