package com.ronald.springsecurity.student;

public class Student {

    private final Integer studentId;
    private final String studentName;

    public Student(Integer sutdentId, String studentName) {
        this.studentId = sutdentId;
        this.studentName = studentName;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sutdentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}
