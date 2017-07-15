package com.barclaycardus.e2e.utils;

import org.springframework.core.io.ClassPathResource;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Juhil on 3/27/2016.
 */
public class JsonFileReader {
    public String readFile(String jsonFileName,String folderName)
    {
        BufferedReader bufferedReader=null;
        StringBuilder stringBuilder=new StringBuilder();
        try {
            String sCurrentLine;
            bufferedReader=new BufferedReader(new FileReader("src/main/resources/"+folderName+"/data/"+jsonFileName+".json"));
            while ((sCurrentLine=bufferedReader.readLine()) != null)
            {
                stringBuilder.append(sCurrentLine);
            }
        } catch (IOException e) {
            System.out.println("Error occured while reading the file"+e.getMessage());
        }
        finally {
            if(bufferedReader!=null)
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
        return stringBuilder.toString();
    }

    public String readFile(String jsonFileNamWithExtension,String folderName,String dataSchemaFolder)
    {
        BufferedReader bufferedReader=null;
        StringBuilder stringBuilder=new StringBuilder();
        try {
            String sCurrentLine;
            ClassPathResource classPathResource=new ClassPathResource(folderName+"/"+dataSchemaFolder+"/"+jsonFileNamWithExtension);
            bufferedReader=new BufferedReader(new FileReader(classPathResource.getFile()));
            while ((sCurrentLine=bufferedReader.readLine()) != null)
            {
                stringBuilder.append(sCurrentLine);
            }
        } catch (IOException e) {
            System.out.println("Error occured while reading the file"+e.getMessage());
        }
        finally {
            if(bufferedReader!=null)
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
        return stringBuilder.toString();
    }
}
