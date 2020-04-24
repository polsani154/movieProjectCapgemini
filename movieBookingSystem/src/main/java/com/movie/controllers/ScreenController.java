package com.movie.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.movie.entities.Screen;
import com.movie.entities.Show;
import com.movie.services.IScreenService;

@CrossOrigin(origins="localhost:4200/")
@RestController

public class ScreenController {

	@Autowired
	IScreenService service;
	@GetMapping(value="screen/{id}")
	public Screen getScreen(@PathVariable Integer id)
	{
		return service.getScreen(id);
	}
	
	@GetMapping(value="screen/{id}/shows")
	public List<Show> getShows(@PathVariable Integer id)
	{
		return service.getScreen(id).getShow();
	}
	
}
