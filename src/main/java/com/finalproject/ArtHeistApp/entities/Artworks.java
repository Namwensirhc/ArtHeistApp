package com.finalproject.ArtHeistApp.entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties (ignoreUnknown=true)
public class Artworks {
	
	private Integer objectID;
	private String title;
	private Integer objectEndDate;
	private String dimensions;
	private String primaryImage;
	private String artistDisplayName;
	
	
	public Artworks() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Artworks(Integer objectID, String title, Integer objectEndDate, String dimensions, String primaryImage,
			String artistDisplayName) {
		super();
		this.objectID = objectID;
		this.title = title;
		this.objectEndDate = objectEndDate;
		this.dimensions = dimensions;
		this.primaryImage = primaryImage;
		this.artistDisplayName = artistDisplayName;
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


	public Integer getObjectEndDate() {
		return objectEndDate;
	}


	public void setObjectEndDate(Integer objectEndDate) {
		this.objectEndDate = objectEndDate;
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


	public String getName() {
		return artistDisplayName;
	}


	public void setName(String artistDisplayName) {
		this.artistDisplayName = artistDisplayName;
	}


	@Override
	public String toString() {
		return "Artworks [objectID=" + objectID + ", title=" + title + ", objectEndDate=" + objectEndDate
				+ ", dimensions=" + dimensions + ", primaryImage=" + primaryImage + ", artistDisplayName=" + artistDisplayName + "]";
	}

	
	
	
}


