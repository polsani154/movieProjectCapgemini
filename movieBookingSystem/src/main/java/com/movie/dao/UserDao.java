package com.movie.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.movie.entities.User;
import com.movie.entities.UserType;

@Repository
@Transactional
public class UserDao implements IUserDao {

	@PersistenceContext
	private EntityManager em;
	@Override
	public UserType getUserType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean getPassword(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean isSessionActive(String session) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeSession(String session) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public long addOtp(Integer userId, long otp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void removeOtp(Integer userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean verifyOtp(Integer userId, long otp) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void changeUserType() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPassword(String password) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		em.persist(user);
		
		return user;
	}

	@Override
	public void removeUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeUser(Integer userId) {
		// TODO Auto-generated method stub
		
	}


}
