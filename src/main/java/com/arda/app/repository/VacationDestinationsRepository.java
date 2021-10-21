package com.arda.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arda.app.entity.VacationDestinations;

//ArdaRugj
//Cis175
//21 Oct 2021

@Repository
public interface VacationDestinationsRepository extends JpaRepository<VacationDestinations, Long> {

}
