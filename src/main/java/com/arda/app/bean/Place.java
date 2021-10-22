package com.arda.app.bean;

import javax.persistence.Embeddable;

//ArdaRugj
//Cis175
//21 Oct 2021

@Embeddable
public class Place {
	private String venue;
	private String state;

	public Place() {
		super();
	}

	public Place(String venue) {
		super();
		this.venue = venue;
	}

	public Place(String venue, String state) {
		super();
		this.venue = venue;
		this.state = state;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
