package com.liwo.app.test.dao;

import com.liwo.app.test.model.TestModel;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by chenhuan on 15-9-12.
 */
@Component
public class TestDao {
    @Resource(name="sqlSessionTemplate")
    private SqlSessionTemplate sqlSessionTemplate;

    public List<TestModel> queryTestModel(TestModel testModel){
        return sqlSessionTemplate.selectList("com.liwo.app.test.dao.TestDao.queryTestModel",testModel);
    }
}
