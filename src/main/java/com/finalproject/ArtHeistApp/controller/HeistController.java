package com.finalproject.ArtHeistApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HeistController {
	

	@RequestMapping("heistJobList")
	public ModelAndView heistJobList() {
		return new ModelAndView("heistJobList");
	}
	@RequestMapping("heisterResults")
	public ModelAndView heisterResults() {
		return new ModelAndView("heisterResults");
	}
	
	@RequestMapping("heisterAdmin") //For us on the backend only, where heist info submits too
	public ModelAndView heisterAdmin() {
		return new ModelAndView("heisterAdmin");
	}
	
}
// put a " new ModelAndView "redirect" in controllers?