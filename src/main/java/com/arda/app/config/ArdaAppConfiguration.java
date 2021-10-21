package com.arda.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.arda.app.service.VacationDestinationsService;

//ArdaRugj
//Cis175
//21 Oct 2021


@Configuration
public class ArdaAppConfiguration {

	@Bean
	public VacationDestinationsService vacationDestinationsService() {
		return new VacationDestinationsService();
	}
}
