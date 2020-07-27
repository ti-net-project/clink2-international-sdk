package com.tinet.clink.openapi.request.cdr;

import com.tinet.clink.openapi.PathEnum;
import com.tinet.clink.openapi.request.AbstractRequestModel;
import com.tinet.clink.openapi.response.cdr.DescribeCommentFileUrlResponse;
import com.tinet.clink.openapi.utils.HttpMethodType;

/**
 * 查询通话录音地址请求
 *
 * @author Wangyl
 * @date 2019/7/9
 */
public class DescribeCommentFileUrlRequest extends AbstractRequestModel<DescribeCommentFileUrlResponse> {

    /**
     * 录音文件名称
     */
    private String recordFile;

    public DescribeCommentFileUrlRequest() {
        super(PathEnum.DescribeCommentFileUrl.value(), HttpMethodType.GET);
    }

    public String getRecordFile() {
        return recordFile;
    }

    public void setRecordFile(String recordFile) {
        this.recordFile = recordFile;
        if (recordFile != null) {
            putQueryParameter("recordFile", recordFile);
        }
    }


    @Override
    public Class<DescribeCommentFileUrlResponse> getResponseClass() {
        return DescribeCommentFileUrlResponse.class;
    }

}
