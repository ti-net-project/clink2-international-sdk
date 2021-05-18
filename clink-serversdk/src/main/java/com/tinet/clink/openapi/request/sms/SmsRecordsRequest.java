package com.tinet.clink.openapi.request.sms;

import com.tinet.clink.openapi.PathEnum;
import com.tinet.clink.openapi.request.AbstractRequestModel;
import com.tinet.clink.openapi.response.sms.SmsRecordsResponse;
import com.tinet.clink.openapi.response.sms.SmsTemplateResponse;
import com.tinet.clink.openapi.utils.HttpMethodType;

/**
 * 短信查看发送记录
 *
 * @author zhangxy13@asiainfo-int.com
 * @since  2021/5/17
 */
public class SmsRecordsRequest extends AbstractRequestModel<SmsRecordsResponse> {

    /**
     * 手机号码
     */
    private String tel;

    /**
     * 坐席号
     */
    private String cno;

    /**
     * 管理员id
     */
    private Integer adminId;

    /**
     * 短信发送开始时间
     */
    private Long startTime;

    /**
     * 短信发送结束时间
     */
    private Long endTime;

    private Integer limit;

    private Integer offset;


    public SmsRecordsRequest(){
        super(PathEnum.SmsRecords.value(), HttpMethodType.GET);
    }

    @Override
    public Class<SmsRecordsResponse> getResponseClass() {
        return SmsRecordsResponse.class;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
        if (tel != null) {
            putQueryParameter("tel", tel);
        }
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
        if (cno != null) {
            putQueryParameter("cno", cno);
        }
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
        if (adminId != null) {
            putQueryParameter("adminId", adminId);
        }
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
        if (startTime != null) {
            putQueryParameter("startTime", startTime);
        }
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
        if (endTime != null) {
            putQueryParameter("endTime", endTime);
        }
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
        if (limit != null) {
            putQueryParameter("limit", limit);
        }
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
        if (offset != null) {
            putQueryParameter("offset", offset);
        }
    }
}
