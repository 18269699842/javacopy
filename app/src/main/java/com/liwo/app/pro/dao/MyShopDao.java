package com.liwo.app.pro.dao;

import com.liwo.app.pro.model.MyShopModel;
import com.liwo.app.pro.model.MyShopModelV2;
import com.liwo.app.pro.req.MyShopAddReq;
import com.liwo.app.pro.req.MyShopDeleteReq;
import com.liwo.app.pro.req.MyShopReq;
import com.liwo.app.pro.req.MyShopUpdateReq;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * 我的购物车Dao
 * Created by chenhuan on 15-9-13.
 */
@Component
public class MyShopDao {

    @Resource(name="sqlSessionTemplate")
    private SqlSessionTemplate sqlSessionTemplate;

    /**
     * 查询我的购物车列表
     * @return
     */
    public List<MyShopModel> queryMyShopModel(MyShopReq myShopReq){
        return sqlSessionTemplate.selectList("com.liwo.app.pro.dao.MyShopDao.queryMyShopModel",myShopReq);
    }

    /**
     * 购物车添加
     * @param myShopAddReq
     * @return
     */
    public boolean addMyShop(MyShopAddReq myShopAddReq){
        return 0<sqlSessionTemplate.insert("com.liwo.app.pro.dao.MyShopDao.addMyShop",myShopAddReq);
    }

    /**
     * 购物车删除
     * @param myShopDeleteReq
     * @return
     */
    public boolean deleteMyShop(MyShopDeleteReq myShopDeleteReq){
        return 0<sqlSessionTemplate.delete("com.liwo.app.pro.dao.MyShopDao.deleteMyShop",myShopDeleteReq);
    }

    /**
     * 购物车修改
     * @param myShopUpdateReq
     * @return
     */
    public boolean updateMyShop(MyShopUpdateReq myShopUpdateReq){
        return 0<sqlSessionTemplate.update("com.liwo.app.pro.dao.MyShopDao.updateMyShop",myShopUpdateReq);
    }

    /**
     * 查询购物车单个是否存在
     * @return
     */
    public MyShopModelV2 queryMyShopModelV2(MyShopAddReq myShopAddReq){
        return sqlSessionTemplate.selectOne("com.liwo.app.pro.dao.MyShopDao.queryMyShopModelV2",myShopAddReq);
    }
}
