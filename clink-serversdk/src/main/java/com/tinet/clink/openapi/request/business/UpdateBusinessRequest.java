package com.tinet.clink.openapi.request.business;

import com.tinet.clink.openapi.PathEnum;
import com.tinet.clink.openapi.request.AbstractRequestModel;
import com.tinet.clink.openapi.response.business.UpdateBusinessResponse;
import com.tinet.clink.openapi.response.config.customer.UpdateCustomerResponse;
import com.tinet.clink.openapi.utils.HttpMethodType;

/**
 * @author zhangxy13@asiainfo-int.com
 * @date 2020/09/01
 */
public class UpdateBusinessRequest extends AbstractRequestModel<UpdateBusinessResponse> {
    /**
     * 业务记录主键id
     */
    private Integer id;

    /**
     * 业务主题
     */
    private String topic;

    /**
     * 业务主题更新坐席id
     */
    private String cno;

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
     * 处理人工号
     */
    private String handlerCno;

    /**
     * 描述
     */
    private String description;

    public UpdateBusinessRequest() {
        super(PathEnum.UpdateBusiness.value(), HttpMethodType.POST);
    }

    @Override
    public Class<UpdateBusinessResponse> getResponseClass() {
        return UpdateBusinessResponse.class;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
        if (id != null) {
            putQueryParameter("id", id);
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

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
        if (cno != null) {
            putQueryParameter("cno", cno);
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

    public String getHandlerCno() {
        return handlerCno;
    }

    public void setHandlerCno(String handlerCno) {
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
