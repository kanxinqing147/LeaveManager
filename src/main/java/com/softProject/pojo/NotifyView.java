package com.softProject.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NotifyView {
    Integer notifyId;
    String studentName;
    String teacherName;
    Date createTime;
    Date modifyTime;
    String actionDesc;

    public Integer getNotifyId() {
        return notifyId;
    }

    public void setNotifyId(Integer notifyId) {
        this.notifyId = notifyId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
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
        return "NotifyView{" +
                "notifyId=" + notifyId +
                ", studentName='" + studentName + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", createTime=" + createTime +
                ", modifyTime=" + modifyTime +
                ", actionDesc='" + actionDesc + '\'' +
                '}';
    }
}
