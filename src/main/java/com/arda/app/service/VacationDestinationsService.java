package com.arda.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.arda.app.entity.VacationDestinations;
import com.arda.app.repository.VacationDestinationsRepository;

//ArdaRugj
//Cis175
//21 Oct 2021


public class VacationDestinationsService {

	@Autowired
	private VacationDestinationsRepository vacationDestinationsRepository;

	public void showData() {
		System.out.println("\n\nDisplay data......\n\n");
		List<VacationDestinations> list = vacationDestinationsRepository.findAll();
		for (VacationDestinations vd : list) {
			vd.toString();
		}
	}
}
