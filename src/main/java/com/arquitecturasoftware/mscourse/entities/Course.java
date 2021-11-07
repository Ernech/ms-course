package com.arquitecturasoftware.mscourse.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer courseId;
    Integer teacherId;
    Integer studentId;
    Integer course;
    String gradeDescription;

    public Course() {
    }

    public Course(Integer courseId, Integer teacherId, Integer studentId, Integer course, String gradeDescription) {
        this.courseId = courseId;
        this.teacherId = teacherId;
        this.studentId = studentId;
        this.course = course;
        this.gradeDescription = gradeDescription;
    }


    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public String getGradeDescription() {
        return gradeDescription;
    }

    public void setGradeDescription(String gradeDescription) {
        this.gradeDescription = gradeDescription;
    }
}
