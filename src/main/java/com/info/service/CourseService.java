package com.info.service;

import java.util.List;

import com.info.app.entity.Course;


public interface CourseService {

	
	public List<Course> getCourses();
	
	
	public Course getCourse(long id);
}
