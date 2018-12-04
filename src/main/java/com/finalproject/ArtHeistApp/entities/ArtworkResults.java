package com.finalproject.ArtHeistApp.entities;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown= true)

public class ArtworkResults {

	private Integer total;
	private Integer[] objectIDs;

	public ArtworkResults() {

	}

	public ArtworkResults(Integer total, Integer[] objectIDs) {
		this.total = total;
		this.objectIDs = objectIDs;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer[] getObjectIDs() {
		return objectIDs;
	}

	public void setObjectIDs(Integer[] objectIDs) {
		this.objectIDs = objectIDs;
	}

	@Override
	public String toString() {
		return "Artworks [total=" + total + ", objectIDs=" + objectIDs + "]";
	}
}