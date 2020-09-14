package com.tinet.clink.openapi.response.business;

import com.tinet.clink.openapi.model.ListBusinessModel;
import com.tinet.clink.openapi.response.PagedResponse;

import java.util.List;

/**
 * @author zhangxy13@asiainfo-int.com
 * @date 2020/09/01
 */
public class ListBusinessResponse extends PagedResponse {

    private List<ListBusinessModel> businesses;

    public List<ListBusinessModel> getBusinesses() {
        return businesses;
    }

    public void setBusinesses(List<ListBusinessModel> businesses) {
        this.businesses = businesses;
    }
}
