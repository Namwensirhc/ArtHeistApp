package com.finalproject.ArtHeistApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.finalproject.ArtHeistApp.entities.Artworks;

@Controller
public class ArtworkController {
	

	@RequestMapping("shopperResults")
	public ModelAndView shopperResults() {
		
		// Create the RestTemplate
		RestTemplate rt = new RestTemplate();
		
		Artworks art = rt.getForObject("https://collectionapi.metmuseum.org/public/collection/v1/objects/4117", Artworks.class);
		
		
		
		return new ModelAndView("results", "artworks", art);
	}
	
	
}
