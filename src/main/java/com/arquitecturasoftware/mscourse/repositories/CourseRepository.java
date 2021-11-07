package com.arquitecturasoftware.mscourse.repositories;

import com.arquitecturasoftware.mscourse.entities.Course;
import com.arquitecturasoftware.mscourse.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Integer> {

    @Query("SELECT c.studentId FROM Course c WHERE c.course = ?1")
    List<Integer> getStudentsByCourse(Integer course);

}
