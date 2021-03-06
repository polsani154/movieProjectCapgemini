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
import com.movie.exceptions.IllegalSeatStateChangeException;
import com.movie.exceptions.NullPropertyException;

import javax.persistence.EntityNotFoundException;

@Service
public class ShowService implements IShowService{

	@Autowired
	IUniversalDao<Show> dao;
	IShowDao dao2;
	
	/********
	*Method name 			getShowName
	*Parameters				showId (Integer)
	*description			This method gives the show name based on showId
	* @throws				EntityNotFoundException
	*@Returns   			STring showName
	*********/
	@Override
	public String getShowName(Integer id) throws EntityNotFoundException{
		// TODO Auto-generated method stub
		Show show=dao.findById(id);
		if(show != null)
		{
			throw new EntityNotFoundException("Show not found");
		}
		return show.getShowName();
	}

	
	
	/********
	*Method name 			getShow
	*Parameters				ShowId (Integer)
	*description			This method gets the show based on show id
	* @throws				EntityNotFoundException
	*@Returns   			none
	*********/
	@Override
	public Show getShow(Integer id) throws EntityNotFoundException{
		// TODO Auto-generated method stub
		Show show=dao.findById(id);
		if(show==null)
		{
			throw new EntityNotFoundException("Show with id "+id+" is not found please verify");
		}
		
		return show;
	}

	/********
	*Method name 			getShowStartTime
	*Parameters				ShowId (Integer)
	*description			This method gets the startTime of the show
	* @throws				EntityNotFoundException,NullPropertyException
	*@Returns   			{@link LocalDateTime}
	*********/
	@Override
	public LocalDateTime getShowStartTime(Integer id) throws EntityNotFoundException,NullPropertyException {
		// TODO Auto-generated method stub
		
		Show show=dao.findById(id);
		
		if(show==null)
		{
			throw new EntityNotFoundException("Show with id "+id+" is not found please verify");
		}
		
		if(show.getShowStartTime()==null)
		{
			throw new NullPropertyException("Show Start time is null in this case for show "+id);
		}
		return show.getShowStartTime();
	}

	
	/********
	*Method name 			getShowEndTime
	*Parameters				ShowId (Integer)
	*description			This method gets the endTime of the show
	* @throws				EntityNotFoundException,NullPropertyException
	*@Returns   			{@link LocalDateTime}
	*********/
	@Override
	public LocalDateTime getShowEndTime(Integer id) throws EntityNotFoundException,NullPropertyException {
		// TODO Auto-generated method stub
		Show show=dao.findById(id);
		
		if(show==null)
		{
			throw new EntityNotFoundException("Show with id "+id+" is not found please verify");
		}
		
		if(show.getShowEndTime()==null)
		{
			throw new NullPropertyException("Show End time is null in this case for show "+id);
		}
		return show.getShowEndTime();
	}

	
	/********
	*Method name 			getSeats
	*Parameters				ShowId (Integer)
	*description			This method gets the List of Seats of Show
	* @throws				EntityNotFoundException,NullPropertyException
	*@Returns   			List<Seat>
	*********/
	@Override
	public List<Seat> getSeats(Integer id) throws EntityNotFoundException,NullPropertyException {
		// TODO Auto-generated method stub
	
	Show show=dao.findById(id);
		
		if(show==null)
		{
			throw new EntityNotFoundException("Show with id "+id+" is not found please verify");
		}
		
		if(show.getSeats().size()==0)
		{
			throw new NullPropertyException("No Seats are connected with the Show"+id);
		}
		return show.getSeats();
	}

	
	/********
	*Method name 			getScreen
	*Parameters				ShowId (Integer)
	*description			This method gets the screen if we give showId
	* @throws				EntityNotFoundException
	*@Returns   			none
	*********/
	@Override
	public Screen getScreen(Integer id) throws EntityNotFoundException {
		// TODO Auto-generated method stub
		
		Show show=dao.findById(id);
		
		if(show==null)
		{
			throw new EntityNotFoundException("Cannot get screen because, Show with id "+id+" is not found please verify");
		}
		
		return show.getScreen();
	}

	/********
	*Method name 			getTheatre
	*Parameters				ShowId (Integer)
	*description			This method gets the Theatre in which show is running
	* @throws				EntityNotFoundException
	*@Returns   			none
	*********/
	@Override
	public Theatre getTheatre(Integer id) throws EntityNotFoundException {
		// TODO Auto-generated method stub
		Show show=dao.findById(id);
		
		if(show==null)
		{
			throw new EntityNotFoundException("Cannot get theatre because, Show with id "+id+" is not found please verify");
		}
		return show.getTheatre();
	}

}
