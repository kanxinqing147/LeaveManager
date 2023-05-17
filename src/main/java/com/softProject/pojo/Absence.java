package com.softProject.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Absence {
    int absenceId;
    String studentName;
    Date startTime;
    Date endTime;
    boolean approve;
    String reason;

    public int getAbsenceId() {
        return absenceId;
    }

    public void setAbsenceId(int absenceId) {
        this.absenceId = absenceId;
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

    public String getStartTimeStr() {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy" + "年" + "MM" + "月" + "dd" + "日");
        return ft.format(startTime);
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public String getEndTimeStr() {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy" + "年" + "MM" + "月" + "dd" + "日");
        return ft.format(endTime);
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public boolean isApprove() {
        return approve;
    }

    public void setApprove(boolean approve) {
        this.approve = approve;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "Absence{" +
                "absenceId=" + absenceId +
                ", studentName='" + studentName + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", approve=" + approve +
                ", reason='" + reason + '\'' +
                '}';
    }
}