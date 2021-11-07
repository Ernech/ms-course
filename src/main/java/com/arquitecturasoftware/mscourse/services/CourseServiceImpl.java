package com.arquitecturasoftware.mscourse.services;

import com.arquitecturasoftware.mscourse.entities.Course;
import com.arquitecturasoftware.mscourse.entities.Student;
import com.arquitecturasoftware.mscourse.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements ICourseService{

    @Autowired
    CourseRepository courseRepository;



    @Override
    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public List<Student> getStudentsByCourse(Integer course) {
        List<Integer> studentIds= courseRepository.getStudentsByCourse(course);
        RestTemplate restTemplate = new RestTemplate();
        Student[] students = restTemplate.getForObject("http://localhost:6945/v1/api/student/all", Student[].class);
        List<Student> studentsInCourse = Arrays.stream(students)
                .filter(student -> studentIds.contains(student.getStudentId())).collect(Collectors.toList());
        return studentsInCourse;
    }


}
