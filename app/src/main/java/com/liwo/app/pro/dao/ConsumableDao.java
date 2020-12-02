package com.liwo.app.pro.dao;

import com.liwo.app.pro.model.ConsumableDetailModel;
import com.liwo.app.pro.model.ConsumableModel;
import com.liwo.app.pro.req.ConsumableReq;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * 产品dao
 * Created by chenhuan on 15-9-13.
 */
@Component
public class ConsumableDao {

    @Resource(name="sqlSessionTemplate")
    private SqlSessionTemplate sqlSessionTemplate;

    /**
     * 查询产品略缩列表
     * @param consumableReq
     * @return
     */
    public List<ConsumableModel> queryConsumableList(ConsumableReq consumableReq){
        return sqlSessionTemplate.selectList("com.liwo.app.pro.dao.ConsumableDao.queryConsumableList",consumableReq);
    }

    /**
     * 查询产品明细
     * @param cId
     * @return
     */
    public ConsumableDetailModel queryConsumableDetailModel(String cId){
        return sqlSessionTemplate.selectOne("com.liwo.app.pro.dao.ConsumableDao.queryConsumableDetailModel",cId);
    }
}
