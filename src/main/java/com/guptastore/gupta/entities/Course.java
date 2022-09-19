package com.guptastore.gupta.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	@Id
	private long courseId;
	private String courseName;
	private String courseDescription;
//	public Course(long courseId, String courseName, String courseDescription) {
//		super();
//		this.courseId = courseId;
//		this.courseName = courseName;
//		this.courseDescription = courseDescription;
//	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getCourseId() {
		return courseId;
	}
	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseDescription="
				+ courseDescription + "]";
	}
	
	
	

}
