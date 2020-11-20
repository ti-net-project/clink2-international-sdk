package com.tinet.clink.openapi.request.config.investigation;

import com.tinet.clink.openapi.PathEnum;
import com.tinet.clink.openapi.request.AbstractRequestModel;
import com.tinet.clink.openapi.response.config.investigation.InvestigationSettingResponse;
import com.tinet.clink.openapi.utils.HttpMethodType;

/**
 * @author zhangxy13@aisainfo-int.com
 * @since 2020/9/17
 */
public class InvestigationSettingRequest extends AbstractRequestModel<InvestigationSettingResponse> {
    public InvestigationSettingRequest() {
        super(PathEnum.InvestigationSetting.value(), HttpMethodType.GET);
    }

    /**
     * 获取响应对象
     *
     * @return 响应对象
     */
    @Override
    public Class<InvestigationSettingResponse> getResponseClass() {
        return InvestigationSettingResponse.class;
    }
}
