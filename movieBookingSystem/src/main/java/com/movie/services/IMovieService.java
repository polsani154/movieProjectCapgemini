package com.movie.services;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.movie.entities.Movie;
import com.movie.exceptions.NullPropertyException;

@Service
public interface IMovieService {
	
	public Set<Movie> getMoviesByCity(String city) throws NullPropertyException;

}
