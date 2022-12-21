package com.example.StudentManagement.Controller;




import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.StudentManagement.Entity.Login;
import com.example.StudentManagement.Service.LoginService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
 


@Controller
public class LoginController {
	@Autowired
    private LoginService userService;
 
                                  
    @GetMapping("/login")
          
    public ModelAndView login() {
     ModelAndView mav = new ModelAndView("login");
        mav.addObject("user", new Login());
        return mav;
    }
    @GetMapping("/admin")
    
    public ModelAndView admin() {
     ModelAndView mav = new ModelAndView("admin");
        mav.addObject("user", new Login());
        return mav;
    }
 
    @PostMapping("/admin")
    public String login(@ModelAttribute("user") Login user ) {
    
     Login oauthUser = userService.login(user.getUsername(), user.getPassword());
    
     System.out.print(oauthUser);
     if(Objects.nonNull(oauthUser))
     {
  
     return "redirect:/Course";
    
    
     } else {
    
     return "redirect:/";
    
    
     }
 
    }
    
    @RequestMapping(value = {"/logout"}, method = RequestMethod.POST)
    public String logoutDo(HttpServletRequest request,HttpServletResponse response)
    {
    
  
        return "redirect:/login";
    }
 

}

