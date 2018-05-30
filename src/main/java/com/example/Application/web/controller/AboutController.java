package com.example.Application.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/abouts")
public class AboutController {
	
	
	@GetMapping("/about")
	public String about() {
		return "/perfils/about";
	}


}
