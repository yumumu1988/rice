package com.yumumu.riceApi.model.standing;

import com.yumumu.riceApi.interfaces.UniqIdentify;
import com.yumumu.riceApi.model.basic.Equipment;
import com.yumumu.riceApi.model.basic.Level;
import lombok.Data;

import java.io.Serializable;

/**
 *  装备简介类
 */
@Data
public class EquipmentProfile implements UniqIdentify, Serializable {
    private static final long serialVersionUID = 2983217548215937823L;

    //  装备信息
    private Equipment equipment;

    //  装备等级
    private Level level;

    @Override
    public String getIdentify() {
        return equipment.getIdentify();
    }
}
