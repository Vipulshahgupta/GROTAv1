package com.guptastore.gupta.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guptastore.gupta.daorepo.CourseDaoRepo;
import com.guptastore.gupta.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
//	public List<Course> l2;
	@Autowired
	private CourseDaoRepo courseDaorepo;
	
	public CourseServiceImpl() 
	{
//		l2 = new ArrayList<>();
//		l2.add(new Course(10,"Java","Programming language"));
//		l2.add(new Course(11,"Python","Popular language"));
	}
	
	
	@Override
	public List<Course> getCourses() {
		
//		return l2;
		return courseDaorepo.findAll();
	}


	@Override
	public Course getCourses(long courseId) {
		
//		Course c =null;
//		for(Course cc:l2) 
//		{
//			if(cc.getCourseId()==courseId)
//			{
//				c=cc;
//				break;
//			}
//		}
//		
		
//		return c;
//		Course en= null;
//		en = courseDaorepo.getOne(courseId);
//		return en;
		return courseDaorepo.findById(courseId).get();
	}


	@Override
	public Course addCourses(Course course) {
		
//		l2.add(course);
		courseDaorepo.save(course);
		return course;
	}


	@Override
	public Course updateCourses(Course course) {
		
//		l2.forEach(e -> {
//			
//			if(e.getCourseId()==course.getCourseId()) 
//			{
//				e.setCourseName(course.getCourseName());
//				e.setCourseDescription(course.getCourseDescription());
//			}
//			
//		});
//		
//		return course;
		courseDaorepo.save(course);
		return course;
	}


	@Override
	public void deleteCourses(long courseId) {
//		Course cs=null;
//		for (Course i: l2) {
//			
//			if(i.getCourseId()==courseId) 
//			{
//				cs=i;
//				break;
//			}
//			
//		}
//		
//		l2.remove(cs);
		
		Course en = courseDaorepo.getOne(courseId);
		courseDaorepo.delete(en);
	}

}
