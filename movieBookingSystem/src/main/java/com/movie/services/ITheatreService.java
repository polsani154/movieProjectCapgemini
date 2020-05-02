package com.movie.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.movie.entities.Theatre;
@Service
public interface ITheatreService {

	public List<Theatre> getAllTheatres();
	
	public List<Theatre> getTheatresByCity(String city);
	
	public List<Theatre> getTheatresByCityAndMovie(String city,Integer movieId);
	
}
