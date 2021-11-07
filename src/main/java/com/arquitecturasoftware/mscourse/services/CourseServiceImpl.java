package com.arquitecturasoftware.mscourse.services;

import com.arquitecturasoftware.mscourse.entities.Course;
import com.arquitecturasoftware.mscourse.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements ICourseService{

    @Autowired
    CourseRepository courseRepository;

    @Override
    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }
}
