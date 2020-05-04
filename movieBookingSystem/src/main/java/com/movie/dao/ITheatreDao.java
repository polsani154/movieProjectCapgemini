package com.movie.dao;

import java.util.List;

import javax.transaction.Transactional;

import com.movie.entities.Theatre;

public interface ITheatreDao {
	
	@Transactional
	public void save(Theatre entityObject);
	
	@Transactional
	public Theatre findById(Integer id);
	
	@Transactional
	public Theatre remove(Integer id);
	
	@Transactional
	public Theatre remove(Theatre entityObject);
	
	@Transactional
	public Theatre update(Integer id, Theatre entityObject);
	
	@Transactional
	public List<Theatre> findAll();

	@Transactional
	public Theatre update(Theatre entityObject);
	
	@Transactional
	public List<Theatre> getTheatresByCity(String city);

}
