package com.springmvc.mvc.comtroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.mvc.service.LoginService;
import com.springmvc.mvc.user.User;

@Controller
public class LoginController {
	
	@Autowired
	LoginService service ;
	
	
	
	@ModelAttribute
	public void commonDta(Model m) {
		
		m.addAttribute("header", "welcome all");
	}
	
	
	
	@RequestMapping("/demo")
	public String shorDemo(Model model) {
		model.addAttribute("id", 123);
		return "demo";
	}
	
//	@RequestMapping("/demo")
//	public ModelAndView showDemo() {
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("id",123);
//		mav.setViewName("demo");
//		return mav;
//	}
	
	
	
	// method=RequestMethod.GET restricts it to only serve get request 
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String showLogin() {
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String handleLoginReq(@ModelAttribute User user, Model model ) {
				
				return "welcome";
	}
	
	
	
}



//
//@RequestMapping(value="/login", method=RequestMethod.POST)
//public String handleLoginReq(@RequestParam String emailFilled,@RequestParam String pass, ModelMap model ) {
//			model.put("emailShow", emailFilled);
//			model.put("passShow", pass);
//			System.out.println(emailFilled);		
//			return "welcome";
//}
//


//
//@RequestMapping(value="/login", method=RequestMethod.POST)
//public String handleLoginReq(@RequestParam String emailFilled,@RequestParam String pass, ModelMap model ) {
//			User us = new User();
//			us.setEmailFilled(emailFilled);
//			us.setPass(pass);
//			
//			model.addAttribute("user", us);
//			
//			return "welcome";
//}
//
//can use form tag library so that no need of set here 
// <form:form action"submitForm" modelAttribute="us"
//<form:input path="pass" and it directly related to pass in user pojo













