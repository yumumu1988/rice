package com.yumumu.riceApi.model.standing;

import lombok.Data;

import java.io.Serializable;

/**
 *  玩家角色类
 */
@Data
public class PlayerInfo implements Serializable {
    private static final long serialVersionUID = -4669284328100570751L;

    //  人物信息
    private HeroProfile heroProfile;

    //  装备信息
    private EquipmentProfile equipmentProfile;

    //  技能信息
    private SkillProfile skillProfile;
}
