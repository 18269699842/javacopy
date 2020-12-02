package com.liwo.app.test.service;

import com.liwo.app.test.dao.TestDao;
import com.liwo.app.test.model.TestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by chenhuan on 15-9-12.
 */
@Service
public class TestService {
    @Autowired
    private TestDao testDao;

    public List<TestModel> queryTestModel(TestModel testModel){
        return testDao.queryTestModel(testModel);
    }
}
