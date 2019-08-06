package com.tinet.clink.openapi.request.config.client;

import com.tinet.clink.openapi.PathEnum;
import com.tinet.clink.openapi.request.AbstractRequestModel;
import com.tinet.clink.openapi.response.config.client.UnbindClientTelResponse;
import com.tinet.clink.openapi.utils.HttpMethodType;

/**
 * 解绑座席电话请求
 *
 * @author lizy
 * @date 2018/09/12
 */
public class UnbindClientTelRequest extends AbstractRequestModel<UnbindClientTelResponse> {

    /**
     * 座席号
     */
    private String cno;


    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
        if (cno != null) {
            putBodyParameter("cno", cno);
        }
    }

    public UnbindClientTelRequest() {
        super(PathEnum.UnbindClientTel.value(), HttpMethodType.POST);
    }

    @Override
    public Class<UnbindClientTelResponse> getResponseClass() {
        return UnbindClientTelResponse.class;
    }
}
