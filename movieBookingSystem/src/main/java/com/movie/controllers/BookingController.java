package com.movie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.movie.entities.Booking;
import com.movie.services.IBookingService;

@RestController
@CrossOrigin(origins="localhost:4200")
public class BookingController {
	
	@Autowired
	IBookingService bookingservice;
	
	@PostMapping(value="book")
	public Booking saveBooking(@RequestBody Booking booking)
	{
		return null;
	}

}
