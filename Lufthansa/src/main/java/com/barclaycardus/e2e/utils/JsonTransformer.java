package com.barclaycardus.e2e.utils;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * Created by Juhil on 3/27/2016.
 */
public class JsonTransformer {
    private ObjectMapper objectMapper;

    private static JsonTransformer jsonTransformer;
    private JsonFileReader jsonFileReader = new JsonFileReader();

    public JsonTransformer() {
        if (objectMapper == null) {
            this.objectMapper = new ObjectMapper();
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        }
    }

    public static JsonTransformer getInstance() {
        if (jsonTransformer == null) {
            jsonTransformer = new JsonTransformer();
        }
        return jsonTransformer;
    }

    public Object transformFromJsonString(String jsonString, Class className) {
        Object object = null;
        try {
            object = objectMapper.readValue(jsonString, className);
        } catch (IOException e) {
            e.printStackTrace();
        }
            return object;

    }
    public Object transformToJsonString(Object jsonObject) {
        String object = null;
        try {
            object = objectMapper.writeValueAsString(jsonObject);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return object;
    }

    public Object transformFromJson(String jsonFileName,Class className,String folderName,String dataSchemaFolder) {
        Object object = null;
        try {
            object = objectMapper.readValue(jsonFileReader.readFile(jsonFileName, folderName,dataSchemaFolder),className);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return object;
    }
    public Object transformFromJson(String jsonFileName,Class className,String folderName) {
        Object object = null;
        try {
            object = objectMapper.readValue(jsonFileReader.readFile(jsonFileName, folderName),className);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return object;
    }
}