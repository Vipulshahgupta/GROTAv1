package com.guptastore.gupta.services;

import java.util.List;

import com.guptastore.gupta.entities.Course;

public interface CourseService {

	public List<Course> getCourses();
	

	public Course getCourses(long courseId);
	
	public Course addCourses(Course course);
	
	public Course updateCourses(Course course);

	public void deleteCourses(long courseId);
	
}
