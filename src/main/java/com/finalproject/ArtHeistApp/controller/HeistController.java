package com.finalproject.ArtHeistApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HeistController {

	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	@RequestMapping("jobList")
	public ModelAndView jobList() {
		return new ModelAndView("jobList");
	}
	@RequestMapping("heisterAdmin")
	public ModelAndView heisterAdmin() {
		return new ModelAndView("heisterAdmin");
	}
	
}
// put a " new ModelAndView "redirect" in controllers?