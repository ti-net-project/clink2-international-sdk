package com.tinet.clink.openapi.model;

/**
 * @author zhangxy13@asiainfo-int.com
 * @date 2020/09/01
 */
public class IdValueNameType {

    /**
     * 字段id
     */
    private Integer id;

    /**
     * 字段的值
     */
    private String value;

    /**
     * 字段名称
     */
    private String name;

    /**
     * 字段类型
     */
    private Integer type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
