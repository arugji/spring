package com.arda.app.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

//ArdaRugj
//Cis175
//21 Oct 2021

@Entity
public class VacationDestinations {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	@Autowired
	private Place place;

	public VacationDestinations() {
		super();
	}

	public VacationDestinations(String name) {
		super();
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		String data = "VacationDestinations { Id = " + id + ", Name = " + name + " }";
		System.out.println(data);
		return data;
	}

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}

}
