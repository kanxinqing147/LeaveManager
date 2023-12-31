package com.softProject.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Absence {
    Integer absenceId;
    Integer studentId;
    String studentName;
    Date startTime;
    Date endTime;
    Boolean approve;
    String reason;

    public Integer getAbsenceId() {
        return absenceId;
    }

    public void setAbsenceId(Integer absenceId) {
        this.absenceId = absenceId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Boolean getApprove() {
        return approve;
    }

    public void setApprove(Boolean approve) {
        this.approve = approve;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getStartTimeStr() {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy" + "年" + "MM" + "月" + "dd" + "日");
        return ft.format(startTime);
    }

    public String getEndTimeStr() {
        if (endTime == null) {
            return "";
        }
        SimpleDateFormat ft = new SimpleDateFormat("yyyy" + "年" + "MM" + "月" + "dd" + "日");
        return ft.format(endTime);
    }

    public String getApproveStr() {
        return approve ? "已批准" : "未批准";
    }

    @Override
    public String toString() {
        return "Absence{" +
                "absenceId=" + absenceId +
                ", studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", approve=" + approve +
                ", reason='" + reason + '\'' +
                '}';
    }
}
