package org.gp.core;


import java.util.List;
import java.util.Map;

public abstract class AbsFormulaManager {

    public abstract List<Formula> getFormula();


    public List<Tuple3<Integer, String, Double>> calcSplitCost(Map<String,Double> target, List<String> ignoredFormula ){
        return CostManager.calcSplitCost( target, getFormula(), ignoredFormula );
    }
    public Map<String,Double> calcTotalCost(Map<String,Double> target, List<String> ignoredFormula ){
        return CostManager.calcTotalCost( target, getFormula(), ignoredFormula );
    }


    public static Entity G(double count, String entity ){
        return Toolkit.genEntity(count, entity);
    }
    public static Formula G(Entity targetEntity, double costSeconds, Entity... sourceEntityArr ){
        return Toolkit.genFormula(targetEntity,costSeconds,sourceEntityArr);
    }
    public static Formula G(Entity targetEntity, Entity... sourceEntityArr ){
        return Toolkit.genFormula(targetEntity,0,sourceEntityArr);
    }



}
