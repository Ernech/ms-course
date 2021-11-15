package com.arquitecturasoftware.mscourse.services;

import com.arquitecturasoftware.mscourse.entities.Course;
import com.arquitecturasoftware.mscourse.entities.Student;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface ICourseService {

    Course createCourse(Course course);

    List<Student> getStudentsByCourse(Integer course);


}
