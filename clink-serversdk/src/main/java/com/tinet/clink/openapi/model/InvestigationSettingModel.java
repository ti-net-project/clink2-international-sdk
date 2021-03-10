package com.tinet.clink.openapi.model;

import java.util.List;

/**
 * 满意度设置模型
 *
 * @author wangll
 * @date 2018/08/27
 */
public class InvestigationSettingModel {
    /**
     * 自动执行开关，0：关闭、1：开启
     */
    private Integer auto;
    /**
     * 呼入自动执行开关，0：关闭、1：开启
     */
    private Integer autoIb;
    /**
     * 外呼自动执行开关，0：关闭、1：开启
     */
    private Integer autoOb;

    /**
     * 语音播放标签开关，0：关闭、1：开启
     */
    private Integer audioTag;

    /**
     * 语音播放标签对应的播放文件列表
     */
    private List<InvestigationAudioTagFileModel> audioTagFiles;

    public Integer getAuto() {
        return auto;
    }

    public void setAuto(Integer auto) {
        this.auto = auto;
    }

    public Integer getAutoIb() {
        return autoIb;
    }

    public void setAutoIb(Integer autoIb) {
        this.autoIb = autoIb;
    }

    public Integer getAutoOb() {
        return autoOb;
    }

    public void setAutoOb(Integer autoOb) {
        this.autoOb = autoOb;
    }

    public Integer getAudioTag() {
        return audioTag;
    }

    public void setAudioTag(Integer audioTag) {
        this.audioTag = audioTag;
    }

    public List<InvestigationAudioTagFileModel> getAudioTagFiles() {
        return audioTagFiles;
    }

    public void setAudioTagFiles(List<InvestigationAudioTagFileModel> audioTagFiles) {
        this.audioTagFiles = audioTagFiles;
    }
}
