package com.movie.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.dao.IUniversalDao;
import com.movie.entities.Screen;
import com.movie.entities.Show;
import com.movie.entities.Theatre;

@Service
public class ScreenService implements IScreenService{

	@Autowired
	IUniversalDao<Screen> dao;
	
	@Override
	public Screen getScreen(Integer id) throws NullPointerException {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public String getscreenName(Integer id) throws NullPointerException {
		// TODO Auto-generated method stub
		return dao.findById(id).getScreenName();
	}

	@Override
	public String getTheatreName(Integer id) throws NullPointerException {
		// TODO Auto-generated method stub
		return dao.findById(id).getTheatre().getManagerName();
	}

	@Override
	public List<Show> getListOfShows(Integer id) {
		// TODO Auto-generated method stub
		return dao.findById(id).getShow();
	}

	@Override
	public int getHeight(Integer id) {
		// TODO Auto-generated method stub
		return dao.findById(id).getHallHeight();
	}

	@Override
	public int getWidth(Integer id) {
		// TODO Auto-generated method stub
		return dao.findById(id).getHallWidth();
	}

	@Override
	public Theatre getTheatre(Integer id) {
		// TODO Auto-generated method stub
		return dao.findById(id).getTheatre();
	}

}
