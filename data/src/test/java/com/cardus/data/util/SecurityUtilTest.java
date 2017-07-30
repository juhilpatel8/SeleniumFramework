package test.java.com.cardus.data.util;

import main.java.com.cardus.data.Application;
import main.java.com.cardus.data.util.SecurityUtil;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Juhil on 7/28/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= Application.class, loader= SpringApplicationContextLoader.class)
public class SecurityUtilTest {

    @Autowired
    StandardPBEStringEncryptor encryptor;

    @Autowired
    SecurityUtil securityUtil;

    @Test
    public void testEncrypt()
    {
//        String encryptedPasswd=encryptor.encrypt("<yourpasswordgoeshere>");

        String encryptedPasswd=encryptor.encrypt("Wishtree$1");

        encryptedPasswd="ENC("+encryptedPasswd+")";

        System.out.println("Copy and Paste this passowrd in properties file::"+encryptedPasswd);
    }

}
