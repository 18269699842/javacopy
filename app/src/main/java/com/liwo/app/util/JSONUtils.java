package com.liwo.app.util;
import org.codehaus.jackson.JsonEncoding;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * java 与 json 互相转换工具类
 * @author Administrator
 *
 */
public class JSONUtils {

    public static Object toObject(String jsonStr,Class cls) {
        String json = jsonStr;

        Object obj = null;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            obj = objectMapper.readValue(
                    json, cls);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }

    public static String toJSON(Object obj){
        ObjectMapper objectMapper = null;
        JsonGenerator jsonGenerator = null;
        String result = "";
        try{
            objectMapper =  new ObjectMapper();
            jsonGenerator = objectMapper.getJsonFactory().createJsonGenerator(System.out, JsonEncoding.UTF8);
            result =  objectMapper.writeValueAsString(obj);
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }
}