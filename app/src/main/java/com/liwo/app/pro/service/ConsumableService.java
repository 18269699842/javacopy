package com.liwo.app.pro.service;

import com.liwo.app.pro.dao.ConsumableDao;
import com.liwo.app.pro.model.ConsumableDetailModel;
import com.liwo.app.pro.model.ConsumableModel;
import com.liwo.app.pro.req.ConsumableReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 产品service
 * Created by chenhuan on 15-9-13.
 */
@Service
public class ConsumableService {

    @Autowired
    private ConsumableDao consumableDao;

    /**
     * 查询产品略缩列表
     * @param consumableReq
     * @return
     */
    public List<ConsumableModel> queryConsumableList(ConsumableReq consumableReq){
        return consumableDao.queryConsumableList(consumableReq);
    }

    /**
     * 查询产品明细
     * @param cId
     * @return
     */
    public ConsumableDetailModel queryConsumableDetailModel(String cId){
        return consumableDao.queryConsumableDetailModel(cId);
    }
}
