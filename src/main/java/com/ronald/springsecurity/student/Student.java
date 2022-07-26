package com.ronald.springsecurity.student;

public class Student {

    private final Integer sutdentId;
    private final String studentName;

    public Student(Integer sutdentId, String studentName) {
        this.sutdentId = sutdentId;
        this.studentName = studentName;
    }

    public Integer getStudentId() {
        return sutdentId;
    }

    public String getStudentName() {
        return studentName;
    }
}
