package com.yumumu.riceApi.model.gaming;

import com.yumumu.riceApi.model.basic.RootBuff;
import com.yumumu.riceApi.model.gaming.abs.GamingRecord;
import com.yumumu.riceApi.model.standing.HeroProfile;
import lombok.Data;

import java.io.Serializable;

/**
 *  运行时人物类
 */
@Data
public class GamingHero extends GamingRecord implements Serializable {
    private static final long serialVersionUID = 1163106181369479070L;

    //  角色基础信息
    private HeroProfile heroProfile;

    //  角色坐标
    private Integer[][] position;

}
