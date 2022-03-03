package com.yumumu.riceApi.model.standing;

import com.yumumu.riceApi.model.basic.Hero;
import com.yumumu.riceApi.model.basic.Level;
import lombok.Data;

import java.io.Serializable;

/**
 *  人物简介类
 */
@Data
public class HeroProfile implements Serializable {
    private static final long serialVersionUID = 8490594718165798955L;

    //  人物信息
    private Hero hero;

    //  人物等级
    private Level level;
}
