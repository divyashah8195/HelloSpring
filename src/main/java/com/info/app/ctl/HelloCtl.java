package com.info.app.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.info.app.entity.Course;
import com.info.service.CourseService;

@RestController
public class HelloCtl {


	@Autowired
	public CourseService service;
	
	@GetMapping("/home")
	public String name(){
		return "hello world";
	}
	
	@GetMapping("/corses/id")
	public List<Course> getCourse(){
		return this.service.getCourses();	
	}
	
	@GetMapping("/corses/{id}")
	public Course getCourses(@PathVariable String courseid){
		return this.service.getCourse(Long.parseLong(courseid));	
	}
}
