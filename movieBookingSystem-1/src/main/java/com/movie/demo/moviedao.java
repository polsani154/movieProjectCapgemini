package com.movie.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class moviedao   {

	@PersistenceContext
	EntityManager em;
	
	public void create(Movie m)
	{
		em.persist(m);
	}
	
	public List<Movie> retrieve() {
		// TODO Auto-generated method stub
		return em.createQuery("from Movie").getResultList();
	}
}
