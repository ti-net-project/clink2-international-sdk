package com.tinet.clink.openapi.model;

import java.util.Date;

/**
 * @author zhangxy13@asiainfo-int.com
 * @since 2021/5/17
 */
public class SmsRecordsModel {
    /**
     * id
     */
    private Integer id;

    /**
     * 发件人名称
     */
    private String senderName;

    /**
     * 手机号
     */
    private String tel;

    /**
     * 短信内容
     */
    private String content;

    /**
     * 短信条数
     */
    private Integer amount;

    /**
     * 短信状态
     */
    private Integer status;

    /**
     * 状态描述
     */
    private String description;

    /**
     * 发送时间
     */
    private Date createTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
