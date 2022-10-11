package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;

@RestController
public class MyController {
@Autowired     //object creation to let know spring boot that object is created here and is injeced to cs
private CourseService courseservice;

//get the courses
@GetMapping("/courses")
public List<Course>getCourses()
{
	return this.courseservice.getCourses();
}
@PostMapping("/courses")
public Course addCourse(@RequestBody Course course) {
	return this.courseService.addCourse(course);
}

}
