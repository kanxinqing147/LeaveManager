package com.softProject.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Notify {
    Integer notifyId;
    Integer applicantId;
    int handlerId;
    Date createTime;
    Date modifyTime;
    String actionDesc;

    public Integer getNotifyId() {
        return notifyId;
    }

    public void setNotifyId(Integer notifyId) {
        this.notifyId = notifyId;
    }

    public Integer getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(Integer applicantId) {
        this.applicantId = applicantId;
    }

    public int getHandlerId() {
        return handlerId;
    }

    public void setHandlerId(int handlerId) {
        this.handlerId = handlerId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getActionDesc() {
        return actionDesc;
    }

    public void setActionDesc(String actionDesc) {
        this.actionDesc = actionDesc;
    }

    public String getCreateTimeStr() {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy" + "年" + "MM" + "月" + "dd" + "日");
        return ft.format(createTime);
    }

    public String getModifyTimeStr() {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy" + "年" + "MM" + "月" + "dd" + "日");
        return ft.format(modifyTime);
    }

    @Override
    public String toString() {
        return "Notify{" +
                "notifyId=" + notifyId +
                ", applicantId=" + applicantId +
                ", handlerId=" + handlerId +
                ", createTime=" + createTime +
                ", modifyTime=" + modifyTime +
                ", actionDesc='" + actionDesc + '\'' +
                '}';
    }
}
