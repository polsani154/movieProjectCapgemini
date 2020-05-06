package com.movie.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.dao.ITheatreDao;
import com.movie.entities.Theatre;

@Service
public class TheatreService implements ITheatreService{

	@Autowired
	ITheatreDao theatreDao;
	
	
	
	/********
	*Method name 			getAllTheatres
	*Parameters				
	*description			This method gets all the theatres in the database
	* @throws				NullPointerException
	*@Returns   			List<Theatre>
	*********/
	@Override
	public List<Theatre> getAllTheatres() throws NullPointerException{
		// TODO Auto-generated method stub
		List<Theatre> theatres=theatreDao.findAll();
		if(theatres==null)
		{
			throw new NullPointerException("No theatres found in database");
		}
		return theatres;
	}

	
	/********
	*Method name 			getTheatresByCity
	*Parameters				City(String)
	*description			This method gets all the theatres in the city
	* @throws				NullPointerException
	*@Returns   			List<Theatre>
	*********/
	@Override
	public List<Theatre> getTheatresByCity(String city) throws NullPointerException
	{
		List<Theatre> theatres=theatreDao.getTheatresByCity(city);
		
		if(theatres==null)
		{
			throw new NullPointerException("No theatres found in the city");
		}
		
		return theatres;	
	}



	/********
	*Method name 			getTheatresByCityAndMovie
	*Parameters				City,movieId(String,Integer)
	*description			This method gets all the theatres in the city which are running that movie
	*@Returns   			List<Theatre>
	*********/
	@Override
	public List<Theatre> getTheatresByCityAndMovie(String city, Integer movieId) {
		// TODO Auto-generated method stub
		List<Theatre> theatresByCity=getTheatresByCity(city);
		for (Theatre theatre : theatresByCity) {
			if(theatre.getListOfShowsWithMovie(movieId)==null)
			{
				theatre=null;
				continue;
			}
			theatre.setShows(theatre.getListOfShowsWithMovie(movieId));
		}
		return theatresByCity;
		
	}
	
	
	
}
