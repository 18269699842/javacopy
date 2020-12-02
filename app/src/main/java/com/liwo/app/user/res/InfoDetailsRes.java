package com.liwo.app.user.res;

import com.liwo.app.core.BaseRes;
import com.liwo.app.user.model.InfoDetailsModel;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * 个人信息res
 * Created by chenhuan on 15-9-20.
 */
public class InfoDetailsRes extends BaseRes {
    @JsonProperty(value="data")
    private InfoDetailsModel infoDetailsModel;

    public InfoDetailsModel getInfoDetailsModel() {
        return infoDetailsModel;
    }

    public void setInfoDetailsModel(InfoDetailsModel infoDetailsModel) {
        this.infoDetailsModel = infoDetailsModel;
    }
}
