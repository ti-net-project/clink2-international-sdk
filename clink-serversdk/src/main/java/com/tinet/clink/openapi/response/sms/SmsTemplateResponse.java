package com.tinet.clink.openapi.response.sms;

import com.tinet.clink.openapi.model.SmsTemplateModel;
import com.tinet.clink.openapi.response.ResponseModel;

import java.util.List;

/**
 * 短信发送响应
 *
 * @author zhangxy13@asiainfo-int.com
 * @since 2020/5/17
 */
public class SmsTemplateResponse extends ResponseModel {
    private List<SmsTemplateModel> smsTemplate;

    public List<SmsTemplateModel> getSmsTemplate() {
        return smsTemplate;
    }

    public void setSmsTemplate(List<SmsTemplateModel> smsTemplate) {
        this.smsTemplate = smsTemplate;
    }
}
