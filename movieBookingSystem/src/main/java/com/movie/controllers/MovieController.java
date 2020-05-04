package com.movie.controllers;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.movie.entities.Movie;
import com.movie.entities.Theatre;
import com.movie.services.IMovieService;
import com.movie.services.ITheatreService;

@CrossOrigin(origins="localhost:4200")
@RestController
public class MovieController {
	@Autowired
	ITheatreService theatreservice;
	
	@Autowired
	IMovieService movieservice;

//	@GetMapping(value="",produces="APPLICATION_JSON_VALUE")
//	public Set<Movie> getMoviesByCity(@RequestBody String city)
//	{
//		return movieservice.getMoviesByCity(city);
//	}
	
	@GetMapping(value="{city}")
	public Set<Movie> getMovies(@PathVariable String city)
	{
		return movieservice.getMoviesByCity(city);
	}

	
	
}
