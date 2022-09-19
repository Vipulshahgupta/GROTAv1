package com.guptastore.gupta.daorepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guptastore.gupta.entities.Course;

public interface CourseDaoRepo extends JpaRepository<Course, Long> {

}
