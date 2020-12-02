package com.spring4.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * 编写使用注解被拦截的类
 * Created by chenhuan on 16-4-7.
 */
@Service
public class DemoAnnotationService {
    @Action(name="注解式拦截的add操作")
    public void add(){}
}
