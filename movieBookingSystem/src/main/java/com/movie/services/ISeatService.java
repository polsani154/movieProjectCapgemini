package com.movie.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.movie.entities.Customer;
import com.movie.entities.Seat;
import com.movie.entities.SeatState;
import com.movie.entities.Show;
import com.movie.exceptions.IllegalSeatStateChangeException;
import com.movie.exceptions.NullPropertyException;

@Service
public interface ISeatService {

	public Seat getSeat(Integer id);
	
	public SeatState getSeatStatus(Integer id);
	
	public Double getSeatPrice(Integer id);
	
	public Show getShow(Integer id);
	
	public Customer getCustomer(Integer id) throws NullPropertyException;
	
	public void BlockSeat(Integer id) throws IllegalSeatStateChangeException;
	
	public void unBlockSeat(Integer id) throws IllegalSeatStateChangeException;
	
	public void bookSeat(Integer id);
	
	public void unBookSeat(Integer id);
	
	public List<Seat> selectSeats(List<Integer> seats);
	
	public void blockSeats(List<Seat> seats);
	
	public void unBlockSeats(List<Seat> seats);

	public void bookSeats(List<Seat> seats);
}
