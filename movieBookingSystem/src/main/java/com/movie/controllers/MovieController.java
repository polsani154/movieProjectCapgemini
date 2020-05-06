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
import com.movie.exceptions.NullPropertyException;
import com.movie.services.IMovieService;
import com.movie.services.ITheatreService;

import net.bytebuddy.asm.Advice.Return;

@CrossOrigin(origins="localhost:4200")


@RestController
public class MovieController {

	@Autowired
	IMovieService movieservice;

	
	/********
	*@throws NullPropertyException 
	 * @Returns   			Set of Movies
	*Parameters				CityName(String)
	*description			returns the movies that are active in the city
	*Method name 			getMovies
	*throws					{@link NullPropertyException}
	*HTTP-MethodType 		Get
	*********/
	
	@GetMapping(value="{city}")
	public Set<Movie> getMovies(@PathVariable String city) throws NullPropertyException
	{
		return movieservice.getMoviesByCity(city);
	}

	
	
}
