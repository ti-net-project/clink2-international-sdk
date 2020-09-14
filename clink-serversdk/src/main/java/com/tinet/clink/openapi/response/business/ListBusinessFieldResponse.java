package com.tinet.clink.openapi.response.business;

import com.tinet.clink.openapi.model.BusinessFieldModel;
import com.tinet.clink.openapi.response.ResponseModel;

import java.util.List;

/**
 * @author zhangxy13@asiainfo-int.com
 * @date 2020/09/01
 */
public class ListBusinessFieldResponse extends ResponseModel {

    private List<BusinessFieldModel> businessFields;

    public List<BusinessFieldModel> getBusinessFields() {
        return businessFields;
    }

    public void setBusinessFields(List<BusinessFieldModel> businessFields) {
        this.businessFields = businessFields;
    }
}
