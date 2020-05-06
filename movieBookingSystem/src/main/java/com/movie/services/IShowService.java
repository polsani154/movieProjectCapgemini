package com.movie.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.movie.entities.Screen;
import com.movie.entities.Seat;
import com.movie.entities.Show;
import com.movie.entities.Theatre;
import com.movie.exceptions.NullPropertyException;

import javax.persistence.EntityNotFoundException;

@Service
public interface IShowService {

	public String getShowName(Integer id) throws EntityNotFoundException;
	
	public Show getShow(Integer id) throws EntityNotFoundException;
	
	public LocalDateTime getShowStartTime(Integer id) throws EntityNotFoundException,NullPropertyException;
	
	public LocalDateTime getShowEndTime(Integer id) throws EntityNotFoundException,NullPropertyException;
	
	public List<Seat> getSeats(Integer id) throws EntityNotFoundException,NullPropertyException;

	public Screen getScreen(Integer id) throws EntityNotFoundException;
	
	public Theatre getTheatre(Integer id) throws EntityNotFoundException;

}
