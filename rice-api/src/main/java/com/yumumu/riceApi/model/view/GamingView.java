package com.yumumu.riceApi.model.view;

import com.yumumu.riceApi.enums.GamingViewStatus;
import com.yumumu.riceApi.enums.GamingViewType;
import com.yumumu.riceApi.model.basic.Material;
import com.yumumu.riceApi.model.basic.abs.RuntimeObject;
import com.yumumu.riceApi.model.gaming.Player;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 *  游戏场景类。记录当前回合内的数据
 */
@Data
public class GamingView extends RuntimeObject implements Serializable {
    private static final long serialVersionUID = -7577428835558175513L;

    //  红队
    private List<Player> redPlayerList;

    //  蓝队
    private List<Player> bluePlayerList;

    //  场景对战结果（红队 VS 蓝队）
    private GamingViewStatus gamingViewStatus;

    //  场景类型
    private GamingViewType gamingViewType;

    //  场景记录下动作
    private List<GamingAction> gamingActionList;

    //  场景可产出的资源
    private List<Material> totalMaterialList;

    //  场景获得的资源
    private List<Material> winMaterialList;

    //  场景内最大动作个数
    private Integer maxAction;

}
