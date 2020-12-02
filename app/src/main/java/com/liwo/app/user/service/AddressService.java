package com.liwo.app.user.service;

import com.liwo.app.user.dao.AddressDao;
import com.liwo.app.user.model.AddressModel;
import com.liwo.app.user.req.AddressAddReq;
import com.liwo.app.user.req.AddressListReq;
import com.liwo.app.user.req.AddressModifyReq;
import com.liwo.app.user.req.AddressRemoveReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by qinzhen on 2015/9/19.
 */
@Service
public class AddressService {
    @Autowired
    private AddressDao addressDao;

    public List<AddressModel> queryUserAddressList(AddressListReq addressListReq){
        return addressDao.queryUserAddress(addressListReq);
    }

    public void addUserAddress(AddressAddReq addressAddReq) {
        addressDao.addUserAddress(addressAddReq);
    }

    public void modifyUserAddress(AddressModifyReq addressModifyReq) {
        addressDao.modifyUserAddress(addressModifyReq);
    }

    public boolean hasDefaultAddress(AddressModifyReq addressModifyReq) {
        return addressDao.hasDefaultAddress(addressModifyReq);
    }

    public void removeUserAddress(AddressRemoveReq addressRemoveReq) {
        addressDao.removeUserAddress(addressRemoveReq);
    }
}
