package com.yumumu.riceApi.model.gaming;

import com.yumumu.riceApi.interfaces.UniqIdentify;
import com.yumumu.riceApi.model.gaming.abs.GamingRecord;
import com.yumumu.riceApi.model.standing.EquipmentProfile;
import lombok.Data;

import java.io.Serializable;

/**
 *  运行时装备类
 */
@Data
public class GamingEquipment extends GamingRecord implements UniqIdentify, Serializable {
    private static final long serialVersionUID = -625380400438506381L;

    //  装备信息
    private EquipmentProfile equipmentProfile;

    @Override
    public String getIdentify() {
        return equipmentProfile.getIdentify();
    }
}
