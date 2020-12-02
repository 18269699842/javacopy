package com.spring4.ch2.prepost;

/**
 *
 * Created by chenhuan on 16-4-10.
 */
public class BeanWayService {
    public void init(){
        System.out.println("@Bean-init-method");
    }

    public BeanWayService(){
        super();
        System.out.println("初始化构造函数-BeanWayService");
    }

    public void destroy(){
        System.out.println("@bean-destory-method");
    }
}
