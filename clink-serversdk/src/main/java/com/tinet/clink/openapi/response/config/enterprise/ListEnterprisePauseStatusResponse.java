package com.tinet.clink.openapi.response.config.enterprise;

import com.tinet.clink.openapi.model.ListEnterprisePauseStatusModel;
import com.tinet.clink.openapi.response.ResponseModel;

import java.util.List;

/**
 * @author zhangxy13@aisainfo-int.com
 * @since 2020/9/17
 */
public class ListEnterprisePauseStatusResponse extends ResponseModel {
    private List<ListEnterprisePauseStatusModel> pauseStatus;

    public List<ListEnterprisePauseStatusModel> getPauseStatus() {
        return pauseStatus;
    }

    public void setPauseStatus(List<ListEnterprisePauseStatusModel> pauseStatus) {
        this.pauseStatus = pauseStatus;
    }
}
