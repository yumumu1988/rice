package com.yumumu.riceApi.model.view;

import com.yumumu.riceApi.model.basic.abs.RuntimeObject;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 *  一个完整的游戏
 */
@Data
public class OneGame extends RuntimeObject implements Serializable {
    private static final long serialVersionUID = -4506542455360568051L;

    //  游戏包含的所有场景
    private List<GamingView> gamingViewList;

    //  游戏场景个数
    private Integer viewCount;

    //  当前场景序号
    private Integer currentView;

}
