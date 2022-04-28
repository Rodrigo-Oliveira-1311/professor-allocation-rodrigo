package com.project.professor.allocation.rodrigo.repository;

import com.project.professor.allocation.rodrigo.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findByNameContaining(String partName);
}
