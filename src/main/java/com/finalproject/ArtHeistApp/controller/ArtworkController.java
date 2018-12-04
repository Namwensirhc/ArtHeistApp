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


	@RequestMapping("/searchbydate")
	public ModelAndView searchByDate() {
		RestTemplate rT = new RestTemplate();
		ResponseEntity<ArtworkResults> response = rT.exchange(
				"https://collectionapi.metmuseum.org/public/collection/v1/objects", HttpMethod.GET, null,
				ArtworkResults.class);
		ArrayList<Integer> objectIDs = new ArrayList<Integer>(Arrays.asList(response.getBody().getObjectIDs()));

		return new ModelAndView("index", "dateresults", objectIDs);
	}

	@RequestMapping("/realsearchbydate")
	public ModelAndView realSearchByDate(@RequestParam("enddate") String objectEndDate) {
		RestTemplate rT = new RestTemplate();
		List<Artworks> list = new ArrayList<Artworks>();
		Artworks aO = null;
		for (int i = 0; i < 5; ++i) {
			aO = rT.getForObject(
					"https://collectionapi.metmuseum.org/public/collection/v1/objects/" + i, Artworks.class);
		}
		if (aO.getObjectEndDate().equals(objectEndDate)) {
			list.add(aO);
		}

		return new ModelAndView("shopperResults", "realdateresults", list);
	}	
		
		
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
//		return new ModelAndView("index");
//	}

//	@RequestMapping("/search")
//	public ModelAndView search(@RequestParam("objectEndDate") Integer objectEndDate) {
//		a.findByobjectEndDateContaining(objectEndDate);
//		return new ModelAndView("searchstuff", "results", a.findByobjectEndDateContaining(objectEndDate));
//	}

}
