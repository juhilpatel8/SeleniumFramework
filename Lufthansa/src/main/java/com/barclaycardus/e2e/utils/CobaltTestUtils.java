package com.barclaycardus.e2e.utils;

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
}
