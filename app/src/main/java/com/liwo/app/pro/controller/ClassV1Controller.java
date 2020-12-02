package com.liwo.app.pro.controller;

import com.liwo.app.core.*;
import com.liwo.app.pro.model.ClassV1Model;
import com.liwo.app.pro.service.ClassV1Service;
import com.liwo.app.util.BeanUtil;
import com.liwo.app.util.JSONUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * 产品分类展示接口
 * Created by chenhuan on 15-9-13.
 */
@Controller
@RequestMapping("/pro/classv1")
public class ClassV1Controller extends BaseController {

    @Autowired
    private ClassV1Service classV1Service;

    /**
     * 产品分类展示接口
     * 测试地址：http://localhost/app/pro/classv1/list?accountId=15000367804
     * @param param
     * @return
     */
    @RequestMapping("list")
    public @ResponseBody String list(@RequestParam Map<String,String> param){
        log.info("产品分类展示接口请求参数:{}",JSONUtils.toJSON(param));
        BaseReq req = BeanUtil.toBean(BaseReq.class,param);
        Response<List<ClassV1Model>> result = new Response<List<ClassV1Model>>();
        validate(req);
        result.setData(classV1Service.queryClassV1());
        result.setCode(CodeConstants.SUCCESS);
        result.setMsg(getMsg(CodeConstants.SUCCESS));
        log.info("产品分类展示接口响应结果:{}",JSONUtils.toJSON(result));
        return JSONUtils.toJSON(result);
    }

}
