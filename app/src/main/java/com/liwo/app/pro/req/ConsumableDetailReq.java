package com.liwo.app.pro.req;

import com.liwo.app.core.BaseReq;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by chenhuan on 15-10-6.
 */
public class ConsumableDetailReq extends BaseReq {

    @NotEmpty(message="cId不能为空")
    private String cid;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }
}
