package com.movie.dao;

import java.util.List;

import com.movie.entities.Screen;
import com.movie.entities.Show;
import com.movie.entities.Theatre;

public interface IScreenDao {

	public List<Show> getActiveShows();
	
	public List<Show> getAllShows();
	
	public List<Show> getTodayShows();
	
	public Theatre getTheatre();
	
	public Screen getScreenDetails();
	
	
	
}
