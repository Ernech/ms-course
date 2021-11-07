package com.arquitecturasoftware.mscourse.services;

import com.arquitecturasoftware.mscourse.entities.Course;
import com.arquitecturasoftware.mscourse.entities.Student;

import java.util.List;

public interface ICourseService {

    Course createCourse(Course course);

        List<Student> getStudentsByCourse(Integer course);

}
