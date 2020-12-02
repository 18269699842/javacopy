package com.spring4.ch1.javaconfig;

import org.springframework.stereotype.Service;

/**
 * Created by chenhuan on 16-4-7.
 */
public class FunctionService {
    public String sayHello(String word){
        return "Hello "+word+"!";
    }

}
