package com.liwo.app.user.res;

import com.liwo.app.core.BaseRes;
import com.liwo.app.user.model.AddressModel;

import java.util.List;

/**
 * Created by Administrator on 2015/9/19.
 */
public class AddressRes extends BaseRes {
    private List<AddressModel> data;

    public List<AddressModel> getData() {
        return data;
    }

    public void setData(List<AddressModel> data) {
        this.data = data;
    }
}
