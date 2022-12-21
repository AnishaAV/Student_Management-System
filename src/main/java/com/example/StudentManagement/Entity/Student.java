
package com.example.StudentManagement.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
 

@Entity
@Table(name="student")
public class Student {
 
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String stname;
private String course;
private int fee;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getStname() {
	return stname;
}
public void setStname(String stname) {
	this.stname = stname;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public int getFee() {
	return fee;
}
public void setFee(int fee) {
	this.fee = fee;
}
 

 
}
