package com.tinet.clink.openapi.request.sms;

import com.tinet.clink.openapi.PathEnum;
import com.tinet.clink.openapi.request.AbstractRequestModel;
import com.tinet.clink.openapi.response.sms.SmsResendResponse;
import com.tinet.clink.openapi.utils.HttpMethodType;

/**
 * 短信重发
 *
 * @author zhangxy13@asiainfo-int.com
 * @since  2021/5/17
 */
public class SmsResendRequest extends AbstractRequestModel<SmsResendResponse> {

    /**
     * 短信记录主键
     */
    private Integer id;

    public SmsResendRequest(){
        super(PathEnum.SmsResend.value(), HttpMethodType.POST);
    }

    @Override
    public Class<SmsResendResponse> getResponseClass() {
        return SmsResendResponse.class;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
        putQueryParameter("id", id);
    }
}
