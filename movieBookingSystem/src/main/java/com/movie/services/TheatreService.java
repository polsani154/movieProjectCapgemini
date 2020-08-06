package com.movie.services;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.dao.ITheatreDao;
import com.movie.entities.Show;
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
		if(theatres.size()==0)
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
		
		if(theatres.size()==0)
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
		List<Theatre> newTheatres=new ArrayList<Theatre>();
		for (Theatre theatre : theatresByCity) {

			theatresByCity.remove(theatre);
			List<Show> shows=theatre.getShows();
			shows=shows.stream().filter(show->show.getMovie().getMovieId()==movieId && show.getShowStartTime().isAfter(LocalDateTime.now().plusMinutes(30))).collect(Collectors.toList());
			theatre.setShows(shows);
			theatresByCity.add(theatre);
			
		}
		return theatresByCity;
		
	}
	
	
	
}


//if(theatre.getListOfShowsWithMovie(movieId).size()==0)
//{
//	theatre=null;
//	continue;
//}
