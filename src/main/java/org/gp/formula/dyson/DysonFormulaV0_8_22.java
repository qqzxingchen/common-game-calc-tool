package org.gp.formula.dyson;

import org.gp.core.Formula;
import org.gp.core.AbsFormulaManager;

import java.util.ArrayList;
import java.util.List;

public class DysonFormulaV0_8_22 extends AbsFormulaManager {

    @Override
    public List<Formula> getFormula() {
        List<Formula> formulaList = new ArrayList<>();
        formulaList.addAll( genFinal() );
        formulaList.addAll( genMid() );
        // formulaList.addAll( gen_石墨烯_1() );
        formulaList.addAll( gen_碳纳米管_2() );
        formulaList.addAll( gen_光子合并器_1() );
        formulaList.addAll( gen_卡西米尔晶体_1() );
        formulaList.addAll( genLow() );
        return formulaList;
    }

    private static List<Formula> genFinal(){
        List<Formula> formulaList = new ArrayList<>();

        formulaList.add( G(
                G(1,"引力透镜"),
                6,
                G(4,"金刚石"),
                G(1,"奇异物质")
        ) );

        // 燃料
        formulaList.add( G(
                G(2,"反物质燃料棒"),
                24,
                G(12,"光子"),
                G(1,"湮灭约束球"),
                G(1,"钛合金")
        ) );

        // 运载火箭
        formulaList.add( G(
                G(1,"小型运载火箭"),
                6,
                G(2,"戴森球组件"),
                G(4,"氘核燃料棒"),
                G(2,"量子芯片")
        ) );
        formulaList.add( G(
                G(2,"氘核燃料棒"),
                12,
                G(1,"钛合金"),
                G(20,"重氢"),
                G(1,"超级磁场环")
        ) );

        // 矩阵
        formulaList.add( G(
                G(1,"电磁矩阵"),
                3,
                G(1,"磁线圈"),
                G(1,"电路板")
        ) );
        formulaList.add( G(
                G(1,"能量矩阵"),
                6,
                G(2,"高能石墨"),
                G(2,"氢气")
        ) );
        formulaList.add( G(
                G(1,"结构矩阵"),
                8,
                G(1,"金刚石"),
                G(1,"钛晶石")
        ) );
        formulaList.add( G(
                G(1,"信息矩阵"),
                10,
                G(2,"处理器"),
                G(1,"粒子宽带")
        ) );
        formulaList.add( G(
                G(2,"引力矩阵"),
                24,
                G(1,"引力透镜"),
                G(1,"量子芯片")
        ) );
        formulaList.add( G(
                G(1,"宇宙矩阵"),
                15,
                G(1,"电磁矩阵"),
                G(1,"能量矩阵"),
                G(1,"结构矩阵"),
                G(1,"信息矩阵"),
                G(1,"引力矩阵"),
                G(1,"反物质")
        ) );



        return formulaList;
    }

    private static List<Formula> genMid(){
        List<Formula> formulaList = new ArrayList<>();
        formulaList.add( G(
                G(1,"戴森球组件"),
                8,
                G(3,"框架材料"),
                G(3,"太阳帆"),
                G(3,"处理器")
        ) );
        formulaList.add( G(
                G(1,"量子芯片"),
                6,
                G(2,"处理器"),
                G(2,"位面过滤器")
        ) );

        formulaList.add( G(
                G(4,"钛合金"),
                12,
                G(4,"钛块"),
                G(4,"钢材"),
                G(8,"硫酸")
        ) );
        formulaList.add( G(
                G(1,"钢材"),
                3,
                G(3,"铁块")
        ) );
        formulaList.add( G(
                G(1,"超级磁场环"),
                3,
                G(2,"电磁涡轮"),
                G(3,"磁铁"),
                G(1,"高能石墨")
        ) );

        formulaList.add( G(
                G(1,"框架材料"),
                6,
                G(4,"碳纳米管"),
                G(1,"钛合金"),
                G(1,"高纯硅块")
        ) );

        formulaList.add( G(
                G(2,"太阳帆"),
                4,
                G(1,"石墨烯"),
                G(1,"光子合并器")
        ) );

        formulaList.add( G(
                G(1,"位面过滤器"),
                12,
                G(1,"卡西米尔晶体"),
                G(2,"钛化玻璃")
        ) );

        formulaList.add( G(
                G(2,"钛化玻璃"),
                5,
                G(2,"玻璃"),
                G(2,"钛块"),
                G(2,"水")
        ) );

        formulaList.add( G(
                G(1,"粒子宽带"),
                8,
                G(2,"碳纳米管"),
                G(2,"晶格硅"),
                G(1,"塑料")
        ) );

        formulaList.add( G(
                G(1,"奇异物质"),
                8,
                G(2,"粒子容器"),
                G(2,"铁块"),
                G(10,"重氢")
        ) );

        formulaList.add( G(
                G(1,"粒子容器"),
                4,
                G(2,"电磁涡轮"),
                G(2,"铜块"),
                G(2,"石墨烯")
        ) );

        formulaList.add( G(
                G(1,"湮灭约束球"),
                20,
                G(1,"粒子容器"),
                G(1,"处理器")
        ) );

        return formulaList;
    }


