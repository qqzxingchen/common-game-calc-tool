package org.gp.service.dyson;

import org.gp.core.AbsFormulaManager;
import org.gp.formula.dyson.DysonFormulaV0_8_22;

import java.util.*;

public class DysonFormulaService {

    private static void calc( String targetEntity,Double targetCount,String ... specialEntity ){
        AbsFormulaManager manager = new DysonFormulaV0_8_22();

        Map<String, Double> costMap = manager.calcTotalCost(
                new HashMap<String, Double>() {{
                    put(targetEntity, targetCount);
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

    private static void calcMatrix( String ... specialEntity ){
        AbsFormulaManager manager = new DysonFormulaV0_8_22();

        Map<String, Double> costMap = manager.calcTotalCost(
                new HashMap<String, Double>() {{
                    put("宇宙矩阵",1.0);
//                    put("引力矩阵",0.1);
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

    private static void calcMatrix2( Double matrixCount,String ... specialEntity ){
        AbsFormulaManager manager = new DysonFormulaV0_8_22();

        Map<String, Double> costMap = manager.calcTotalCost(
                new HashMap<String, Double>() {{
                    put("能量矩阵",matrixCount);
                    put("信息矩阵",matrixCount);
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
//        calcMatrix("电磁涡轮","碳纳米管","塑料","处理器","卡西米尔晶体");
//
//        calc("引力透镜",32*1.0,"电磁涡轮","石墨烯");

//        calcMatrix2(12.0,"碳纳米管","处理器");

        calc("电磁矩阵",72*1.0);
    }



    private static void printCost(Map<String, Double> costMap){
        ArrayList<Map.Entry<String, Double>> list = new ArrayList<>(costMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String,Double>>() {
            @Override
            public int compare(Map.Entry<String,Double> o1, Map.Entry<String,Double> o2) {
                return o1.getValue().compareTo( o2.getValue() );
            }
        });



        for ( Map.Entry<String,Double> entry : list ){
            System.out.println( String.format("%s: \t%s",entry.getKey(),entry.getValue()) );
        }
    }
}
