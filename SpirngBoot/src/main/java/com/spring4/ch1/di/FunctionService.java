package com.spring4.ch1.di;

import org.springframework.stereotype.Service;

/**
 * Created by chenhuan on 16-4-7.
 */
@Service
public class FunctionService {
    public String sayHello(String word){
        return "Hello "+word+"!";
    }

}
