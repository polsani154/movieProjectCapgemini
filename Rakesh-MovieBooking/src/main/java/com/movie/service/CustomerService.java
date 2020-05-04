package com.movie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.dao.ICustomerDao;
import com.movie.dao.IUniversalDao;
import com.movie.entities.Customer;

@Service
public class CustomerService implements ICustomerService {

	@Autowired
	IUniversalDao<Customer> universalcustomerdao;
	
	@Autowired
	ICustomerDao customerdao;
	
	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		universalcustomerdao.save(customer);
	}

	@Override
	public Boolean isEmailExists(String email) {
		// TODO Auto-generated method stub
		return customerdao.isEmailExist(email);
	}
	
	

	
	
}
