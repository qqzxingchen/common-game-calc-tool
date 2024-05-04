package org.gp.formula.satisfactory.update08;

import org.gp.core.AbsFormulaManager;
import org.gp.core.Formula;

import java.util.ArrayList;
import java.util.List;

public class SatisfactorioFormula_FinalProduct_V0_273254 extends AbsFormulaManager {

    @Override
    public List<Formula> getFormula() {
        List<Formula> formulaList = new ArrayList<>();
        formulaList.addAll( gen核子团() );
        formulaList.addAll( gen重型模块化框架() );
        formulaList.addAll( gen铝() );
        formulaList.addAll( genMiddle() );
        formulaList.addAll( genLow() );
        return formulaList;
    }

    private static List<Formula> gen核子团(){
        List<Formula> formulaList = new ArrayList<>();
        formulaList.add(G(
                G(1,"核子团"),
                0,
                G(1,"压力转换立方体"),
                G(200,"铜粉")
        ));

        formulaList.add(G(
                G(1,"压力转换立方体"),
                0,
                G(1,"熔合模块化框架"),
                G(2,"无线电控制单元")
        ));
        formulaList.add(G(
                G(1,"熔合模块化框架"),
                0,
                G(1,"重型模块化框架"),
                G(50,"铝制外壳"),
                G(25,"氮气")
        ));

        return formulaList;
    }

    private static List<Formula> gen无线电控制单元() {
        List<Formula> formulaList = new ArrayList<>();

        formulaList.add(G(
                G(1,"无线电控制单元"),
                0,
                G(4,"散热器"),
                G(2,"高速连接器"),
                G(12,"石英晶体")
        ));
        formulaList.add(G(
                G(1,"高速连接器"),
                0,
                G(56,"快速线"),
                G(10,"电缆"),
                G(1,"电路板")
        ));

        return formulaList;
    }

    private static List<Formula> gen重型模块化框架() {
        List<Formula> formulaList = new ArrayList<>();

        formulaList.add(G(
                G(3,"重型模块化框架"),
                0,
                G(8,"模块化框架"),
                G(10,"钢筋混凝土梁"),
                G(36,"钢管"),
                G(22,"混凝土")
        ));
        formulaList.add(G(
                G(2,"模块化框架"),
                0,
                G(3,"加强铁板"),
                G(12,"铁棒")
        ));
        formulaList.add(G(
                G(3,"加强铁板"),
                0,
                G(18,"铁板"),
                G(50,"螺丝")
        ));

        return formulaList;
    }

    private static List<Formula> gen铝(){
        List<Formula> formulaList = new ArrayList<>();

        formulaList.add(G(
                G(4,"电池"),
                0,
                G(6,"硫"),
                G(7,"镀铝板"),
                G(8,"塑料"),
                G(12,"电线")
        ));
        formulaList.add(G(
                G(3,"镀铝板"),
                0,
                G(3,"铝锭"),
                G(1,"铜锭")
        ));
        formulaList.add(G(
                G(1,"铝锭"),
                0,
                G(2,"铝块")
        ));
        formulaList.add(G(
                G(30,"铝块"),
                0,
                G(15,"铝土矿"),
                G(10,"煤"),
                G(5,"硫酸"),
                G(6,"水")
        ));
        return formulaList;
    }

    private static List<Formula> genMiddle(){
        List<Formula> formulaList = new ArrayList<>();

        formulaList.add(G(
                G(2,"电磁控制杆"),
                0,
                G(3,"定子"),
                G(2,"AI限制器")
        ));
        formulaList.add(G(
                G(1,"定子"),
                0,
                G(3,"钢管"),
                G(8,"电线")
        ));
        formulaList.add(G(
                G(1,"AI限制器"),
                0,
                G(5,"铜板"),
                G(20,"快速线")
        ));
        formulaList.add(G(
                G(1,"钢筋混凝土梁"),
                0,
                G(7,"钢管"),
                G(5,"混凝土")
        ));
        formulaList.add(G(
                G(1,"散热器"),
                0,
                G(5,"镀铝板"),
                G(3,"铜板")
        ));
        formulaList.add(G(
                G(3,"硝酸"),
                0,
                G(12,"氮气"),
                G(3,"水"),
                G(1,"铁板")
        ));

        return formulaList;
    }

    private static List<Formula> genLow(){
        List<Formula> formulaList = new ArrayList<>();

        formulaList.add(G( G(1,"铜板"), 0,  G(2,"铜锭") ));
        formulaList.add(G( G(5,"铜粉"), 0,  G(30,"铜锭")));

        formulaList.add(G( G(5,"快速线"), 0, G(1,"钦锭") ));

        formulaList.add(G( G(1,"钢梁"), 0,   G(4,"钢锭") ));
        formulaList.add(G( G(2,"钢管"), 0,   G(3,"钢锭") ));

        formulaList.add(G( G(1,"铁棒"), 0,   G(1,"铁锭") ));
        formulaList.add(G( G(20,"螺丝"), 0,   G(5,"铁锭") ));
        formulaList.add(G( G(9,"电线"), 0,   G(5,"铁锭") ));
        formulaList.add(G( G(2,"铁板"), 0,   G(3,"铁锭") ));
        formulaList.add(G( G(3,"钢锭"), 0,   G(2,"铁锭"),G(2,"煤") ));

        formulaList.add(G( G(1,"混凝土"), 0, G(3,"石灰石") ));

        formulaList.add(G( G(3,"石英晶体"), 0, G(5,"原石英") ));


        return formulaList;
    }


}
