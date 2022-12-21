package com.example.StudentManagement.Controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.StudentManagement.Entity.Login;
import com.example.StudentManagement.Entity.StudentLogin;
import com.example.StudentManagement.Service.StudentLoginService;




@Controller
public class StudentLoginController {

@Autowired
private StudentLoginService userService;

@GetMapping("/student_login")
    public ModelAndView student_login() {
     ModelAndView mav = new ModelAndView("student_login");
        mav.addObject("user", new StudentLogin());
        return mav;
    }
 
    @PostMapping("/student_login")
    public String student_login(@ModelAttribute("user") StudentLogin user ) {
    
     Login oauthUser = userService.student_login(user.getUsername(), user.getPassword());
    
     System.out.print(oauthUser);
     if(Objects.nonNull(oauthUser))
     {
  
     return "redirect:/";
    
    
     } else {
    
     return "redirect:/Student";
    
    
     }
 
    }

}
