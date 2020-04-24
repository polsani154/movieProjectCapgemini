package com.movie.dao;

import org.springframework.stereotype.Repository;

import com.movie.entities.User;
import com.movie.entities.UserType;
@Repository
public interface IUserDao {

	public UserType getUserType();
	
	public Boolean getPassword(Integer userId);
	
	public Boolean isSessionActive(String session);
	
	public void removeSession(String session);
	
	public long addOtp(Integer userId,long otp);
	
	public void removeOtp(Integer userId);
	
	public Boolean verifyOtp(Integer userId,long otp);
	
	public User addUser(User user);
	
	public void removeUser(User user);
	
	public void removeUser(Integer userId);
	
	public void changeUserType();
	
	public void setPassword(String password);
	
	
	
	
}
