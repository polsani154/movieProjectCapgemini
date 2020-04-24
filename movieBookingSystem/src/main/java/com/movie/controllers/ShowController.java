package com.movie.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.movie.entities.Seat;
import com.movie.entities.Show;
import com.movie.services.IShowService;

@RestController
public class ShowController {

	@Autowired
	IShowService service;
	
	@GetMapping(value="show/{id}")

	public Show getShow(@PathVariable Integer id)
	{
		Show show=service.getShow(id);
//		System.out.println(show.getSeats());
		return show;
	}

	@GetMapping(value="show/{id}/seats")

	public List<Seat> getOnlySeats(@PathVariable Integer id)
	{
		Show show=service.getShow(id);
//		System.out.println(show.getSeats());
		return show.getSeats();
	}
	
}
