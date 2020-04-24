package com.movie.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.movie.entities.Screen;
import com.movie.entities.Seat;
import com.movie.entities.Show;
import com.movie.entities.Theatre;

@Service
public interface IShowService {

	public String getShowName(Integer id);
	
	public Show getShow(Integer id);
	
	public LocalDateTime getShowStartTime(Integer id);
	
	public LocalDateTime getShowEndTime(Integer id);
	
	public List<Seat> getSeats(Integer id);

	public Screen getScreen(Integer id);
	
	public Theatre getTheatre(Integer id);
}
