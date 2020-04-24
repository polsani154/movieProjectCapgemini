package com.movie.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.movie.entities.Screen;
import com.movie.entities.Show;
import com.movie.entities.Theatre;

@Service
public interface IScreenService {

	public Screen getScreen(Integer id);
	
	public String getscreenName(Integer id);
	
	public String getTheatreName(Integer id);
	
	public List<Show> getListOfShows(Integer id);
	
	public int getHeight(Integer id);
	
	public int getWidth(Integer id);
	
	public Theatre getTheatre(Integer id);
	
	
}
