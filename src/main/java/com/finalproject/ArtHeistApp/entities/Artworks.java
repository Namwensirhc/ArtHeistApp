 package com.finalproject.ArtHeistApp.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties (ignoreUnknown=true)
public class Artworks {
	
	private Integer objectID;
	private String title;
	private String artistDisplayName;
	private String dimensions;
	private String primaryImage;
	
	public Artworks() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Artworks(Integer objectID, String title, String artistDisplayName, String dimensions, String primaryImage) {
		super();
		this.objectID = objectID;
		this.title = title;
		this.artistDisplayName =artistDisplayName;
		this.dimensions=dimensions;
		this.primaryImage= primaryImage;
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
	
	public String getArtistDisplayName() {
		return artistDisplayName;
	}
	public void setArtistDisplayName(String artistDisplayName) {
		this.artistDisplayName = artistDisplayName;
	}
		
	public String getDimensions() {
		return dimensions;
	}
	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}
	
	
	public String getPrimaryImage() {
		return primaryImage;
	}
	public void setPrimaryImage(String primaryImage) {
		this.primaryImage = primaryImage;
	}
	
	@Override
	public String toString() {
		return "Artworks [objectID=" + objectID + ", title=" + title + ", artistDisplayName=" + artistDisplayName + ", dimensions=" + dimensions +", primaryImage=" + primaryImage +", ]";
	}
	
}


