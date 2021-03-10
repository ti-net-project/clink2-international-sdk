package com.tinet.clink.openapi.model;

/**
 * 满意度语音播放标签对应的文件
 *
 * @author zhangxy13@asiainfo-int.com
 * @since 2021/02/03
 */
public class InvestigationAudioTagFileModel {
    /**
     * 播放的tag名称
     */
    private String tagName;

    /**
     * 选择节点播放的语音
     */
    private String selectFilePath;

    /**
     * 播放节点播放的语音
     */
    private String playFilePath;

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getSelectFilePath() {
        return selectFilePath;
    }

    public void setSelectFilePath(String selectFilePath) {
        this.selectFilePath = selectFilePath;
    }

    public String getPlayFilePath() {
        return playFilePath;
    }

    public void setPlayFilePath(String playFilePath) {
        this.playFilePath = playFilePath;
    }
}
