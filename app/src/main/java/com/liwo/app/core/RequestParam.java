package com.liwo.app.core;

import java.lang.annotation.*;

/**
 * 请求参数注解
 * Created by chenhuan on 15-10-6.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RequestParam {
    public String value();
}
