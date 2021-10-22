package com.arda.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.arda.app.bean.VacationDestinations;
import com.arda.app.repository.VacationDestinationsRepository;

/**
 * Arda Rugji - arugji CIS171
 * 
 */
@Controller
public class WebController {

	@Autowired
	VacationDestinationsRepository repo;

	@GetMapping("viewAll")
	public String viewAllStudents(Model model) {
		model.addAttribute("vacation", repo.findAll());
		return "results";
	}

	@GetMapping("/inputVacation")
	public String addNewContact(Model model) {
		// Contact c = new Contact();
		VacationDestinations e = new VacationDestinations();
		model.addAttribute("newVacation", e);
		return "input";
	}

	@PostMapping("/inputVacation")
	public String addNewStudent(@ModelAttribute VacationDestinations e, Model model) {
		repo.save(e);
		return viewAllStudents(model);
	}

	@GetMapping("/edit/{id}")
	public String showUpdateStudentoyee(@PathVariable("id") long id, Model model) {
		VacationDestinations e = repo.findById(id).orElse(null);
		model.addAttribute("newVacation", e);
		return "input";
	}

	@PostMapping("/update/{id}")
	public String reviseContact(VacationDestinations e, Model model) {
		repo.save(e);
		return viewAllStudents(model);
	}

	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model) {
		VacationDestinations e = repo.findById(id).orElse(null);
		repo.delete(e);
		return viewAllStudents(model);
	}

}
