package com.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.movie.dao.CustomerDao;
import com.movie.dao.ICustomerDao;
import com.movie.dao.IUserDao;
import com.movie.dao.UserDao;
import com.movie.entities.Customer;
import com.movie.entities.User;
import com.movie.entities.UserType;

@SpringBootApplication
public class MovieBookingSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MovieBookingSystemApplication.class, args);
	}

	@Autowired
	ICustomerDao dao2;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub'
		
		Customer user=new Customer();
		user.setPassword("poslani");
		user.setContact("9573028680");
		user.setEmail("polsani.sandeep@gmail.com");
		user.setUsername("rapidXsandeep");
		user.setUserType(UserType.CUSTOMER);
		dao2.addCustomer(user);
		System.out.println("done sandeep");
//		user=dao.addUser(user);
		System.out.println("done sandeep");
	}

}
