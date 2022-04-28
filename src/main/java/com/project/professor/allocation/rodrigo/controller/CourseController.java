package com.project.professor.allocation.rodrigo.controller;

import com.project.professor.allocation.rodrigo.service.CourseService;

public class CourseController {

    private CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }
}
