package com.finalproject.ArtHeistApp.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties (ignoreUnknown=true)
public class Artworks {
	
	private Integer objectID;
	private String title;
	
	
	public Artworks() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Artworks(Integer objectID, String title) {
		super();
		this.objectID = objectID;
		this.title = title;
	}
	public Integer getObjectID() {
		return objectID;
	}
	public void setObjectID(Integer objectID) {
		this.objectID = objectID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Artworks [objectID=" + objectID + ", title=" + title + "]";
	}
	
	
	
}


