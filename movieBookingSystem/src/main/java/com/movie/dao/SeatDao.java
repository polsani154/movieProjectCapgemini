package com.movie.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.LockModeType;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.LockMode;
import org.hibernate.mapping.Set;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.stereotype.Repository;

import com.movie.entities.Admin;
import com.movie.entities.Seat;
import com.movie.entities.Show;

@Repository
public class SeatDao implements IUniversalDao<Seat>,ISeatDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public void save(Seat entityObject) {
		// TODO Auto-generated method stub
		em.persist(entityObject);
	}

	@Override
	@Transactional
	public Seat findById(Integer id) throws EntityNotFoundException,NullPointerException {
		// TODO Auto-generated method stub
		Seat seat= em.find(Seat.class,id);
		if(seat==null)
		{
			throw new EntityNotFoundException();
		}
		return seat;
	}

	@Override
	@Transactional
	public Seat remove(Integer id) {
		// TODO Auto-generated method stub
		Seat seat=findById(id);
		if(seat!=null)
		{
			em.remove(seat);
		}
		return null;
	}

	@Override
	@Transactional
	public Seat remove(Seat entityObject) {
		// TODO Auto-generated method stub
		em.remove(entityObject);
		return entityObject;
	}

	@Override
	@Transactional
	public Seat update(Integer id, Seat entityObject) {
		// TODO Auto-generated method stub
		Seat seat=findById(id);
		if(seat==null)
		{
			System.out.println("Update error: no such entity exists first save then do this update operation");
			return null;
		}
		
		return em.merge(entityObject);
	}

	@Override
	@Transactional
	public List<Seat> findAll() {
		// TODO Auto-generated method stub
		Query q=em.createQuery("From Seat seat");
		System.out.println(q.getResultList()==null);
		return (List<Seat>) q.getResultList();
	}

	@Override
	@Transactional
	@Lock(LockModeType.PESSIMISTIC_READ)
	public Seat update(Seat entityObject) {
		// TODO Auto-generated method stub
		Seat seat=findById(entityObject.getSeatId());
		if(seat==null)
		{
			System.out.println("update error: no such entity exists first save then do this update operation");
			return null;
		}
		
		return em.merge(entityObject);
	}

}
