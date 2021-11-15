package com.arquitecturasoftware.mscourse.controllers;

import com.arquitecturasoftware.mscourse.entities.Course;
import com.arquitecturasoftware.mscourse.entities.Student;
import com.arquitecturasoftware.mscourse.services.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/v1/api/course")
public class CourseController {

    @Autowired
    CourseServiceImpl courseService;


    @PostMapping
    public Course createNewCourse(@RequestBody Course course){
            return courseService.createCourse(course);

    }


    @GetMapping(path = "/students/{course}")
    public List<Student> getStudentsFromCourse(@PathVariable(value = "course") Integer course){


        return courseService.getStudentsByCourse(course);
    }



}
