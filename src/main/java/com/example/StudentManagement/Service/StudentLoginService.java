package com.example.StudentManagement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentManagement.Entity.Login;
import com.example.StudentManagement.Entity.StudentLogin;
import com.example.StudentManagement.Repository.StudentLoginRepository;

@Service
public class StudentLoginService {
	@Autowired
	private StudentLoginRepository repo;
	
	public Login student_login (String username, String password) {
		  Login user = repo.findByUsernameAndPassword(username, password);
		   return user;
		  }
}

