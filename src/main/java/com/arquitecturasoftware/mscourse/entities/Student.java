package com.arquitecturasoftware.mscourse.entities;

public class Student {

    private Integer studentId;
    private String name;
    private String lastName;
    private String phone;

    public Student() {
    }

    public Student(Integer studentId, String name, String lastName, String phone) {
        this.studentId = studentId;
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
