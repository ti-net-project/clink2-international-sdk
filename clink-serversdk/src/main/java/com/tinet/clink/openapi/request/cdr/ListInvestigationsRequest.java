package com.tinet.clink.openapi.request.cdr;

import com.tinet.clink.openapi.PathEnum;
import com.tinet.clink.openapi.request.AbstractRequestModel;
import com.tinet.clink.openapi.response.cdr.ListInvestigationsResponse;
import com.tinet.clink.openapi.utils.HttpMethodType;

/**
 * 查询满意度调查记录列表请求
 *
 * @author huwk
 * @date 2018/10/24
 **/
public class ListInvestigationsRequest extends AbstractRequestModel<ListInvestigationsResponse> {

    /**
     * 坐席号码
     */
    private String cno;

    /**
     * 客户号码
     */
    private String customerNumber;

    /**
     * 评分值
     */
    private Integer investigationKeys;

    /**
     * 开始时间，时间戳格式精确到秒。默认值取当前月份第一天
     */
    private Long startTime;

    /**
     * 结束时间，时间戳格式精确到秒，开始时间和结束时间跨度不能超过一个月。默认值取当前时间
     */
    private Long endTime;

    /**
     * 是否隐藏号码。
     * 0: 不隐藏，1: 中间四位，2: 最后八位，3: 全部号码，4: 最后四位。默认值为 0
     */
    private Integer hiddenType;

    /**
     * 呼叫类型
     * 呼入：ib， 呼出：ob
     */
    private String cdrType;

    /**
     * 偏移量，范围 0-99990。默认值为 0，但limit + offset 不允许超过100000
     */
    private Integer offset;

    /**
     * 查询条数，范围 10-100。默认值为 10，但limit + offset 不允许超过100000
     */
    private Integer limit;

    public ListInvestigationsRequest() {
        super(PathEnum.ListInvestigations.value(), HttpMethodType.GET);
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
        if (customerNumber != null) {
            putQueryParameter("customerNumber", customerNumber);
        }
    }

    public Integer getHiddenType() {
        return hiddenType;
    }

    public void setHiddenType(Integer hiddenType) {
        this.hiddenType = hiddenType;
        if (hiddenType != null) {
            putQueryParameter("hiddenType", hiddenType);
        }
    }

    public Integer getInvestigationKeys() {
        return investigationKeys;
    }

    public void setInvestigationKeys(Integer investigationKeys) {
        this.investigationKeys = investigationKeys;
        if (investigationKeys != null) {
            putQueryParameter("investigationKeys", investigationKeys);
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

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
        if (offset != null) {
            putQueryParameter("offset", offset);
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

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
        if (cno != null) {
            putQueryParameter("cno", cno);
        }
    }

    public String getCdrType() {
        return cdrType;
    }

    public void setCdrType(String cdrType) {
        this.cdrType = cdrType;
        if (cdrType != null) {
            putQueryParameter("cdrType", cdrType);
        }
    }

    @Override
    public Class<ListInvestigationsResponse> getResponseClass() {
        return ListInvestigationsResponse.class;
    }
}
