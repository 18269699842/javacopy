package com.liwo.app.user.dao;

import com.liwo.app.user.model.AddressModel;
import com.liwo.app.user.req.AddressAddReq;
import com.liwo.app.user.req.AddressListReq;
import com.liwo.app.user.req.AddressModifyReq;
import com.liwo.app.user.req.AddressRemoveReq;
import org.apache.ibatis.session.ResultContext;
import org.apache.ibatis.session.ResultHandler;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by qinzhen on 2015/9/19.
 */
@Component
public class AddressDao {

    @Resource(name = "sqlSessionTemplate")
    private SqlSessionTemplate sqlSessionTemplate;

    public List<AddressModel> queryUserAddress(AddressListReq addressListReq) {
        return sqlSessionTemplate.selectList("com.liwo.app.user.dao.AddressDao.queryUserAddress", addressListReq);
    }

    public void addUserAddress(AddressAddReq addressAddReq) {
        sqlSessionTemplate.insert("com.liwo.app.user.dao.AddressDao.addUserAddress", addressAddReq);
    }

    public void modifyUserAddress(AddressModifyReq addressModifyReq) {
        sqlSessionTemplate.update("com.liwo.app.user.dao.AddressDao.modifyUserAddress", addressModifyReq);
    }

    public boolean hasDefaultAddress(AddressModifyReq addressModifyReq) {
        Object obj = sqlSessionTemplate.selectOne("com.liwo.app.user.dao.AddressDao.countDefaultAddress", addressModifyReq);
        Number resultCount = (Number)obj;
        return resultCount.intValue() > 0 ? true : false;
    }

    public void removeUserAddress(AddressRemoveReq addressRemoveReq) {
        sqlSessionTemplate.delete("com.liwo.app.user.dao.AddressDao.removeUserAddress", addressRemoveReq);
    }
}
