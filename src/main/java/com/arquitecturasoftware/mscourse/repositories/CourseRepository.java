package com.arquitecturasoftware.mscourse.repositories;

import com.arquitecturasoftware.mscourse.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {


}
