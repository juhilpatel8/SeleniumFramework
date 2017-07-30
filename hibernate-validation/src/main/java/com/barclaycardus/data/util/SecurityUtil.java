package com.barclaycardus.data.util;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.properties.EncryptableProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by Juhil on 7/28/2017.
 */
@Component
public class SecurityUtil {

    @Autowired
    StandardPBEStringEncryptor encryptor;

    public String decryptPassword(String passwordKey) throws Exception
    {
        if(StringUtils.isEmpty(passwordKey))
        {
            throw new Exception("Password key can not be empty, please pass the valid property key for password");
        }
        String decryptPassword=null;
        try{
            Properties props=new EncryptableProperties(encryptor);
            props.load(this.getClass().getClassLoader().getResourceAsStream(DataConstants.DB_PROPS_FILE));

            decryptPassword=props.getProperty(passwordKey);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return decryptPassword;
    }
}
