package com.finalproject.ArtHeistApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShopperController {

	//Probably will need sometime of shopper form
	@RequestMapping("shopper")
	public ModelAndView Shopper() {
		return new ModelAndView("shopper");
	
	}
	
	@RequestMapping("results") //if heister accepted/completed job? Art is already listed in another job
	public ModelAndView results() {
		return new ModelAndView("results");
	}
}
