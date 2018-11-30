package com.finalproject.ArtHeistApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ArtworkController {
	
	@RequestMapping("/") //Not sure if this is needed in all controllers?
	public ModelAndView index() {
		return new ModelAndView("index");
	}

	@RequestMapping("/artDetails")
	public ModelAndView showartDetails() { //Is showartDetails valid? is it just artDetails?
		return new ModelAndView("artDetails");
	
}
	@RequestMapping("artWorkList")
	public ModelAndView artWorkList() {
		return new ModelAndView("artWorkList");
	}
	@RequestMapping("shopperResults")
	public ModelAndView shopperResults() {
		return new ModelAndView("shopperResults");
	}
	
	
}
