package com.finalproject.ArtHeistApp.entities;


import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown= true)
public class ArtworkResults {
//	@Id
	private int total;
	private int objectIDs[];
	
	public ArtworkResults() {
		super();
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int[] getObjectIDs() {
		return objectIDs;
	}

	public void setObjectIDs(int[] objectIDs) {
		this.objectIDs = objectIDs;
	}
	
	
	
	
	


}
