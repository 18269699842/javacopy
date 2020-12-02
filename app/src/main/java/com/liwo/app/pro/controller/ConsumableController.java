package com.liwo.app.pro.controller;

import com.liwo.app.core.BaseController;
import com.liwo.app.core.CodeConstants;
import com.liwo.app.core.Response;
import com.liwo.app.pro.model.ConsumableDetailModel;
import com.liwo.app.pro.model.ConsumableModel;
import com.liwo.app.pro.req.ConsumableDetailReq;
import com.liwo.app.pro.req.ConsumableReq;
import com.liwo.app.pro.service.ConsumableService;
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
 * 产品controller
 * @author chenhuan
 */
@RequestMapping(value="/pro/consumable")
@Controller
public class ConsumableController extends BaseController {

    @Autowired
    private ConsumableService consumableService;

    /**
     * 产品列表展示接口
     * 测试地址：http://localhost/app/pro/consumable/list?accountId=15000367804&classId=1
     * @param param
     * @return
     */
    @RequestMapping(value="list")
    public @ResponseBody String list(@RequestParam Map<String,String> param){
        log.info("产品分类展示接口请求参数:{}",JSONUtils.toJSON(param));
        ConsumableReq req = BeanUtil.toBean(ConsumableReq.class, param);
        validate(req);
        Response<List<ConsumableModel>> result = new Response<List<ConsumableModel>>();
        result.setData(consumableService.queryConsumableList(req));
        result.setCode(CodeConstants.SUCCESS);
        result.setMsg(getMsg(CodeConstants.SUCCESS));
        log.info("产品分类展示接口响应结果:{}",JSONUtils.toJSON(result));
        return JSONUtils.toJSON(result);
    }

    /**
     * 产品明细信息接口
     * 测试地址：http://localhost/app/pro/consumable/detail?cId=1&accountId=15000367804
     * @return
     */
    @RequestMapping(value="detail")
    public @ResponseBody String detail(@RequestParam Map<String,String> param){
        log.info("产品明细信息接口请求参数:{}",JSONUtils.toJSON(param));
        ConsumableDetailReq req = BeanUtil.toBean(ConsumableDetailReq.class, param);
        validate(req);
        Response<ConsumableDetailModel> result = new Response<ConsumableDetailModel>();
        result.setData(consumableService.queryConsumableDetailModel(req.getCid()));
        result.setCode(CodeConstants.SUCCESS);
        result.setMsg(getMsg(CodeConstants.SUCCESS));
        log.info("产品明细信息接口响应结果:{}",JSONUtils.toJSON(result));
        return JSONUtils.toJSON(result);
    }
}
