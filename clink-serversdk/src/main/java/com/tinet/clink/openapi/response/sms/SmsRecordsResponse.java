package com.tinet.clink.openapi.response.sms;

import com.tinet.clink.openapi.model.SmsRecordsModel;
import com.tinet.clink.openapi.response.PagedResponse;

import java.util.List;

/**
 * 短信发送响应
 *
 * @author zhangxy13@asiainfo-int.com
 * @since 2020/5/17
 */
public class SmsRecordsResponse extends PagedResponse {
    private List<SmsRecordsModel> smsRecords;

    public List<SmsRecordsModel> getSmsRecords() {
        return smsRecords;
    }

    public void setSmsRecords(List<SmsRecordsModel> smsRecords) {
        this.smsRecords = smsRecords;
    }
}
