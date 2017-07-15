package com.barclaycardus.e2e.utils;

/**
 * Created by Juhil on 3/27/2016.
 */
public class CucumberUtils {

    public static String getJourneyType()
    {
        return (ReadProperties.init()).getApplicationProperty("journey");
    }
}
