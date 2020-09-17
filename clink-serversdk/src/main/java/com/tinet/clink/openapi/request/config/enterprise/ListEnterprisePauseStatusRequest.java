package com.tinet.clink.openapi.request.config.enterprise;

import com.tinet.clink.openapi.PathEnum;
import com.tinet.clink.openapi.request.AbstractRequestModel;
import com.tinet.clink.openapi.response.config.enterprise.ListEnterprisePauseStatusResponse;
import com.tinet.clink.openapi.utils.HttpMethodType;

/**
 * @author zhangxy13@aisainfo-int.com
 * @since 2020/9/17
 */
public class ListEnterprisePauseStatusRequest extends AbstractRequestModel<ListEnterprisePauseStatusResponse> {

    public ListEnterprisePauseStatusRequest() {
        super(PathEnum.ListEnterprisePauseStatus.value(), HttpMethodType.GET);
    }

    /**
     * 获取响应对象
     *
     * @return 响应对象
     */
    @Override
    public Class<ListEnterprisePauseStatusResponse> getResponseClass() {
        return ListEnterprisePauseStatusResponse.class;
    }
}
