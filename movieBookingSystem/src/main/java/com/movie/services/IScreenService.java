package com.movie.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.movie.entities.Screen;
import com.movie.entities.Show;
import com.movie.entities.Theatre;
import com.movie.exceptions.NullPropertyException;

@Service
public interface IScreenService {

	public Screen getScreen(Integer id);
	
	public String getscreenName(Integer id) throws NullPropertyException;
	
	public String getTheatreName(Integer id) throws NullPropertyException;
	
	public List<Show> getListOfShows(Integer id) throws NullPropertyException;
	
	public List<Screen> getAllScreens();
	
	public int getHeight(Integer id) throws NullPropertyException;
	
	public int getWidth(Integer id) throws NullPropertyException;
	
	public Theatre getTheatre(Integer id) throws NullPropertyException;
	
	
}
