package com.yumumu.riceApi.model.basic;

import com.yumumu.riceApi.enums.EquipmentPosition;
import com.yumumu.riceApi.interfaces.UniqIdentify;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 *  装备类
 */
@Data
public class Equipment implements UniqIdentify, Serializable {
    private static final long serialVersionUID = -3635725838899710432L;

    //  装备id
    private Integer id;

    //  装备名称
    private String name;

    //  装备描述
    private String description;

    //  装备类型
    private EquipmentPosition position;

    //  装备级别
    private Integer grade;

    //  装备属性集合
    private List<RootAttribute> attributeList;


    @Override
    public String getIdentify() {
        return "Equipment" + position.getValue();
    }
}
