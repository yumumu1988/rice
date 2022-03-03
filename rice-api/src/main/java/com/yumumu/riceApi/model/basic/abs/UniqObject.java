package com.yumumu.riceApi.model.basic.abs;

import lombok.Data;

import java.io.Serializable;

@Data
public abstract class UniqObject implements Serializable {
    private static final long serialVersionUID = -9023102505701914332L;

    //  属性唯一性。true：唯一；false：累加
    private Boolean uniq;
}
