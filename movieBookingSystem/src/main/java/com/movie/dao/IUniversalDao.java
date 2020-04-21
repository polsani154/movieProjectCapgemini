package com.movie.dao;

import java.util.List;

public interface IUniversalDao<T> {

	public T save(T entityObject);
	
	public T findById(Integer id);
	
	public T remove(Integer id);
	
	public T remove(T entityObject);
	
	public T update(Integer id, T entityObject);
	
	public List<T> findAll();

	public T update(T entityObject);
	
}
