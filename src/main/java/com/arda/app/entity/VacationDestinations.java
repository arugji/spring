package com.arda.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//ArdaRugj
//Cis175
//21 Oct 2021

@Entity
@Table(name = "VacationDestinations")
public class VacationDestinations {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name", length = 100, nullable = false)
	private String name;

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

}
