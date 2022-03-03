package com.yumumu.riceApi.model.basic;

import com.yumumu.riceApi.enums.SkillType;
import com.yumumu.riceApi.interfaces.UniqIdentify;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 *  技能类
 */
@Data
public class Skill implements UniqIdentify, Serializable {
    private static final long serialVersionUID = -8484502036141888743L;

    //  技能id
    private Integer id;

    //  技能名称
    private String name;

    //  技能描述
    private String description;

    //  技能类别
    private SkillType ype;

    //  技能冷却时间
    private Integer cd;

    //  技能属性集合
    private List<RootAttribute> skillAttributeList;

    //  增益属性集合
    private List<RootAttribute> buffAttributeList;

    @Override
    public String getIdentify() {
        return "Skill" + this.id;
    }
}
