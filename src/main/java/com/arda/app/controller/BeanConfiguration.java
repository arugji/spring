package com.arda.app.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.arda.app.bean.Place;
import com.arda.app.bean.VacationDestinations;

//ArdaRugj
//Cis175
//21 Oct 2021

@Configuration
public class BeanConfiguration {

	@Bean
	VacationDestinations vacationDestinations() {
		VacationDestinations bean = new VacationDestinations("Hawaii");
		return bean;
	}

	@Bean
	Place place() {
		Place bean = new Place("Lake Side", "Valmont");
		return bean;
	}
}
