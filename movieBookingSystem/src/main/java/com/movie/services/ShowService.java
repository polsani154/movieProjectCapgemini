package com.movie.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.dao.IShowDao;
import com.movie.dao.IUniversalDao;
import com.movie.entities.Screen;
import com.movie.entities.Seat;
import com.movie.entities.Show;
import com.movie.entities.Theatre;
import com.movie.exceptions.EntityNotFoundException;

@Service
public class ShowService implements IShowService{

	@Autowired
	IUniversalDao<Show> dao;
	IShowDao dao2;
	
	@Override
	public String getShowName(Integer id) throws EntityNotFoundException,NullPointerException{
		// TODO Auto-generated method stub
		return dao.findById(id).getShowName();
	}

	@Override
	public Show getShow(Integer id) throws EntityNotFoundException,NullPointerException{
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public LocalDateTime getShowStartTime(Integer id) throws EntityNotFoundException,NullPointerException {
		// TODO Auto-generated method stub
		return dao.findById(id).getShowStartTime();
	}

	@Override
	public LocalDateTime getShowEndTime(Integer id) throws EntityNotFoundException,NullPointerException {
		// TODO Auto-generated method stub
		return dao.findById(id).getShowEndTime();
	}

	@Override
	public List<Seat> getSeats(Integer id) throws EntityNotFoundException,NullPointerException {
		// TODO Auto-generated method stub
		return dao.findById(id).getSeats();
	}

	@Override
	public Screen getScreen(Integer id) throws EntityNotFoundException,NullPointerException {
		// TODO Auto-generated method stub
		return dao.findById(id).getScreen();
	}

	@Override
	public Theatre getTheatre(Integer id) throws EntityNotFoundException,NullPointerException {
		// TODO Auto-generated method stub
		return dao.findById(id).getTheatre();
	}

}
