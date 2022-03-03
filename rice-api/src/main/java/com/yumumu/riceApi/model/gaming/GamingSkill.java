package com.yumumu.riceApi.model.gaming;

import com.yumumu.riceApi.interfaces.UniqIdentify;
import com.yumumu.riceApi.model.gaming.abs.GamingRecord;
import com.yumumu.riceApi.model.standing.SkillProfile;
import lombok.Data;

import java.io.Serializable;

/**
 *  运行时技能类
 */
@Data
public class GamingSkill extends GamingRecord implements UniqIdentify, Serializable {
    private static final long serialVersionUID = -6564804590291552581L;

    //  技能信息类
    private SkillProfile skillProfile;

    @Override
    public String getIdentify() {
        return skillProfile.getIdentify();
    }
}
