package com.tinet.clink.openapi.request.cdr;

import com.tinet.clink.openapi.PathEnum;
import com.tinet.clink.openapi.request.AbstractRequestModel;
import com.tinet.clink.openapi.response.cdr.DownloadCommentFileResponse;
import com.tinet.clink.openapi.utils.HttpMethodType;

/**
 * 下载通话录音文件请求
 *
 * @author Wangyl
 * @date 2019/7/9
 */
public class DownloadCommentFileRequest extends AbstractRequestModel<DownloadCommentFileResponse> {

    /**
     * 录音文件名称
     */
    private String recordFile;

    public DownloadCommentFileRequest() {
        super(PathEnum.DownloadCommentFile.value(), HttpMethodType.GET);
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
    public Class<DownloadCommentFileResponse> getResponseClass() {
        return DownloadCommentFileResponse.class;
    }

}
