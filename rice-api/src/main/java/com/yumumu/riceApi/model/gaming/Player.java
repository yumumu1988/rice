package com.yumumu.riceApi.model.gaming;

import com.yumumu.riceApi.model.utils.UniqSizeList;
import lombok.Data;

import java.io.Serializable;

/**
 * 运行时的最大单元---可操作性的角色
 */
@Data
public class Player implements Serializable {
    private static final long serialVersionUID = 1163106181369479070L;

    //  人物
    private GamingHero gamingHero;

    //  装备
    private UniqSizeList<GamingEquipment> gamingEquipment;

    //  技能
    private UniqSizeList<GamingSkill> gamingSkill;
}
