package com.yumumu.riceApi.model.standing;

import com.yumumu.riceApi.interfaces.UniqIdentify;
import com.yumumu.riceApi.model.basic.Level;
import com.yumumu.riceApi.model.basic.Skill;
import lombok.Data;

import java.io.Serializable;

/**
 *  技能简介类
 */
@Data
public class SkillProfile implements UniqIdentify, Serializable {
    private static final long serialVersionUID = -8207358707083379572L;

    //  技能信息
    private Skill skill;

    //  技能等级
    private Level level;

    @Override
    public String getIdentify() {
        return skill.getIdentify();
    }
}
