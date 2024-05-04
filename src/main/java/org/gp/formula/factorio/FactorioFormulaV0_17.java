package org.gp.formula.factorio;

import org.gp.core.Formula;
import org.gp.core.AbsFormulaManager;

import java.util.ArrayList;
import java.util.List;

public class FactorioFormulaV0_17 extends AbsFormulaManager {

    @Override
    public List<Formula> getFormula() {
        List<Formula> formulaList = new ArrayList<>();
        formulaList.addAll( genBase() );
        formulaList.addAll( genMid() );
        formulaList.addAll( genChemical() );
        formulaList.addAll( genLevel1() );
        return formulaList;
    }

    private static List<Formula> genChemical(){
        List<Formula> formulaList = new ArrayList<>();
        formulaList.add( G(
                G(2,"塑料"),
                1,
                G(1,"煤"),
                G(20,"石油气")
        ) );
        formulaList.add( G(
                G(2,"硫磺"),
                1,
                G(30,"水"),
                G(30,"石油气")
        ) );
        formulaList.add( G(
                G(50,"硫酸"),
                1,
                G(1,"铁"),
                G(5,"硫磺"),
                G(100,"水")
        ) );
        formulaList.add( G(
                G(1,"电池"),
                4,
                G(1,"铁"),
                G(1,"铜"),
                G(20,"硫酸")
        ) );


        return formulaList;
    }


    private static List<Formula> genMid(){
        List<Formula> formulaList = new ArrayList<>();

        // 板子
        formulaList.add( G(
                G(1,"绿板"),
                0.5,
                G(1,"铁"),
                G(3,"铜线")
        ) );
        formulaList.add( G(
                G(1,"红板"),
                6,
                G(2,"塑料"),
                G(4,"铜线"),
                G(2,"绿板")
        ) );
        formulaList.add( G(
                G(1,"蓝板"),
                10,
                G(20,"绿板"),
                G(2,"红板"),
                G(5,"硫酸")
        ) );

        // 传送带、爪子
        formulaList.add( G(
                G(2,"基础传送带"),
                0.5,
                G(1,"铁"),
                G(1,"铁齿轮")
        ) );
        formulaList.add( G(
                G(1,"电力机械臂"),
                0.5,
                G(1,"铁"),
                G(1,"铁齿轮"),
                G(1,"绿板")
        ) );


        // 内燃机、电动机
        formulaList.add( G(
                G(1,"内燃机"),
                10,
                G(1,"钢"),
                G(1,"铁齿轮"),
                G(2,"管道")
        ) );
        formulaList.add( G(
                G(1,"电动机"),
                10,
                G(2,"绿板"),
                G(1,"内燃机"),
                G(15,"润滑油")
        ) );

        // 机器人构架、轻质框架、火箭燃料、火箭控制器、插件
        formulaList.add( G(
                G(1,"机器人构架"),
                20,
                G(1,"钢"),
                G(2,"电池"),
                G(3,"绿板"),
                G(1,"电动机")
        ) );
        formulaList.add( G(
                G(1,"轻质框架"),
                20,
                G(20,"铜"),
                G(2,"钢"),
                G(5,"塑料")
        ) );
        formulaList.add( G(
                G(1,"火箭燃料"),
                30,
                G(10,"固体燃料"),
                G(10,"轻油")
        ) );
        formulaList.add( G(
                G(1,"火箭控制器"),
                30,
                G(1,"蓝板"),
                G(1,"速度插件1")
        ) );
        formulaList.add( G(
                G(1,"速度插件1"),
                15,
                G(5,"绿板"),
                G(5,"红板")
        ) );
        formulaList.add( G(
                G(1,"产能插件1"),
                15,
                G(5,"绿板"),
                G(5,"红板")
        ) );

        // 太阳能、蓄电池
        formulaList.add( G(
                G(1,"太阳能板"),
                10,
                G(5,"铜"),
                G(5,"钢"),
                G(15,"绿板")
        ) );
        formulaList.add( G(
                G(1,"蓄电器"),
                10,
                G(2,"铁"),
                G(5,"电池")
        ) );

        // 电炉、铁轨
        formulaList.add( G(
                G(1,"电炉"),
                5,
                G(10,"钢"),
                G(5,"红板"),
                G(10,"砖")
        ) );
        formulaList.add( G(
                G(2,"铁轨"),
                0.5,
                G(1,"石"),
                G(1,"钢"),
                G(1,"铁棒")
        ) );

        return formulaList;
    }



    private static List<Formula> genBase(){
        List<Formula> formulaList = new ArrayList<>();
        formulaList.add( G( G(1,"钢"), 16, G(5,"铁") ) );
        formulaList.add( G( G(2,"铜线"), 0.5, G(1,"铜") ) );
        formulaList.add( G( G(1,"铁齿轮"),0.5, G(2,"铁") ) );
        formulaList.add( G( G(1,"管道"), 0.5, G(1,"铁") ) );
        formulaList.add( G( G(2,"铁棒"), 0.5, G(1,"铁") ) );
        return formulaList;
    }

    private static List<Formula> genLevel1(){
        List<Formula> formulaList = new ArrayList<>();

        // 研究
        formulaList.add( G(
                G(1,"生产研究"),
                60,
                G(1,"红瓶"),
                G(1,"绿瓶"),
                G(1,"蓝瓶"),
                G(1,"紫瓶"),
                G(1,"黄瓶"),
                G(1,"白瓶")
        ) );
        formulaList.add( G(
                G(1,"武器研究"),
                60,
                G(1,"红瓶"),
                G(1,"绿瓶"),
                G(1,"蓝瓶"),
                G(1,"灰瓶"),
                G(1,"黄瓶"),
                G(1,"白瓶")
        ) );

        // 瓶子
        formulaList.add( G(
                G(1,"红瓶"),
                5,
                G(1,"铜"),
                G(1,"铁齿轮")
        ) );
        formulaList.add( G(
                G(1,"绿瓶"),
                6,
                G(1,"基础传送带"),
                G(1,"电力机械臂")
        ) );
        formulaList.add( G(
                G(2,"灰瓶"),
                10,
                G(1,"穿甲弹匣"),
                G(1,"标准手雷"),
                G(2,"墙壁")
        ) );
        formulaList.add( G(
                G(2,"蓝瓶"),
                24,
                G(1,"硫磺"),
                G(3,"红板"),
                G(2,"内燃机")
        ) );
        formulaList.add( G(
                G(3,"紫瓶"),
                21,
                G(30,"铁轨"),
                G(1,"电炉"),
                G(1,"产能插件1")
        ) );
        formulaList.add( G(
                G(3,"黄瓶"),
                21,
                G(2,"蓝板"),
                G(1,"机器人构架"),
                G(3,"轻质框架")
        ) );
        formulaList.add( G(
                G(1000,"白瓶"),
                60,
                G(1000,"轻质框架"),
                G(1000,"火箭燃料"),
                G(1000,"火箭控制器"),
                G(1,"卫星")
        ) );

        // 卫星
        formulaList.add( G(
                G(1,"卫星"),
                5,
                G(100,"蓝板"),
                G(100,"轻质框架"),
                G(50,"火箭燃料"),
                G(100,"太阳能板"),
                G(100,"蓄电器"),
                G(5,"雷达")
        ) );

        // 雷达
        formulaList.add( G(
                G(1,"雷达"),
                0.5,
                G(10,"铁"),
                G(5,"铁齿轮"),
                G(5,"绿板")
        ) );

        return formulaList;
    }


}
