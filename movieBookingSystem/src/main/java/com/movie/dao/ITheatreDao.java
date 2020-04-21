package com.movie.dao;

import java.util.List;

import com.movie.entities.Movie;
import com.movie.entities.Theatre;

public interface ITheatreDao {

	public Theatre addTheatre(Theatre theatre);
	
	public Theatre deleteTheatreById(Integer id);
	
	public String changeManager(String managerName,Integer id);
	
	public String changeManagerContact(String contact,Integer id);

	public List<Movie> getAllMovies(Integer id);
	
	public List<Theatre> getAllTheatresOfCity(String cityname);
	
	public String changeTheatreName(String name,Integer id);
	
	public String changeCityName(String cityname,Integer id);
	
	public Boolean isExists(Integer id);
	
	public Theatre getTheatre(Integer id);
		
	
}
