package com.arda.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.arda.app.entity.VacationDestinations;
import com.arda.app.repository.VacationDestinationsRepository;
import com.arda.app.service.VacationDestinationsService;

//ArdaRugj
//Cis175
//21 Oct 2021

@SpringBootApplication
public class ArdaSpringApplication implements CommandLineRunner {

	@Autowired
	private VacationDestinationsRepository vacationDestinationsRepository;

	@Autowired
	private VacationDestinationsService vacationDestinationsService;

	public static void main(String[] args) {
		SpringApplication.run(ArdaSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Storing data......");
		VacationDestinations vd = new VacationDestinations();
		vd.setName("Hawaii");
		vacationDestinationsRepository.saveAndFlush(vd);
		System.out.println("\n\nData stored......");
		vacationDestinationsService.showData();
	}

}
