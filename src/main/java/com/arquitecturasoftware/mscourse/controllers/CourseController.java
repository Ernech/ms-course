package com.arquitecturasoftware.mscourse.controllers;

import com.arquitecturasoftware.mscourse.entities.Course;
import com.arquitecturasoftware.mscourse.services.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/course")
public class CourseController {

    @Autowired
    CourseServiceImpl courseService;


    @PostMapping
    public Course createNewCourse(@RequestBody Course course){
            return courseService.createCourse(course);

    }

}
