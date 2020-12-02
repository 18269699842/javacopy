package com.spring4.ch1.aop;

import java.lang.annotation.*;

/**
 * Created by chenhuan on 16-4-7.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
        String name();
}
