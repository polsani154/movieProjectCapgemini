package com.movie.service;

import com.movie.entities.Customer;

public interface ICustomerService {

	public void save(Customer customer);
	
	public Boolean isEmailExists(String email);
	
}
