package com.yumumu.riceApi.model.view;

import com.yumumu.riceApi.enums.GamingActionType;
import com.yumumu.riceApi.model.basic.abs.RuntimeObject;
import com.yumumu.riceApi.model.gaming.GamingSkill;
import com.yumumu.riceApi.model.gaming.Player;
import lombok.Data;
import lombok.NonNull;

import java.io.Serializable;

/**
 *  游戏场景中的每一个动作
 */
@Data
public class GamingAction extends RuntimeObject implements Serializable {
    private static final long serialVersionUID = -8655092795924333040L;

    //  使用的技能
    private GamingSkill usedSkill;

    //  发起者
    @NonNull
    private Player initiator;

    //  目标
    private Player target;

    //  场景动作状态
    private GamingActionType gamingActionType;
}
