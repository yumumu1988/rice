package com.yumumu.riceApi.model.basic;

import com.yumumu.riceApi.enums.LevelType;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 *  等级类
 */
public class Level implements Serializable {
    private static final long serialVersionUID = 1799028557531242940L;

    //  等级类型
    @Getter
    @Setter
    private LevelType type;

    //  总经验
    @Getter
    @Setter
    private Integer totalExp;

    //  当前等级
    @Getter
    @Setter
    private Integer currentLevel;

    //  最大等级
    @Getter
    @Setter
    private Integer maxLevel;
}
