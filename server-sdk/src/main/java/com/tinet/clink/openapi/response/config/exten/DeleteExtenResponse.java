package com.tinet.clink.openapi.response.config.exten;

import com.tinet.clink.openapi.response.ResponseModel;

/**
 * 删除话机响应
 *
 * @author wangyq
 * @date 2018/10/29
 */
public class DeleteExtenResponse extends ResponseModel {

    /**
     * 话机号码
     */
    private String exten;

    public String getExten() {
        return exten;
    }

    public void setExten(String exten) {
        this.exten = exten;
    }
}