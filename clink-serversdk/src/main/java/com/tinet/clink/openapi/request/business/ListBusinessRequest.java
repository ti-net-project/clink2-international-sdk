package com.tinet.clink.openapi.request.business;

import com.tinet.clink.openapi.PathEnum;
import com.tinet.clink.openapi.request.AbstractRequestModel;
import com.tinet.clink.openapi.response.business.ListBusinessResponse;
import com.tinet.clink.openapi.utils.HttpMethodType;

/**
 * 业务记录查询
 *
 * @author zhangxy13@asiainfo-int.com
 * @date 2020/09/01
 */
public class ListBusinessRequest extends AbstractRequestModel<ListBusinessResponse> {
    /**
     * 业务记录自定义字段信息
     */
    private String businessParams;

    /**
     * 来源。
     * 0:呼叫中心
     * 1:在线咨询
     * 2:微信
     * 3:人工添加
     */
    private Integer source;

    /**
     * 业务记录创建时间的起始范围
     */
    private Long startTime;

    /**
     * 业务记录创建时间的结束范围
     */
    private Long endTime;

    /**
     * 创建坐席的名称或者是坐席id
     */
    private String creatorNameOrCno;

    /**
     * 关联的客户名称或者是客户手机号
     */
    private String customerNameOrTel;

    /**
     * 查询限制数量
     */
    private Integer limit;

    /**
     * 查询偏移量
     */
    private Integer offset;

    public ListBusinessRequest() {
        super(PathEnum.ListBusiness.value(), HttpMethodType.POST);
    }

    @Override
    public Class<ListBusinessResponse> getResponseClass() {
        return ListBusinessResponse.class;
    }

    public String getBusinessParams() {
        return businessParams;
    }

    public void setBusinessParams(String businessParams) {
        this.businessParams = businessParams;
        if (businessParams != null) {
            putQueryParameter("businessParams", businessParams);
        }
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
        if (source != null) {
            putQueryParameter("source", source);
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

    public String getCreatorNameOrCno() {
        return creatorNameOrCno;
    }

    public void setCreatorNameOrCno(String creatorNameOrCno) {
        this.creatorNameOrCno = creatorNameOrCno;
        if (creatorNameOrCno != null) {
            putQueryParameter("creatorNameOrCno", creatorNameOrCno);
        }
    }

    public String getCustomerNameOrTel() {
        return customerNameOrTel;
    }

    public void setCustomerNameOrTel(String customerNameOrTel) {
        this.customerNameOrTel = customerNameOrTel;
        if (customerNameOrTel != null) {
            putQueryParameter("customerNameOrTel", customerNameOrTel);
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
