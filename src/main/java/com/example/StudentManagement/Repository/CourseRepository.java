package com.example.StudentManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.StudentManagement.Entity.Course;
 

public interface CourseRepository extends JpaRepository<Course, Long>{
 
}

