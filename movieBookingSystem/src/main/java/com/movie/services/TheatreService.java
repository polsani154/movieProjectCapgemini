package com.movie.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.dao.ITheatreDao;
import com.movie.entities.Theatre;

@Service
public class TheatreService implements ITheatreService{

	@Autowired
	ITheatreDao theatreDao;
	
	
	
	@Override
	public List<Theatre> getAllTheatres() {
		// TODO Auto-generated method stub
		return theatreDao.findAll();
	}

	
	
	public List<Theatre> getTheatresByCity(String city)
	{
		return theatreDao.getTheatresByCity(city);	
	}



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
