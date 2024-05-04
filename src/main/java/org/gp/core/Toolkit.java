package org.gp.core;

import java.util.Arrays;
import java.util.List;

public class Toolkit {

    public static Entity genEntity(double cost, String entity ){
        return new Entity( cost,entity );
    }

    public static Formula genFormula(Entity targetEntity, double costSeconds, Entity... sourceEntityArr ){
        List<Entity> sourceList = Arrays.asList( sourceEntityArr );
        return new Formula( targetEntity,costSeconds,sourceList );
    }

    

}
