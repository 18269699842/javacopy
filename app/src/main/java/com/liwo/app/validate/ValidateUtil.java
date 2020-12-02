package com.liwo.app.validate;


import com.liwo.app.util.StringUtils;

/**
 * 校验工具类
 * @author  chenhuan on 15-10-6.
 */
public class ValidateUtil {
    /**
     * 校验不能为空
     * @param param
     * @param msg
     */
    public static void isNotEmpty(String param,String msg){
        if(StringUtils.isEmpty(param)){
            throw new ValidateException(msg);
        }
    }
}
