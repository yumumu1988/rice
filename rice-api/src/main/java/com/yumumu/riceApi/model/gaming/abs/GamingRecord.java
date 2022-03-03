package com.yumumu.riceApi.model.gaming.abs;

import com.yumumu.riceApi.enums.AvailableStatus;
import com.yumumu.riceApi.model.basic.RootBuff;
import com.yumumu.riceApi.model.basic.abs.RuntimeObject;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 *  运行时记录数据类
 */
@Data
public abstract class GamingRecord extends RuntimeObject implements Serializable {
    private static final long serialVersionUID = -7752636271746459995L;

    //  基础属性buff（runtime时添加的）
    private List<RootBuff> attributeBuffList;

    //  状态
    private AvailableStatus status;

    //  经验
    private Integer increasedExp;

}
