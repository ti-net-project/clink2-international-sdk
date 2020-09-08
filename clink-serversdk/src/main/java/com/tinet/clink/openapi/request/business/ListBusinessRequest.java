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
     * 主题
     */
    private String topic;

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
     * 优先级.   0:高, 1:中, 2:低
     */
    private Integer priority;

    /**
     * 状态.   0:新建, 1:暂缓, 2:升级, 3:关闭
     */
    private Integer status;

    /**
     * 处理人姓名或者工号
     */
    private String handlerNameOrCno;

    /**
     * 描述
     */
    private String description;

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

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
        if (priority != null) {
            putQueryParameter("priority", priority);
        }
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
        if (status != null) {
            putQueryParameter("status", status);
        }
    }

    public String getHandlerNameOrCno() {
        return handlerNameOrCno;
    }

    public void setHandlerNameOrCno(String handlerNameOrCno) {
        this.handlerNameOrCno = handlerNameOrCno;
        if (handlerNameOrCno != null) {
            putQueryParameter("handlerNameOrCno", handlerNameOrCno);
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        if (description != null) {
            putQueryParameter("description", description);
        }
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
        if (topic != null) {
            putQueryParameter("topic", topic);
        }
    }
}
