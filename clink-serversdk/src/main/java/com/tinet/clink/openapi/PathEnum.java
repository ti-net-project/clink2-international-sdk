package com.tinet.clink.openapi;

/**
 * @author wangll
 * @date 2019/2/19
 */
public enum PathEnum {
    //  座席设置
    CreateClient("create_client"),
    UpdateClient("update_client"),
    DeleteClient("delete_client"),
    ListClients("list_clients"),
    DescribeClient("describe_client"),
    BindClientTel("bind_client_tel"),
    BindClientTelVerification("bind_client_tel_verification"),
    BindClientTelConfirmed("bind_client_tel_confirmed"),
    UnbindClientTel("unbind_client_tel"),
    ListClientTels("list_client_tels"),
    DeleteClientTel("delete_client_tel"),
    //  队列设置
    CreateQueue("create_queue"),
    UpdateQueue("update_queue"),
    DeleteQueue("delete_queue"),
    ListQueues("list_queues"),
    DescribeQueue("describe_queue"),
    //  话机设置
    CreateExten("create_exten"),
    UpdateExten("update_exten"),
    DeleteExten("delete_exten"),
    ListExtens("list_extens"),
    DescribeExten("describe_exten"),
    // 号码设置
    ListClidNumbers("list_clid_numbers"),
    ListHotlineNumbers("list_hotline_numbers"),
    // 呼叫控制
    Online("online"),
    Offline("offline"),
    Pause("pause"),
    Unpause("unpause"),
    Callout("callout"),
    CalloutCancel("callout_cancel"),
    Unlink("unlink"),
    Refuse("refuse"),
    Transfer("transfer"),
    Interact("interact"),
    Consult("consult"),
    ConsultCancel("consult_cancel"),
    ConsultTransfer("consult_transfer"),
    ConsultThreeway("consult_threeway"),
    Unconsult("unconsult"),
    Hold("hold"),
    Unhold("unhold"),
    Mute("mute"),
    Unmute("unmute"),
    Dtmf("dtmf"),
    Investigation("investigation"),
    // 呼叫管理
    Spy("spy"),
    Threeway("threeway"),
    Whisper("whisper"),
    Disconnect("disconnect"),
    Barge("barge"),
    PauseClient("pause_client"),
    UnpauseClient("unpause_client"),
    //  呼入通话记录
    ListCdrIbs("list_cdr_ibs"),
    DescribeCdrIb("describe_cdr_ib"),
    DescribeCdrIbDetails("describe_cdr_ib_details"),
    CopyCdrIbs("copy_cdr_ibs"),
    CopyCdrIbDetails("copy_cdr_ib_details"),
    // 外呼通话记录
    ListCdrObs("list_cdr_obs"),
    DescribeCdrOb("describe_cdr_ob"),
    DescribeCdrObDetails("describe_cdr_ob_details"),
    CopyCdrObs("copy_cdr_obs"),
    CopyCdrObDetails("copy_cdr_ob_details"),
    //  留言记录
    ListComments("list_comments"),
    // 满意度记录
    ListInvestigations("list_investigations"),
    // 下载通话录音文件
    DownloadRecordFile("download_record_file"),
    // 查询通话录音url
    DescribeRecordFileUrl("describe_record_file_url"),
    // 语音导航
    ListIvrs("list_ivrs"),
    ListIvrNodes("list_ivr_nodes"),
    // 座席状态监控
    AgentStatus("agent_status"),
    // 队列状态监控
    QueueStatus("queue_status"),
    //客户资料-获取可用查询参数
    CustomerParam("customer_params"),
    //客户资料-查询客户资料列表
    ListCustomers("list_customers"),
    //创建客户资料
    CreateCustomer("create_customer"),

    //更新客户资料
    UpdateCustomer("update_customer"),

    //更新客户资料
    UpdateCustomerByExternalId("update_customer_by_external_id"),
    //创建客户资料
    ListCustomerField("list_customer_field"),

    //短信发送
    SmsSend("sms_send"),

    //座席工作量报表
    StatClientWorkload("stat_client_workload"),
    //队列报表
    StatQueue("stat_queue"),
    // webcall
    Webcall("webcall"),
    //状态统计报表
    StatClientStatus("stat_client_status"),

    // 下载留言录音文件
    DownloadCommentFile("download_comment_file"),

    // 查询留言录音url
    DescribeCommentFileUrl("describe_comment_file_url"),

    // 获取业务记录自定义字段
    ListBusinessCustomizeField("list_business_customize_field"),
    // 查询业务记录信息
    ListBusiness("list_business"),
    // 更新业务记录
    UpdateBusiness("update_business"),
    // 创建业务记录
    CreateBusiness("create_business"),
    // 查询企业置忙状态
    ListEnterprisePauseStatus("list_enterprise_pause_status");

    private String value;

    PathEnum(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
