package com.finalproject.ArtHeistApp.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.finalproject.ArtHeistApp.entities.ArtworkResults;
import com.finalproject.ArtHeistApp.entities.Artworks;

@Controller
public class ArtworkController {

//	@Autowired
//	ArtworkRepo a;

//	@RequestMapping("shopperResults")
//	public ModelAndView shopperResults() {
//		
//		// Create the RestTemplate
//		RestTemplate rt = new RestTemplate();
//		
//		Artworks art = rt.getForObject("https://collectionapi.metmuseum.org/public/collection/v1/objects/222", Artworks.class);
//				
//		return new ModelAndView("results", "artworks", art);
//	}

//	@RequestMapping("/searchbydate")
//	public ModelAndView searchByDate() {
//
//		RestTemplate rT = new RestTemplate();
//		ResponseEntity<Artworks> response = rT.exchange(
//				"https://collectionapi.metmuseum.org/public/collection/v1/objects/", HttpMethod.GET, null,
//				Artworks.class);
//		ArrayList<Integer> objectIDs = new ArrayList<Integer>(Arrays.asList(response.getBody().getObjectID()));
//		return new ModelAndView("dateresults", "dateresults", objectIDs);
//	}

	@RequestMapping("/realsearchdate")
	public ModelAndView resSearchDate(
//			@RequestParam(name="enddate", required=false) String objectEndDate
			) {
		RestTemplate rT = new RestTemplate();
		ArtworkResults art = rT.getForObject("https://collectionapi.metmuseum.org/public/collection/v1/objects/", ArtworkResults.class);
		
		
//		ResponseEntity<ArtworkResults> response = rT.exchange(
//				"https://collectionapi.metmuseum.org/public/collection/v1/objects/", HttpMethod.GET, null,
//				ArtworkResults.class);
//		System.out.println(response);
//		ArrayList<Integer> objectIDs = new ArrayList<Integer>(Arrays.asList(response.getBody().getObjectIDs());
//		
//		System.out.println(objectIDs);

//		List<ArtworkResults> list = new ArrayList<ArtworkResults>();

//		for (int i = 0; i < objectIDs.size(); i++) {
//			Artworks response1 = rT.getForObject(
//					"https://collectionapi.metmuseum.org/public/collection/v1/objects/" + i, Artworks.class);
//			//list.add(index, element);
//		}
		return new ModelAndView("index");
	}

//	@RequestMapping("/search")
//	public ModelAndView search(@RequestParam("objectEndDate") Integer objectEndDate) {
//		a.findByobjectEndDateContaining(objectEndDate);
//		return new ModelAndView("searchstuff", "results", a.findByobjectEndDateContaining(objectEndDate));
//	}

}
