package com.softProject.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Notify {
    int notifyId;
    int applicantId;
    int handlerId;
    Date createTime;
    Date modifyTime;
    String actionDesc;

    public int getNotifyId() {
        return notifyId;
    }

    public void setNotifyId(int notifyId) {
        this.notifyId = notifyId;
    }

    public int getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(int applicantId) {
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

    public String getCreateTimeStr() {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy" + "年" + "MM" + "月" + "dd" + "日");
        return ft.format(createTime);
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public String getModifyTimeStr() {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy" + "年" + "MM" + "月" + "dd" + "日");
        return ft.format(modifyTime);
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
