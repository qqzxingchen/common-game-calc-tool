package org.gp.service.satisfactory;


import org.gp.formula.satisfactory.update08.SatisfactorioFormula_FinalProduct_V0_273254;
import org.gp.formula.satisfactory.update08.SatisfactorioFormula_NuclearEnergy_V0_273254;

import java.util.HashMap;

import static org.gp.service.FormulaServiceToolkit.calc;

public class SatisfactorioFormulaService {



    public static void main(String[] args){
        // printNuclearCost();

        printFinalProductCost();
    }

    private static void printNuclearCost(){
        calc(new SatisfactorioFormula_NuclearEnergy_V0_273254(),"钚燃料棒",2);
    }

    private static void printFinalProductCost(){
        calc(   new SatisfactorioFormula_FinalProduct_V0_273254(),
                new HashMap<String, Double>(){{
                    put("组装编导系统",4.0);
                    put("磁场发生器",4.0);
                    put("热推进火箭",1.0);
                    put("核子团",1.0);
                }}
                ,"镀铝板","铝制外壳","电池","铜粉"
        );
    }

}
