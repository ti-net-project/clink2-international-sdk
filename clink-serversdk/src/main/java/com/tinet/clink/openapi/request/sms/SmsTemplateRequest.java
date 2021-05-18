package com.tinet.clink.openapi.request.sms;

import com.tinet.clink.openapi.PathEnum;
import com.tinet.clink.openapi.request.AbstractRequestModel;
import com.tinet.clink.openapi.response.sms.SmsTemplateResponse;
import com.tinet.clink.openapi.utils.HttpMethodType;

/**
 * 短信查看模板请求
 *
 * @author zhangxy13@asiainfo-int.com
 * @since  2021/5/17
 */
public class SmsTemplateRequest extends AbstractRequestModel<SmsTemplateResponse> {

    /**
     * 短信模板状态
     */
    private Integer status;


    public SmsTemplateRequest(){
        super(PathEnum.SmsTemplate.value(), HttpMethodType.GET);
    }

    @Override
    public Class<SmsTemplateResponse> getResponseClass() {
        return SmsTemplateResponse.class;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
        putQueryParameter("status", status);
    }

}
