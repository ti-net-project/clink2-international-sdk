package com.tinet.clink.openapi.response.call.control;

import com.tinet.clink.openapi.model.CallOutResultModel;
import com.tinet.clink.openapi.response.ResponseModel;

/**
 * 外呼响应
 *
 * @author huwk
 * @date 2018/10/30
 **/
public class CalloutResponse extends ResponseModel {

    /**
     * 外呼的返回结果
     */
    CallOutResultModel result;

    public CallOutResultModel getResult() {
        return result;
    }

    public void setResult(CallOutResultModel result) {
        this.result = result;
    }
}
