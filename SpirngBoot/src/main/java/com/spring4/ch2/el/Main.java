package com.spring4.ch2.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by chenhuan on 16-4-9.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig elConfig =  context.getBean(ElConfig.class);
        elConfig.outputResource();
        context.close();
    }
}
