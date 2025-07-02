package com.example.xyramIRTC.payloads;

public class ClassEntityDto {


    private int classId;
    private String className;
    private String classCode;
    private String seatPerCoach;


    public int getClassId() {
        return classId;
    }
    public void setClassId(int classId) {
        this.classId = classId;
    }
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
    public String getClassCode() {
        return classCode;
    }
    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }
    public String getSeatPerCoach() {
        return seatPerCoach;
    }
    public void setSeatPerCoach(String seatPerCoach) {
        this.seatPerCoach = seatPerCoach;
    }

}
