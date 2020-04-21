package com.movie.dao;

import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.movie.entities.Admin;
import com.movie.entities.Booking;
import com.movie.entities.Customer;
import com.movie.entities.Movie;
import com.movie.entities.Theatre;
import com.movie.entities.Ticket;

@Repository
@Transactional
public class MovieDao implements IMovieDao,IUniversalDao<Movie> {

	@PersistenceContext
	EntityManager em;
	

	@Override
	public Movie save(Movie entityObject) {
		// TODO Auto-generated method stub
		em.persist(entityObject);
		return entityObject;
	}

	@Override
	public Movie findById(Integer id) {
		// TODO Auto-generated method stub
		return em.find(Movie.class,id);
		
	}

	@Override
	public Movie remove(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie remove(Movie entityObject) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie update(Integer id, Movie entityObject) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> findAll() {
		// TODO Auto-generated method stub
		
		Query q=em.createQuery("select movie From Movie movie");
		System.out.println(q.getResultList()==null);
		return (List<Movie>) q.getResultList();
	}

	@Override
	public Movie update(Movie entityObject) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getGenre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void changeRunTime() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getTrailerLink() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie save() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie remove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getImageLinks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addImageLink(String imageLink) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addImageLinks(String[] imageLinks) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changeHero(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addLanguage(String[] language) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String removeLanguage(String language) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Theatre> getAllTheatres() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addMovie(Movie movie) {
		// TODO Auto-generated method stub
		em.persist(movie);
	}

	@Override
	public Boolean addTheatre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean removeTheatre() {
		// TODO Auto-generated method stub
		return null;
	}

}
