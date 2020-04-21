package com.movie.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.movie.entities.Admin;
import com.movie.entities.Movie;
import com.movie.entities.Theatre;

@Repository
@Transactional
public class TheatreDao implements ITheatreDao,IUniversalDao<Theatre> {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public Theatre addTheatre(Theatre theatre) {
		// TODO Auto-generated method stub
		em.persist(theatre);
		return null;
	}

	@Override
	public Theatre deleteTheatreById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String changeManager(String managerName,Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String changeManagerContact(String contact,Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> getAllMovies(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Theatre> getAllTheatresOfCity(String cityname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String changeTheatreName(String name,Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String changeCityName(String cityname,Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Theatre save(Theatre entityObject) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Theatre findById(Integer id) {
		// TODO Auto-generated method stub
		
		return em.find(Theatre.class, id);
	}

	@Override
	public Theatre remove(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Theatre remove(Theatre entityObject) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Theatre update(Integer id, Theatre entityObject) {
		// TODO Auto-generated method stub
		Theatre t=em.find(Theatre.class, id);
		em.merge(entityObject);
		return entityObject;
	}

	@Override
	public List<Theatre> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Theatre update(Theatre entityObject) {
		// TODO Auto-generated method stub
		em.merge(entityObject);
		return entityObject;
	}

	@Override
	public Boolean isExists(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Theatre getTheatre(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
