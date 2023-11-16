package com.te.springmvcpractice.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.te.springmvcpractice.beans.UserDetails;

@Controller
public class ReadForm {

	@GetMapping("/user1")
	public String displayFormPage() {
		return "form";
	}
	
	@PostMapping("/login1")
	public ModelAndView getDataOne(HttpServletRequest req, ModelAndView modelAndView) {
		
		Integer id = Integer.parseInt(req.getParameter("id"));
		String mail = req.getParameter("email");
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		Integer age = Integer.parseInt(req.getParameter("age"));
		String role = req.getParameter("role");
		Double salary = Double.parseDouble(req.getParameter("salary"));
		
		modelAndView.addObject("userId", id);
		modelAndView.addObject("email", mail);
		modelAndView.addObject("userName", name);
		modelAndView.addObject("password", password);
		modelAndView.addObject("age", age);
		modelAndView.addObject("role", role);
		modelAndView.addObject("salary", salary);
		modelAndView.setViewName("userdetails");
		return modelAndView;
	}
	
	@PostMapping("/login2")
	public String getDataTwo(@RequestParam(name = "id") Integer empId,@RequestParam(name = "mail") String empMail,
			@RequestParam(name = "") String name, @RequestParam(name = "password") String empPwd,
			@RequestParam(name = "age") Integer empAge, @RequestParam(name = "role") String empRole,@RequestParam(name = "salary") Double empSalary, ModelMap modelMap) {
		modelMap.addAttribute("userId", empId);
		modelMap.addAttribute("mail", empMail);
		modelMap.addAttribute("userName", name);
		modelMap.addAttribute("password", empPwd);
		modelMap.addAttribute("age", empAge);
		modelMap.addAttribute("role", empRole);
		modelMap.addAttribute("salary", empSalary);
		return "userdetails";
	}
	
	@PostMapping("/login3")
	public String getDataThree(Integer id,String mail, String name,String password,Integer age,
			String role,Double salary, ModelMap modelMap) {
		modelMap.addAttribute("userId", id);
		modelMap.addAttribute("mail", mail);
		modelMap.addAttribute("userName", name);
		modelMap.addAttribute("password", password);
		modelMap.addAttribute("age", age);
		modelMap.addAttribute("role", role);
		modelMap.addAttribute("salary", salary);
		return "userdetails";
	}
	
	@PostMapping("/login4")
	public String getDataFour(UserDetails user, ModelMap map) {
		map.addAttribute("data", user);
		
		return "userdetails";
	}
}
