package com.pratiti.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pratiti.model.Passenger;
import com.pratiti.model.Passenger.Gender;
import com.pratiti.model.Passenger.Status;
import com.pratiti.model.Pnr;


@RestController
@CrossOrigin
public class PnrController {

	@GetMapping("/status")
	public Pnr checkStatus(@RequestParam("pnrNo") int pnrNo) {
		Pnr pnr = new Pnr();
		pnr.setPnrNo(pnrNo);
		pnr.setTrainNo(12345);
		pnr.setTravelDate(LocalDate.of(2023, 3, 3));
		
		List<Passenger> passengers = new ArrayList<>();
		
		Passenger p1 = new Passenger();
		p1.setName("devesh");
		p1.setGender(Gender.MALE);
		p1.setStatus(Status.RAC);
		passengers.add(p1);
		
		Passenger p2 = new Passenger();
		p2.setName("devesh2");
		p2.setGender(Gender.FEMALE);
		p2.setStatus(Status.WAITING);
		passengers.add(p2);
		
		Passenger p3 = new Passenger();
		p3.setName("devesh3");
		p3.setGender(Gender.MALE);
		p3.setStatus(Status.CONFIRMED);
		passengers.add(p3);
		
		pnr.setPassengers(passengers);
		
		return pnr;
	}
	
}
