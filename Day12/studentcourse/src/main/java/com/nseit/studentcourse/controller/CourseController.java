package com.nseit.studentcourse.controller;

import com.nseit.studentcourse.model.Course;
import com.nseit.studentcourse.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @PostMapping
    public void add(@RequestBody Course course) {
        courseService.add(course);
    }

    @GetMapping("/all")
    public List<Course> view() {
        return courseService.view();

    }

    @PutMapping
    public void update(@RequestBody Course course) {

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {

    }
}