    // 石墨烯
    private static List<Formula> gen_石墨烯_1() {
        List<Formula> formulaList = new ArrayList<>();
        formulaList.add( G(
                G(2,"石墨烯"),
                3,
                G(3,"高能石墨"),
                G(1,"硫酸")
        ) );
        return formulaList;
    }


    // 碳纳米管
    private static List<Formula> gen_碳纳米管_1() {
        List<Formula> formulaList = new ArrayList<>();
        formulaList.add( G(
                G(2,"碳纳米管"),
                4,
                G(3,"石墨烯"),
                G(1,"钛块")
        ) );
        return formulaList;
    }
    private static List<Formula> gen_碳纳米管_2() {
        List<Formula> formulaList = new ArrayList<>();
        formulaList.add( G(
                G(2,"碳纳米管"),
                4,
                G(2,"刺笋结晶")
        ) );
        return formulaList;
    }




    // 光子合并器
    private static List<Formula> gen_光子合并器_1() {
        List<Formula> formulaList = new ArrayList<>();
        formulaList.add( G(
                G(1,"光子合并器"),
                3,
                G(2,"棱镜"),
                G(1,"电路板")
        ) );
        return formulaList;
    }
    private static List<Formula> gen_光子合并器_2() {
        List<Formula> formulaList = new ArrayList<>();
        formulaList.add( G(
                G(1,"光子合并器"),
                3,
                G(1,"光栅石"),
                G(1,"电路板")
        ) );
        return formulaList;
    }



    // 卡西米尔晶体
    private static List<Formula> gen_卡西米尔晶体_1() {
        List<Formula> formulaList = new ArrayList<>();
        formulaList.add( G(
                G(1,"卡西米尔晶体"),
                4,
                G(1,"钛晶石"),
                G(2,"石墨烯"),
                G(12,"氢气")
        ) );
        return formulaList;
    }
    private static List<Formula> gen_卡西米尔晶体_2() {
        List<Formula> formulaList = new ArrayList<>();
        formulaList.add( G(
                G(1,"卡西米尔晶体"),
                4,
                G(4,"光栅石"),
                G(2,"石墨烯"),
                G(12,"氢气")
        ) );
        return formulaList;
    }





    private static List<Formula> genLow(){
        List<Formula> formulaList = new ArrayList<>();

        // 处理器
        formulaList.add( G(
                G(1,"处理器"),
                3,
                G(2,"电路板"),
                G(2,"微晶元件")
        ) );
        formulaList.add( G(
                G(2,"电路板"),
                1,
                G(2,"铁块"),
                G(1,"铜块")
        ) );
        formulaList.add( G(
                G(1,"微晶元件"),
                2,
                G(2,"高纯硅块"),
                G(1,"铜块")
        ) );

        // 电磁涡轮
        formulaList.add( G(
                G(1,"电磁涡轮"),
                2,
                G(2,"电动机"),
                G(2,"磁线圈")
        ) );
        formulaList.add( G(
                G(1,"电动机"),
                2,
                G(2,"铁块"),
                G(1,"齿轮"),
                G(1,"磁线圈")
        ) );
        formulaList.add( G(
                G(1,"齿轮"),
                1,
                G(1,"铁块")
        ) );
        formulaList.add( G(
                G(2,"磁线圈"),
                1,
                G(2,"磁铁"),
                G(1,"铜块")
        ) );


        // 棱镜
        formulaList.add( G(
                G(2,"棱镜"),
                2,
                G(3,"玻璃")
        ) );
        formulaList.add( G(
                G(1,"玻璃"),
                2,
                G(2,"石矿")
        ) );

        // 钛晶石
        formulaList.add( G(
                G(1,"钛晶石"),
                4,
                G(1,"有机晶体"),
                G(3,"钛块")
        ) );

        formulaList.add( G(
                G(1,"金刚石"),
                2,
                G(1,"高能石墨")
        ) );

        formulaList.add( G(
                G(1,"晶格硅"),
                2,
                G(1,"高纯硅块")
        ) );

        return formulaList;
    }















}
