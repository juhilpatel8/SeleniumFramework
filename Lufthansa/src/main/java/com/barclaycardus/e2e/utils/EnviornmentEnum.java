package com.barclaycardus.e2e.utils;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Juhil on 3/27/2016.
 */
public enum EnviornmentEnum {
    QA01,QA02,QA03,DEV,DEV01,DEV02,DEV03,LOCALHOST,PRODUCTION;
    public static boolean findByCode(String enviornment)
    {
        List<EnviornmentEnum> enviornmentEnumList= Arrays.asList(EnviornmentEnum.values());
        for(EnviornmentEnum enviornmentEnum:enviornmentEnumList)
        {
            if(enviornmentEnum.name().equalsIgnoreCase(enviornment))
            {
                return  true;
            }
        }
        return false;
    }
    public static String convertToString()
    {
        StringBuilder enviornmentTypes=new StringBuilder();
        List<EnviornmentEnum> enviornmentEnumList=Arrays.asList(EnviornmentEnum.values());
        for(EnviornmentEnum enviornmentEnum:enviornmentEnumList)
        {
            enviornmentTypes.append("\n");
            enviornmentTypes.append(enviornmentEnum.name());
        }
        return enviornmentTypes.toString();
    }
}
