package com.tinet.clink.openapi.response.config.investigation;

import com.tinet.clink.openapi.model.InvestigationSettingModel;
import com.tinet.clink.openapi.response.ResponseModel;

/**
 * @author zhangxy13@aisainfo-int.com
 * @since 2020/9/17
 */
public class InvestigationSettingResponse extends ResponseModel {
    private InvestigationSettingModel setting;

    public InvestigationSettingModel getSetting() {
        return setting;
    }

    public void setSetting(InvestigationSettingModel setting) {
        this.setting = setting;
    }
}
