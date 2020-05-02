package com.movie.services;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.entities.Movie;
import com.movie.entities.Theatre;

@Service
public class MovieService implements IMovieService {

	@Autowired
	ITheatreService theatreservice;
	@Override
	public Set<Movie> getMoviesByCity(String city) {
		// TODO Auto-generated method stub
		List<Theatre> theatres=theatreservice.getTheatresByCity(city);
		Set<Movie> movies=new HashSet<Movie>();
		
		for (Theatre theatre : theatres) {
			movies.addAll(theatre.getListOfMovies());
		}
		
		return movies;
	}

}
