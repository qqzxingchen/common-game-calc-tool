package org.gp.service.factorio;

import org.gp.core.AbsFormulaManager;
import org.gp.formula.factorio.FactorioFormulaV0_17;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FactorioFormulaService {

    private static void calc( String targetEntity,String ... specialEntity ){
        AbsFormulaManager manager = new FactorioFormulaV0_17();

        Map<String, Double> costMap = manager.calcTotalCost(
                new HashMap<String, Double>() {{
                    put(targetEntity, 1.0);
                }},
                Arrays.asList( specialEntity )
        );
        for ( String entity : specialEntity ){
            System.out.println( String.format(
                    "special %s: \t%s",
                    entity,costMap.get( entity )
            ) );
        }
        System.out.println( "\n\n\n" );
        printCost( costMap );
    }




    public static void main(String[] args){
        calc("生产研究");
    }



    private static void printCost(Map<String, Double> costMap){
        for ( String key : costMap.keySet() ){
            System.out.println( String.format("%s: \t%s",key,costMap.get( key )) );
        }
    }
}
