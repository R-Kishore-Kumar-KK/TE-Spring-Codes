package com.te.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringMvcController {

	@RequestMapping(path = "/welcome", method = RequestMethod.GET)
	public ModelAndView getWelcomePage() {
		System.out.println("This is Handler method");
		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.setViewName("/WEB-INF/views/welcome.jsp");
		modelAndView.setViewName("welcome");
		return modelAndView;
	}
	
	@RequestMapping(path = "/hello", method = RequestMethod.GET)
	public ModelAndView getPage(ModelAndView modelAndView) {
//		modelAndView.setViewName("/WEB-INF/views/welcome.jsp");
		modelAndView.setViewName("welcome");
		return modelAndView;
	}
	
	@GetMapping("/read")
	public String getData(Integer id) {
		System.out.println("Param value = " + id);
		return "welcome";
	}
}
