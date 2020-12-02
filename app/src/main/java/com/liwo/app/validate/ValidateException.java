package com.liwo.app.validate;

/**
 * 参数校验异常
 * Created by chenhuan on 15-9-22.
 */
public class ValidateException extends RuntimeException {
    public ValidateException(String message){
        super(message);
    }
}
