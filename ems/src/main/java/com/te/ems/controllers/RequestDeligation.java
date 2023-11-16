package com.te.ems.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RequestDeligation {

	@GetMapping("/linkedIn")
	public String StringredirectReq() {
		return "redirect:https://www.linkedin.com";
	}//redirecting the Request
	
	@GetMapping("/user")
	public String forwardReq() {
		return "forward:login";
	}//forwarding the request
	
}
