package com.info.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.info.app.entity.Course;

@Service
public class CourseServiceImpl implements CourseService{

	List<Course> l;
	
	public  CourseServiceImpl(){
		l=new ArrayList<>();
		l.add(new Course(1,"sd"));
		l.add(new Course(2,"sdsds"));
		
	}
	
	@Override
	public List<Course> getCourses() {
		return l;
	}

	@Override
	public Course getCourse(long id) {
	
		Course c = null;
		for(Course course:l){
			if(course.getId()==id){
				c=course;
				break;
			}
		}
		return c;
	}

}
