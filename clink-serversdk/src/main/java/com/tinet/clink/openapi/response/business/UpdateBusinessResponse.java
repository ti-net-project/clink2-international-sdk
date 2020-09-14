package com.tinet.clink.openapi.response.business;

import com.tinet.clink.openapi.model.BusinessModel;
import com.tinet.clink.openapi.response.ResponseModel;

/**
 * @author zhangxy13@asiainfo-int.com
 * @date 2020/09/01
 */
public class UpdateBusinessResponse extends ResponseModel {

    private BusinessModel business;

    public BusinessModel getBusiness() {
        return business;
    }

    public void setBusiness(BusinessModel business) {
        this.business = business;
    }
}
