package com.tinet.clink.openapi.request.business;

import com.tinet.clink.openapi.PathEnum;
import com.tinet.clink.openapi.request.AbstractRequestModel;
import com.tinet.clink.openapi.response.business.CreateBusinessResponse;
import com.tinet.clink.openapi.utils.HttpMethodType;

/**
 * @author zhangxy13@asiainfo-int.com
 * @date 2020/09/01
 */
public class CreateBusinessRequest extends AbstractRequestModel<CreateBusinessResponse> {
    /**
     * 业务主题
     */
    private String topic;

    /**
     * 业务主题创建坐席id
     */
    private String cno;

    /**
     * 客户id
     */
    private Integer customerId;

    /**
     * 来源
     */
    private Integer source;

    /**
     * 自定义字段
     */
    private String businessParam;

    /**
     * 优先级.   0:高, 1:中, 2:低
     */
    private Integer priority;

    /**
     * 状态.   0:新建, 1:暂缓, 2:升级, 3:关闭
     */
    private Integer status;

    /**
     * 指定处理坐席号
     */
    private Integer handlerCno;

    /**
     * 描述
     */
    private String description;

    public CreateBusinessRequest() {
        super(PathEnum.CreateBusiness.value(), HttpMethodType.POST);
    }

    @Override
    public Class<CreateBusinessResponse> getResponseClass() {
        return CreateBusinessResponse.class;
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

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
        if (cno != null) {
            putQueryParameter("cno", cno);
        }
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
        if (customerId != null) {
            putQueryParameter("customerId", customerId);
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

    public String getBusinessParam() {
        return businessParam;
    }

    public void setBusinessParam(String businessParam) {
        this.businessParam = businessParam;
        if (businessParam != null) {
            putQueryParameter("businessParam", businessParam);
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

    public Integer getHandlerCno() {
        return handlerCno;
    }

    public void setHandlerCno(Integer handlerCno) {
        this.handlerCno = handlerCno;
        if (handlerCno != null) {
            putQueryParameter("handlerCno", handlerCno);
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
}
