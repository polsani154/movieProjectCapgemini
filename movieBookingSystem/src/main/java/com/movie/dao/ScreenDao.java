package com.movie.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.movie.entities.Admin;
import com.movie.entities.Screen;
import com.movie.entities.Show;
import com.movie.entities.Theatre;

@Repository
@Transactional
public class ScreenDao implements IUniversalDao<Screen> {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void save(Screen entityObject) {
		// TODO Auto-generated method stub
		em.persist(entityObject);
	}

	@Override
	public Screen findById(Integer id) {
		// TODO Auto-generated method stub
		Screen screen= em.find(Screen.class,id);
		if(screen==null)
		{
			throw new EntityNotFoundException();
		}
		return screen;
	}

	@Override
	public Screen remove(Integer id) {
		// TODO Auto-generated method stub
		Screen screen=findById(id);
		if(screen!=null)
		{
			em.remove(screen);
		}
		return null;
	}

	@Override
	public Screen remove(Screen entityObject) {
		// TODO Auto-generated method stub
		em.remove(entityObject);
		return entityObject;
	}

	@Override
	public Screen update(Integer id, Screen entityObject) {
		// TODO Auto-generated method stub
		Screen screen=findById(id);
		if(screen==null)
		{
			System.out.println("Update error: no such entity exists first save then do this update operation");
			return null;
		}
		
		return em.merge(entityObject);
	}

	@Override
	public List<Screen> findAll() {
		// TODO Auto-generated method stub
		Query q=em.createQuery("From Screen screen");
		System.out.println(q.getResultList()==null);
		return (List<Screen>) q.getResultList();
	}

	@Override
	public Screen update(Screen entityObject) {
		// TODO Auto-generated method stub
		Screen screen=findById(entityObject.getScreenId());
		if(screen==null)
		{
			System.out.println("update error: no such entity exists first save then do this update operation");
			return null;
		}
		
		return em.merge(entityObject);
	}

}
