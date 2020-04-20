package com.movie.dao;

import com.movie.entities.Admin;
import com.movie.entities.Theatre;

public interface IAdminDao {
	
	public Admin getAdmin(Integer userid);
	
	public String getAdminContact(Integer userId);
	
	public String getAdminName(Integer userId);
	
	public Boolean isAdmin(Integer userId);
	
	public Admin addAdmin(Admin admin);
	
	public void removeAdmin(Integer userId);
	
	public void removeAdmin(Admin admin);

}