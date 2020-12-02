package com.liwo.app.pro.service;

import com.liwo.app.pro.dao.ClassV1Dao;
import com.liwo.app.pro.model.ClassV1Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by chenhuan on 15-9-13.
 */
@Service
public class ClassV1Service {
    @Autowired
    private ClassV1Dao classV1Dao;

    public List<ClassV1Model> queryClassV1(){
        return classV1Dao.queryClassV1();
    }

}
