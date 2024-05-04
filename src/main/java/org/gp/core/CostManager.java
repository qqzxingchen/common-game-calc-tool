package org.gp.core;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CostManager {

    /**
     * 计算一个目标资源需要的基本资源个数
     * */
    public static List<Tuple3<Integer,String, Double>> calcSplitCost(
            Map<String, Double> targetEntityMap,
            List<Formula> formulaList,
            List<String> ignoredFormula
    ){
        ignoredFormula = (ignoredFormula == null) ? new ArrayList<>() : ignoredFormula;
        Map<String, Formula> entityAndFormulaMap = genFormulaMap(formulaList);
        if ( entityAndFormulaMap.isEmpty() ){
            System.out.println( "配方为空" );
            return new ArrayList<>();
        }
        for ( String entityStr : targetEntityMap.keySet() ){
            if ( !entityAndFormulaMap.containsKey( entityStr ) ){
                System.out.println( String.format(
                        "无法找到 %s 的配方",
                        entityStr
                ) );
                return new ArrayList<>();
            }
        }

        List<Tuple3<Integer,String, Double>> resultList = new ArrayList<>();
        for ( String curTarget : targetEntityMap.keySet() ){
            resultList.add( new Tuple3<>(0,curTarget,targetEntityMap.get(curTarget)) );
            realCalcSplitCost(resultList,
                    0,curTarget,targetEntityMap.get(curTarget),
                    entityAndFormulaMap,ignoredFormula);
        }

        return resultList;
    }

    private static void realCalcSplitCost(
            List<Tuple3<Integer,String, Double>> resultList,
            int level,
            String targetEntity,
            Double targetCount,
            Map<String, Formula> entityAndFormulaMap,
            List<String> ignoredFormula){
        if ( ignoredFormula.contains(targetEntity) ){
            return;
        }
        Formula formula = entityAndFormulaMap.get(targetEntity);
        for ( Entity curEntity : formula.getSourceEntity() ){
            int newLevel = level + 1;
            double value = targetCount * curEntity.getCount() / formula.getTargetEntity().getCount();

            resultList.add( new Tuple3<>(newLevel,curEntity.getEntity(),value) );
            if ( entityAndFormulaMap.containsKey(curEntity.getEntity()) ){
                realCalcSplitCost(resultList,
                        newLevel, curEntity.getEntity(), value,
                        entityAndFormulaMap,ignoredFormula);
            }
        }

    }


    /**
     * 计算一个目标资源需要的基本资源个数
     * */
    public static Map<String, Double> calcTotalCost(
            Map<String, Double> targetEntityMap,
            List<Formula> formulaList,
            List<String> ignoredFormula
    ){
        ignoredFormula = (ignoredFormula == null) ? new ArrayList<>() : ignoredFormula;
        Map<String, Formula> entityAndFormulaMap = genFormulaMap(formulaList);
        if ( entityAndFormulaMap.isEmpty() ){
            System.out.println( "配方为空" );
            return new HashMap<>();
        }
        for ( String entityStr : targetEntityMap.keySet() ){
            if ( !entityAndFormulaMap.containsKey( entityStr ) ){
                System.out.println( String.format(
                        "无法找到 %s 的配方",
                        entityStr
                ) );
                return new HashMap<>();
            }
        }

        while (true){
            boolean isChanged = realTotalCalc(targetEntityMap, entityAndFormulaMap,ignoredFormula);
            if ( !isChanged ){
                break;
            }
        }
        return targetEntityMap;
    }

    /**
     * 返回值：
     *      Boolean:                本轮迭代，是否有更新
     *      Map<String,Integer>:    返回结果
     * */
    private static boolean realTotalCalc(
            Map<String, Double> targetEntityMap,
            Map<String, Formula> entityAndFormulaMap,
            List<String> ignoredFormula
    ){
        boolean isChanged = false;
        List<String> entityStrList = new ArrayList<>(targetEntityMap.keySet());
        for ( String curTarget : entityStrList ){
            // 如果它属于忽略的合成、或者无配方，则直接跳过
            if ( ignoredFormula.contains( curTarget ) || !entityAndFormulaMap.containsKey( curTarget ) ){
                continue;
            }

            isChanged = true;
            Double count = targetEntityMap.get( curTarget );
            Formula curFormula = entityAndFormulaMap.get( curTarget );

            for (Entity curSourceEntity : curFormula.getSourceEntity()){
                String key = curSourceEntity.getEntity();
                double value = count * curSourceEntity.getCount() / curFormula.getTargetEntity().getCount();
                targetEntityMap.put(
                        key,
                        value + targetEntityMap.getOrDefault( key,0.0 )
                );
            }
            targetEntityMap.remove( curTarget );
        }
        return isChanged;
    }













    private static Map<String, Formula> genFormulaMap(List<Formula> formulaList ){
        Map<String, Formula> map = new HashMap<>();
        for ( Formula ff : formulaList ){
            map.put( ff.getTargetEntity().getEntity(),ff );
        }
        return map;
    }

}
