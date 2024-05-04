package org.gp.service.satisfactory;

import org.gp.core.AbsFormulaManager;
import org.gp.core.Tuple3;
import org.gp.formula.satisfactory.SatisfactorioFormulaV0_273254;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SatisfactorioFormulaService {


    private static void calc( String targetEntity,double targetCount,String ... specialEntity ){
        calc( new HashMap<String, Double>() {{
            put(targetEntity, targetCount);
        }},specialEntity );
    }
    private static void calc( HashMap<String, Double> targetMap,String ... specialEntity ){
        AbsFormulaManager manager = new SatisfactorioFormulaV0_273254();

        printSplitCost( manager,targetMap,Arrays.asList(specialEntity) );
        printTotalCost( manager,targetMap,Arrays.asList(specialEntity) );
    }


    private static void printTotalCost(AbsFormulaManager manager,HashMap<String, Double> targetMap,List<String> specialEntityList){
        Map<String, Double> totalCostMap = manager.calcTotalCost(targetMap, specialEntityList);
        for ( String entity : specialEntityList ){
            System.out.println( String.format(
                    "special %s: \t%s",
                    entity,totalCostMap.get( entity )
            ) );
        }
        for ( String key : totalCostMap.keySet() ){
            System.out.println( String.format("%s: \t%s",key,totalCostMap.get( key )) );
        }
        System.out.println( "\n\n" );
    }
    private static void printSplitCost(AbsFormulaManager manager,HashMap<String, Double> targetMap,List<String> specialEntityList){
        List<Tuple3<Integer, String, Double>> splitCostList = manager.calcSplitCost(targetMap, specialEntityList);

        Map<String,Double> specialCountMap = new HashMap<>();
        for ( Tuple3<Integer,String,Double> tuple3 : splitCostList ){
            if ( specialEntityList.contains(tuple3.getC2()) ){
                if ( !specialCountMap.containsKey(tuple3.getC2()) ){
                    specialCountMap.put( tuple3.getC2(),0.0 );
                }
                specialCountMap.put( tuple3.getC2(),specialCountMap.get(tuple3.getC2())+tuple3.getC3() );
            }
        }
        for ( String specialEntity : specialCountMap.keySet() ){
            System.out.println( String.format("special %s: \t%s", specialEntity,specialCountMap.get(specialEntity)) );
        }


        for ( Tuple3<Integer,String,Double> tuple3 : splitCostList ){
            System.out.println( String.format(
                    "%s%s: \t%s",
                    genCountSpace(tuple3.getC1()*2), tuple3.getC2(),tuple3.getC3()
            ) );
        }
        System.out.println( "\n\n" );
    }


    public static void main(String[] args){
        calc("钚燃料棒",2,
                "散热器","电磁控制杆", "混凝土", "钢筋混凝土梁","钢梁", "铁板",
                "铀废料",
                "硫酸"
        );

//        calc(new HashMap<String, Double>(){{
////            put("钚燃料棒",2.0);
//            put("电池",60.0);
//        }});


//        calc("混凝土",420);
    }






    private static String genCountSpace(int count){
        StringBuffer sb = new StringBuffer();
        for ( int i = 0 ; i < count ; i ++ ){
            sb.append(" ");
        }
        return sb.toString();
    }
}
