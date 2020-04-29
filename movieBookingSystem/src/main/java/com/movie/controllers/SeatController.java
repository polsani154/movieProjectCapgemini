package com.movie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.entities.Screen;
import com.movie.entities.Seat;
import com.movie.services.ISeatService;
import com.mysql.cj.protocol.x.ResultMessageListener;

@RestController
@CrossOrigin(origins="localhost:4200")
public class SeatController {
	
	@Autowired
	ISeatService service;
	
	@GetMapping(value="seat/{id}")
	public Seat getSeat(@PathVariable Integer id)
	{
		return service.getSeat(id);
	}
	
	@PatchMapping(value="bookSeat/{id}")
	public ResponseEntity<String> bookSeat(@PathVariable Integer id)
	{
		service.bookSeat(id);
		return ResponseEntity.ok("Booking done");
	}
	
	@PatchMapping(value="cancelSeat/{id}")
	public ResponseEntity<String> cancelSeat(@PathVariable Integer id)
	{
		service.unBookSeat(id);
		return ResponseEntity.ok("cancelling done");
	}
	

}
