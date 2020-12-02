package com.liwo.app.test.controller;

import com.liwo.app.test.model.TestModel;
import com.liwo.app.test.service.TestService;
import com.liwo.app.util.JSONUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by chenhuan on 15-9-12.
 */
@Controller
@RequestMapping("/test")
public class TestController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private TestService testService;

    @RequestMapping(value="queryTest")
    public @ResponseBody String queryTest(){
        TestModel param = new TestModel();
        List<TestModel> testList = testService.queryTestModel(param);
        for(TestModel testModel:testList){
            log.info("testModel:{}",JSONUtils.toJSON(testModel));
        }

        return JSONUtils.toJSON(testList);
    }
}
