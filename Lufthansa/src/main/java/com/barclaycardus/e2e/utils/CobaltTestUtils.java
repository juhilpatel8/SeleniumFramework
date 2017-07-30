package com.barclaycardus.e2e.utils;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by Juhil on 3/27/2016.
 */
public class CobaltTestUtils {
    public static String getRandomMI()
    {
        char[] alphNum="ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        Random rnd=new Random();
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<2;i++)
        {
            sb.append(alphNum[rnd.nextInt(alphNum.length)]);
        }
        String mi=sb.toString();
        return mi;
    }

    public static String getRandomEmailID()
    {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        return  "username"+ randomInt +"@gmail.com";

    }

    public static StringBuilder prettifyObject(Object o , String... excludeArray)
    {
        if(o==null)
        {
            return new StringBuilder();
        }
        Field fields[]=o.getClass().getDeclaredFields();
        StringBuilder resultsBuilder= new StringBuilder("{");
        for(int i=0;i<fields.length; i++)
        {
            Field field=fields[i];
            try
            {
                field.setAccessible(true);
                if(Arrays.asList(excludeArray).contains(field.getName()))
                {
                    continue;
                }
                if(field.get(o) != null)
                {
                    resultsBuilder.append("\""+field.getName()+"\""+":"+"\""+field.get(o).toString()+"\""+",");
                }
            }
            catch (IllegalAccessException e)
            {
                e.printStackTrace();
            }

        }
        resultsBuilder.append("}");
        return resultsBuilder;
    }
}
