package com.liwo.app.user.controller;

import com.liwo.app.core.BaseController;
import com.liwo.app.core.CodeConstants;
import com.liwo.app.user.model.AddressModel;
import com.liwo.app.user.req.AddressAddReq;
import com.liwo.app.user.req.AddressListReq;
import com.liwo.app.user.req.AddressModifyReq;
import com.liwo.app.user.req.AddressRemoveReq;
import com.liwo.app.user.res.AddressRes;
import com.liwo.app.user.service.AddressService;
import com.liwo.app.util.JSONUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户收货地址相关请求
 * Created by qinzhen on 2015/9/19.
 */
@Controller
@RequestMapping("/user/address")
public class AddressController extends BaseController{
    private Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private AddressService addressService;

    @RequestMapping("list")
    @ResponseBody
    public String list(AddressListReq addressListReq) {
        AddressRes addressRes = new AddressRes();
        try {
            List<AddressModel> respList = addressService.queryUserAddressList(addressListReq);
            addressRes.setData(respList);
            addressRes.setCode(CodeConstants.SUCCESS);
        } catch (Exception e) {
            log.error("未知异常", e);
            addressRes.setMsg("获取用户收获地址异常！");
            addressRes.setCode(CodeConstants.ERROR);
        }
        return JSONUtils.toJSON(addressRes);
    }

    @RequestMapping("add")
    @ResponseBody
    public String add(AddressAddReq addressAddReq) {
        AddressRes addressRes = new AddressRes();
        try {
            addressService.addUserAddress(addressAddReq);
            addressRes.setCode(CodeConstants.SUCCESS);
        } catch (Exception e) {
            log.error("未知异常", e);
            addressRes.setMsg("添加收获地址异常！");
            addressRes.setCode(CodeConstants.ERROR);
        }
        return JSONUtils.toJSON(addressRes);
    }

    @RequestMapping("modify")
    @ResponseBody
    public String modify(AddressModifyReq addressModifyReq) {
        AddressRes addressRes = new AddressRes();
        try {
            //判断默认收获地址是否有重复
            if (AddressModel.YES.equals(addressModifyReq.getIsDefault()) &&
                    addressService.hasDefaultAddress(addressModifyReq)) {
                addressRes.setCode(CodeConstants.ALREADY_DEFAULT_ADDRESS);
            } else {
                addressService.modifyUserAddress(addressModifyReq);
                addressRes.setCode(CodeConstants.SUCCESS);
            }
        } catch (Exception e) {
            log.error("未知异常", e);
            addressRes.setMsg("修改收获地址异常！");
            addressRes.setCode(CodeConstants.ERROR);
        }
        return JSONUtils.toJSON(addressRes);
    }

    @RequestMapping("remove")
    @ResponseBody
    public String remove(AddressRemoveReq addressRemoveReq) {
        AddressRes addressRes = new AddressRes();
        try {
            addressService.removeUserAddress(addressRemoveReq);
            addressRes.setCode(CodeConstants.SUCCESS);
        } catch (Exception e) {
            log.error("未知异常", e);
            addressRes.setMsg("修改收获地址异常！");
            addressRes.setCode(CodeConstants.ERROR);
        }
        return JSONUtils.toJSON(addressRes);
    }
}
