package com.tinet.clink.openapi.request.business;

import com.tinet.clink.openapi.PathEnum;
import com.tinet.clink.openapi.request.AbstractRequestModel;
import com.tinet.clink.openapi.response.business.ListBusinessFieldResponse;
import com.tinet.clink.openapi.utils.HttpMethodType;

/**
 * 查询业务记录的自定义字段
 *
 * @author zhangxy13@asiainfo-int.com
 * @date 2020/09/01
 */
public class ListBusinessFieldRequest extends AbstractRequestModel<ListBusinessFieldResponse> {

    public ListBusinessFieldRequest() {
        super(PathEnum.ListBusinessCustomizeField.value(), HttpMethodType.GET);
    }

    @Override
    public Class<ListBusinessFieldResponse> getResponseClass() {
        return ListBusinessFieldResponse.class;
    }
}
