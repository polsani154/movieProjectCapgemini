package com.movie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.movie.entities.Screen;
import com.movie.entities.Seat;
import com.movie.services.ISeatService;

@RestController

public class SeatController {
	
	@Autowired
	ISeatService service;
	
	@GetMapping(value="seat/{id}")
	public Seat getScreen(@PathVariable Integer id)
	{
		return service.getSeat(id);
	}
	

}
