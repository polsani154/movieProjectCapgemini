package com.movie.dao;

import java.util.List;

import com.movie.entities.Movie;
import com.movie.entities.Theatre;

public interface ITheatreDao {

	public Theatre addTheatre();
	
	public Theatre deleteTheatre();
	
	public String changeManager(String managerName);
	
	public String changeManagerContact();

	public List<Movie> getAllMovies();
	
	public List<Theatre> getAllTheatresOfCity(String cityname);
	
	public String changeTheatreName(String name);
	
	public String changeCityName(String cityname);
		
	
}