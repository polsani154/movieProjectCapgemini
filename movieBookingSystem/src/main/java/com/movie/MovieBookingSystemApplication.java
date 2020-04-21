package com.movie;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.movie.dao.CustomerDao;
import com.movie.dao.ICustomerDao;
import com.movie.dao.IMovieDao;
import com.movie.dao.ITheatreDao;
import com.movie.dao.IUniversalDao;
import com.movie.dao.IUserDao;
import com.movie.dao.UserDao;
import com.movie.entities.Customer;
import com.movie.entities.Movie;
import com.movie.entities.Theatre;
import com.movie.entities.User;
import com.movie.entities.UserType;

@SpringBootApplication
public class MovieBookingSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MovieBookingSystemApplication.class, args);
	}

	@Autowired
	IUniversalDao<Movie> dao;
	@Autowired
	IUniversalDao<Theatre> dao2;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub'
		
		Movie movie=dao.findById(4);
		Movie movie2=dao.findById(6);
		Movie movie3=dao.findById(7);
		
		Theatre t=dao2.findById(5);
		Set<Movie> movies=t.getListOfMovies();
		
		for (Iterator iterator = t.getListOfMovies().iterator(); iterator.hasNext();) {
			Movie type = (Movie) iterator.next();
			System.out.println(type.getMovieName());;
		};
		
		movies.add(movie);
		movies.add(movie2);
		movies.add(movie3);
		
		t.setListOfMovies(movies);
		
		dao2.update(t);
		
		
		
		
//		dao2.update(t);
//		t=dao2.update(t);
		
//		System.out.println(t.getTheatreName());
		
//		System.out.println(movie.getDirector());
//		movie.setDirector("trivikram");
//		movie.setGenre("drama");
//		movie.setHero("MB");
//		movie.setHeroine("Trisha");
//		movie.setMovieName("Athadu 3");
	
//		Theatre t =new Theatre();
//		t.setManagerContact("6532162");
//		t.setManagerName("polsani");
//		t.setTheatreCity("warangal");
//		t.setTheatreName("Amrutha");
//		
//		dao.addTheatre(t);
		
//		dao.addMovie(movie);
		
		
		System.out.println("hai sandeep");
	}

}
