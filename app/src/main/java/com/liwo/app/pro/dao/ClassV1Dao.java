package com.liwo.app.pro.dao;

import com.liwo.app.pro.model.ClassV1Model;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by chenhuan on 15-9-13.
 */
@Component
public class ClassV1Dao {

    @Resource(name="sqlSessionTemplate")
    private SqlSessionTemplate sqlSessionTemplate;

    public List<ClassV1Model> queryClassV1(){
        return sqlSessionTemplate.selectList("com.liwo.app.pro.dao.ClassV1Dao.queryClassV1",null);
    }
}
