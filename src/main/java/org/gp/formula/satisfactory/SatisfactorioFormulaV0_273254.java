package org.gp.formula.satisfactory;

import org.gp.core.AbsFormulaManager;
import org.gp.core.Formula;

import java.util.ArrayList;
import java.util.List;

public class SatisfactorioFormulaV0_273254 extends AbsFormulaManager {

    @Override
    public List<Formula> getFormula() {
        List<Formula> formulaList = new ArrayList<>();
        formulaList.addAll( gen钚燃料() );
        formulaList.addAll( gen铀燃料() );
        formulaList.addAll( gen铝() );
        formulaList.addAll( genMiddle() );
        formulaList.addAll( genLow() );
        return formulaList;
    }

    private static List<Formula> gen钚燃料(){
        List<Formula> formulaList = new ArrayList<>();
        formulaList.add(G(
                G(1,"钚燃料棒"),
                0,
                G(30,"钚核芯"),
                G(18,"钢梁"),
                G(6,"电磁控制杆"),
                G(10,"散热器")
        ));
        formulaList.add(G(
                G(1,"钚核芯"),
                0,
                G(2,"钚丸"),
                G(4,"混凝土")
        ));
        formulaList.add(G(
                G(30,"钚丸"),
                0,
                G(25,"铀"),
                G(50,"铀废料"),
                G(15,"硝酸"),
                G(25,"硫酸")
        ));

        return formulaList;
    }

    private static List<Formula> gen铀燃料(){
        List<Formula> formulaList = new ArrayList<>();
        formulaList.add(G(
                G(50,"铀废料"),
                0,
                G(1,"铀燃料棒")
        ));
        formulaList.add(G(
                G(1,"铀燃料棒"),
                0,
                G(50,"铀核芯"),
                G(3,"钢筋混凝土梁"),
                G(5,"电磁控制杆")
        ));
        formulaList.add(G(
                G(5,"铀核芯"),
                0,
                G(10,"铀"),
                G(3,"混凝土"),
                G(6,"硫酸")
        ));
        formulaList.add(G(
                G(2,"电磁控制杆"),
                0,
                G(3,"定子"),
                G(2,"AI限制器")
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

        formulaList.add(G( G(1,"铜板"), 0,   G(2,"铜锭") ));
        formulaList.add(G( G(5,"快速线"), 0, G(1,"钦锭") ));

        formulaList.add(G( G(1,"钢梁"), 0,   G(4,"钢锭") ));
        formulaList.add(G( G(2,"钢管"), 0,   G(3,"钢锭") ));
        formulaList.add(G( G(3,"钢锭"), 0,   G(2,"铁锭"),G(2,"煤") ));
        formulaList.add(G( G(2,"铁板"), 0,   G(3,"铁锭") ));

        formulaList.add(G( G(9,"电线"), 0,   G(5,"铁锭") ));

        formulaList.add(G( G(4,"混凝土"), 0, G(6,"石灰石"),G(5,"水") ));

        return formulaList;
    }


}
