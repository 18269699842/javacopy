package com.liwo.app.pro.controller;

import com.liwo.app.core.BaseController;
import com.liwo.app.core.CodeConstants;
import com.liwo.app.core.Response;
import com.liwo.app.pro.model.MyShopModel;
import com.liwo.app.pro.req.*;
import com.liwo.app.pro.service.MyShopService;
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
 * 我的购物车
 * @author chenhuan
 */
@RequestMapping(value="/pro/myShop")
@Controller
public class MyShopController extends BaseController {

    @Autowired
    private MyShopService myShopService;

    /**
     * 购物车列表显示接口
     * 测试地址：http://localhost/app/pro/myShop/list?accountId=15000367804
     * @param param
     * @return
     */
    @RequestMapping(value="list")
    public @ResponseBody String list(@RequestParam Map<String,String> param){
        MyShopReq req = BeanUtil.toBean(MyShopReq.class, param);
        log.info("购物车列表显示接口请求参数:{}",JSONUtils.toJSON(param));
        validate(req);
        Response<List<MyShopModel>> result = new Response<List<MyShopModel>>();
        result.setData(myShopService.queryMyShopModel(req));
        result.setCode(CodeConstants.SUCCESS);
        result.setMsg(getMsg(CodeConstants.SUCCESS));
        log.info("购物车列表显示接口响应结果:{}",JSONUtils.toJSON(result));
        return JSONUtils.toJSON(result);
    }

    /**
     * 购物车添加接口
     * 测试地址：http://localhost/app/pro/myShop/add?accountId=15000367804&csId=0&num=1
     * @param param
     * @return
     */
    @RequestMapping(value="add")
    public @ResponseBody String add(@RequestParam Map<String,String> param){
        log.info("产品分类展示接口请求参数:{}",JSONUtils.toJSON(param));
        MyShopAddReq req = BeanUtil.toBean(MyShopAddReq.class,param);
        validate(req);
        Response result = new Response();
        if(myShopService.addMyShop(req)){
            result.setCode(CodeConstants.SUCCESS);
            result.setMsg(getMsg(CodeConstants.SUCCESS));
        }else{
            result.setCode(CodeConstants.SQL_ERROR);
            result.setMsg(getMsg(CodeConstants.SQL_ERROR));
        }
        log.info("产品分类展示接口响应结果:{}",JSONUtils.toJSON(result));
        return JSONUtils.toJSON(result);
    }

    /**
     * 购物车删除接口
     * 测试地址：http://localhost/app/pro/myShop/delete?accountId=15000367804&msId=9
     * @return
     */
    @RequestMapping(value="delete")
    public @ResponseBody String delete(@RequestParam Map<String,String> param){
        log.info("购物车删除接口请求参数:{}",JSONUtils.toJSON(param));
        MyShopDeleteReq myShopDeleteReq = BeanUtil.toBean(MyShopDeleteReq.class, param);
        validate(myShopDeleteReq);
        Response result = new Response();
        if(myShopService.deleteMyShop(myShopDeleteReq)){
            result.setCode(CodeConstants.SUCCESS);
            result.setMsg(getMsg(CodeConstants.SUCCESS));
        }else{
            result.setCode(CodeConstants.SQL_ERROR);
            result.setMsg(getMsg(CodeConstants.SQL_ERROR));
        }
        log.info("购物车删除接口响应结果:{}",JSONUtils.toJSON(result));
        return JSONUtils.toJSON(result);
    }

    /**
     * 购物车修改接口
     * 测试地址：http://localhost/app/pro/myShop/update?accountId=15000367804&msId=7&num=1
     */
    @RequestMapping(value="update")
    public @ResponseBody String update(@RequestParam Map<String,String> param){
        log.info("购物车修改接口请求参数:{}",JSONUtils.toJSON(param));
        MyShopUpdateReq myShopUpdateReq = BeanUtil.toBean(MyShopUpdateReq.class, param);
        validate(myShopUpdateReq);
        Response result = new Response();
        if(myShopService.updateMyShop(myShopUpdateReq)){
            result.setCode(CodeConstants.SUCCESS);
            result.setMsg(getMsg(CodeConstants.SUCCESS));
        }else{
            result.setCode(CodeConstants.SQL_ERROR);
            result.setMsg(getMsg(CodeConstants.SQL_ERROR));
        }
        log.info("购物车修改接口响应:{}",JSONUtils.toJSON(result));
        return JSONUtils.toJSON(result);
    }
}
