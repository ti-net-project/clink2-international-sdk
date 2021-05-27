package com.tinet.clink.openapi.model;

/**
 * @author zhangxy13@asiainfo-int.com
 * @since 2-21/5/17
 */
public class SmsTemplateModel {
    /**
     * 模板id
     */
    private Integer id;

    /**
     * 模板名称
     */
    private String name;

    /**
     * 内容
     */
    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
