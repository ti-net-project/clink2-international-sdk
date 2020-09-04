package com.tinet.clink.openapi.response.business;

import com.tinet.clink.openapi.model.BusinessModel;
import com.tinet.clink.openapi.response.PagedResponse;

import java.util.List;

/**
 * @author zhangxy13@asiainfo-int.com
 * @date 2020/09/01
 */
public class ListBusinessResponse extends PagedResponse {

    private List<BusinessModel> businesses;

    public List<BusinessModel> getBusinesses() {
        return businesses;
    }

    public void setBusinesses(List<BusinessModel> businesses) {
        this.businesses = businesses;
    }
}
