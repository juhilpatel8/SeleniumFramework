package com.barclaycardus.e2e.utils;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.junit.Assert;
import org.apache.commons.configuration.PropertiesConfiguration;

import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Juhil on 3/27/2016.
 */
public class ReadProperties {
    private static ReadProperties readProperties =null;
    private Configuration config;
    private ReadProperties()
    {

    }
    public static ReadProperties init()
    {
        if(readProperties==null)
        {
            readProperties=new ReadProperties();
        }
        return readProperties;
    }
    public String getEnvironmentProperty(String key)
    {
        String propertiesFilePath = Constants.ENVIRONMENT_PROPERTIES_FILE_NAME;
        String envPropertieFilePath=getEnv();
        if(!EnviornmentEnum.findByCode(envPropertieFilePath))
        {
            Assert.fail("unsupported env provided.Please pass one env from the list"+EnviornmentEnum.convertToString());
        }
        if(envPropertieFilePath!=null)
        {
            StringBuilder propertiesFilePathBuilder=new StringBuilder(Constants.ENVIRONMENT_FOLDER+Constants.SLASH);
            propertiesFilePathBuilder.append(envPropertieFilePath.toLowerCase());
            propertiesFilePathBuilder.append(Constants.SLASH+Constants.ENVIRONMENT_PROPERTIES_FILE_NAME);
            propertiesFilePath=propertiesFilePathBuilder.toString();
        }
        String value=null;
        try {
            if (config == null) {
                config = new PropertiesConfiguration(ReadProperties.class.getClassLoader().getResource(propertiesFilePath));

            }
            value=config.getString(key);
        }
        catch (ConfigurationException ce)
        {
            ce.printStackTrace();
        }
            if(value==null)
            {
                return  key;
            }

        return value;
    }

    public static String getApplicationProperty(String key)
    {
        Properties properties=new Properties();
        String propFileName=Constants.APPLICATION_PROPERTIES_FILE_NAME;
//        System.out.println("Propfile"+propFileName);
        try
        {
            InputStream inputStream=ReadProperties.class.getClassLoader().getResourceAsStream(propFileName);
            properties.load(inputStream);
        }
        catch (Exception ee)
        {
            Assert.fail("Failed to find env properties");
        }
        System.out.println("key:"+properties.getProperty(key));
        return properties.getProperty(key);

    }

    public String getEnv() {
        return System.getProperty(Constants.SYSTEM_PROPERTY_ENV)==null ? Constants.DEFAULT_ENV:System.getProperty(Constants.SYSTEM_PROPERTY_ENV);
    }

}
