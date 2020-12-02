package com.liwo.app.pro.req;

import com.liwo.app.core.BasePageReq;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * 产品列表展示接口请求实体类
 * Created by chenhuan on 15-9-13.
 */
public class ConsumableReq extends BasePageReq {
    /**
     * 类目id
     */
    @NotEmpty(message="classId不能为空")
    private String classId;
    /**
     * 产品名称
     */
    private String csName;

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getCsName() {
        return csName;
    }

    public void setCsName(String csName) {
        this.csName = csName;
    }
}
