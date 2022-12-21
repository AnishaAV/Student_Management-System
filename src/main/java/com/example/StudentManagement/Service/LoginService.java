package com.example.StudentManagement.Service;
import org.springframework.stereotype.Service;

import com.example.StudentManagement.Entity.Login;
import com.example.StudentManagement.Repository.LoginRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 

@Service
public class LoginService {
	@Autowired
	private LoginRepository repo;
	  
	  public Login login(String username, String password) {
	  Login user = repo.findByUsernameAndPassword(username, password);
	   return user;
	  }

}