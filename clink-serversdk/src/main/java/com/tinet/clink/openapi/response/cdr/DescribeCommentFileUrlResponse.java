package com.tinet.clink.openapi.response.cdr;

import com.tinet.clink.openapi.response.ResponseModel;

/**
 * 查询留言录音地址响应
 *
 * @author Wangyl
 * @date 2019/7/9
 */
public class DescribeCommentFileUrlResponse extends ResponseModel {
    private String commentFileUrl;

    public String getCommentFileUrl() {
        return commentFileUrl;
    }

    public void setCommentFileUrl(String commentFileUrl) {
        this.commentFileUrl = commentFileUrl;
    }
}
