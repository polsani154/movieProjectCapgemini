package com.movie.dao;

import java.util.List;

import com.movie.entities.Movie;
import com.movie.entities.Theatre;

public interface IMovieDao {

	public String getGenre();
	
	public void changeRunTime();
	
	public String getTrailerLink();
	
	public Movie save();
	
	public Movie remove();
	
	public String[] getImageLinks();
	
	public void addImageLink(String imageLink);
	
	public void addImageLinks(String[] imageLinks);
	
	public void changeHero(String name);
	
	public void addLanguage(String[] language);
	
	public String removeLanguage(String language);
	
	public List<Theatre> getAllTheatres();
	
	public void addMovie(Movie movie);
	
	public Boolean addTheatre();
	
	public Boolean removeTheatre();
	
	
	
	
	
}
