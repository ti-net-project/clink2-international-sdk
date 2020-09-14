package com.tinet.clink.openapi.model;

import java.util.Date;

/**
 * @author zhangxy13@asiainfo-int.com
 * @date 2020/09/01
 */
public class BusinessModel {

    /**
     * 自增主键
     */
    private Integer id;

    /**
     * 客户姓名
     */
    private String customerName;

    /**
     * 客户电话
     */
    private String[] customerTel;

    /**
     * 业务主题
     */
    private String topic;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 修改人
     */
    private String modifier;

    /**
     * 来源
     */
    private Integer source;

    /**
     * 自定义字段
     */
    private IdValueNameType[] customize;

    /**
     * 记录创建时间
     */
    private Date createTime;

    /**
     * 记录修改时间
     */
    private Date updateTime;

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
     * 处理人
     */
    private String handler;

    /**
     * 描述
     */
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String[] getCustomerTel() {
        return customerTel;
    }

    public void setCustomerTel(String[] customerTel) {
        this.customerTel = customerTel;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public IdValueNameType[] getCustomize() {
        return customize;
    }

    public void setCustomize(IdValueNameType[] customize) {
        this.customize = customize;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getHandlerCno() {
        return handlerCno;
    }

    public void setHandlerCno(String handlerCno) {
        this.handlerCno = handlerCno;
    }

    public String getHandler() {
        return handler;
    }

    public void setHandler(String handler) {
        this.handler = handler;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
