package com.movie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PatchMapping(value="bookSeats")
	public ResponseEntity<String> bookSeat(@RequestBody Integer[] id)
	{
		for (Integer integer : id) {
			service.bookSeat(integer);
		}
		
		return ResponseEntity.ok("Booking done");
	}
	
	@PatchMapping(value="blockSeats")
	public ResponseEntity<String> blockSeat(@RequestBody Integer[] id)
	{
		for (Integer integer : id) {
			service.BlockSeat(integer);
		}
		return ResponseEntity.ok("Blocking done");
	}
	
	@PatchMapping(value="unblockSeats")
	public ResponseEntity<String> unblockSeat(@RequestBody Integer[] id)
	{
		for (Integer integer : id) {
			service.unBlockSeat(integer);
		}
		return ResponseEntity.ok("Booking done");
	}
	
	@PatchMapping(value="cancelSeats")
	public ResponseEntity<String> cancelSeat(@RequestBody Integer[] id)
	{
		for (Integer integer : id) {
			service.unBookSeat(integer);
		}
		return ResponseEntity.ok("cancelling done");
	}
	

}
