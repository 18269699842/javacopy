package com.liwo.app.pro.service;

import com.liwo.app.pro.dao.MyShopDao;
import com.liwo.app.pro.model.MyShopModel;
import com.liwo.app.pro.model.MyShopModelV2;
import com.liwo.app.pro.req.MyShopAddReq;
import com.liwo.app.pro.req.MyShopDeleteReq;
import com.liwo.app.pro.req.MyShopReq;
import com.liwo.app.pro.req.MyShopUpdateReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 我的购物车service
 * Created by chenhuan on 15-9-13.
 */
@Service
public class MyShopService {
    @Autowired
    private MyShopDao myShopDao;

    /**
     * 查询我的购物车列表
     * @return
     */
    public List<MyShopModel> queryMyShopModel(MyShopReq myShopReq){
        return myShopDao.queryMyShopModel(myShopReq);
    }

    /**
     * 购物车添加
     * @param myShopAddReq
     * @return
     */
    public boolean addMyShop(MyShopAddReq myShopAddReq){
        //查询我的购物车该商品是否存在,有则修改，无则添加
        MyShopModelV2 myShopModelV2 = myShopDao.queryMyShopModelV2(myShopAddReq);
        //商品手机号查询购物车是否存在
        if(myShopModelV2==null){
            return myShopDao.addMyShop(myShopAddReq);
        }else{
            MyShopUpdateReq myShopUpdateReq = new MyShopUpdateReq();
            myShopUpdateReq.setMsId(myShopModelV2.getMsId());
            myShopUpdateReq.setNum(String.valueOf(Integer.parseInt(myShopModelV2.getNum())+Integer.parseInt(myShopAddReq.getNum())));
            myShopUpdateReq.setAccountId(myShopModelV2.getAccId());
            return myShopDao.updateMyShop(myShopUpdateReq);
        }


    }

    /**
     * 购物车删除
     * @param myShopDeleteReq
     * @return
     */
    public boolean deleteMyShop(MyShopDeleteReq myShopDeleteReq){
        return myShopDao.deleteMyShop(myShopDeleteReq);
    }

    /**
     * 购物车修改
     * @param myShopUpdateReq
     * @return
     */
    public boolean updateMyShop(MyShopUpdateReq myShopUpdateReq){
        return myShopDao.updateMyShop(myShopUpdateReq);
    }
}
