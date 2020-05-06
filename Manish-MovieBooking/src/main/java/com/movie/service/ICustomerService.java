package com.movie.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.dao.IUniversalDao;
import com.movie.entities.Customer;
import com.movie.entities.Ticket;

@Service
public interface ICustomerService {


	public Customer getCustomer(Integer id);
	
	public Set<Ticket> getTickets(int userId);
}
