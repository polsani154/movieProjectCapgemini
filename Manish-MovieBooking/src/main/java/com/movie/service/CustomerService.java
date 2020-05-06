package com.movie.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.dao.IUniversalDao;
import com.movie.entities.Customer;
import com.movie.entities.Ticket;

@Service
public class CustomerService implements ICustomerService {

	@Autowired
	IUniversalDao<Customer> customerDao;

	@Override
	public Customer getCustomer(Integer id) {
		// TODO Auto-generated method stub
		return customerDao.findById(id);
	}
	
	@Override
	public Set<Ticket> getTickets(int userId)
	{
		Customer c=customerDao.findById(userId);
		return c.getTicket();
		
	}
	
	
}
