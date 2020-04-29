package com.movie.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.dao.IUniversalDao;
import com.movie.entities.Screen;
import com.movie.entities.Theatre;

@Service
public class TheatreService implements ITheatreService{

	@Autowired
	IUniversalDao<Theatre> TheatreDao;
	
	@Override
	public List<Theatre> getAllTheatres() {
		// TODO Auto-generated method stub
		return TheatreDao.findAll();
	}

	
	
}
