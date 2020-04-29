package com.movie.services;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.dao.IUniversalDao;
import com.movie.entities.Customer;
import com.movie.entities.Seat;
import com.movie.entities.SeatState;
import com.movie.entities.Show;
@Service
public class SeatService implements ISeatService{

	@Autowired
	IUniversalDao<Seat> dao;
	
	@Override
	public Seat getSeat(Integer id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public SeatState getSeatStatus(Integer id) {
		// TODO Auto-generated method stub
		return dao.findById(id).getSeatStatus();
	}

	@Override
	public Double getSeatPrice(Integer id) {
		// TODO Auto-generated method stub
		return dao.findById(id).getSeatPrice();
	}

	@Override
	public Show getShow(Integer id) {
		// TODO Auto-generated method stub
		return dao.findById(id).getShow();
	}

	@Override
	public Customer getCustomer(Integer id) {
		// TODO Auto-generated method stub
		return  dao.findById(id).getCustomer();
	}

	@Override
	public void BlockSeat(Integer id) {
		// TODO Auto-generated method stub
		Seat seat=dao.findById(id);
		seat.setSeatStatus(SeatState.BLOCKED);
		dao.update(seat);
		
	}

	@Override
	public void unBlockSeat(Integer id) {
		// TODO Auto-generated method stub
		Seat seat=dao.findById(id);
		seat.setSeatStatus(SeatState.AVAILABLE);
		dao.update(seat);	
	}

	@Override
	public void bookSeat(Integer id) {
		// TODO Auto-generated method stub
		Seat seat=dao.findById(id);
		seat.setSeatStatus(SeatState.BOOKED);
		dao.update(seat);
		
	}

	@Override
	public List<Seat> selectSeats(List<Integer> seats) {
		// TODO Auto-generated method stub
		
		List<Seat> seatsList=null;
		for (Iterator iterator = seats.iterator(); iterator.hasNext();) {
			Integer seatid = (Integer) iterator.next();
			seatsList.add(dao.findById(seatid));
		}
		
		return seatsList;
	}

	@Override
	public void blockSeats(List<Seat> seats) {
		// TODO Auto-generated method stub
		for (Iterator iterator = seats.iterator(); iterator.hasNext();) {
			Seat seat = (Seat) iterator.next();
			seat.setSeatStatus(SeatState.BLOCKED);
			dao.update(seat);	
		}
		
		
	}

	@Override
	public void unBlockSeats(List<Seat> seats) {
		// TODO Auto-generated method stub
		for (Iterator iterator = seats.iterator(); iterator.hasNext();) {
			Seat seat = (Seat) iterator.next();
			seat.setSeatStatus(SeatState.AVAILABLE);
			dao.update(seat);	
		}
		
	}

	@Override
	public void bookSeats(List<Seat> seats) {
		// TODO Auto-generated method stub
		for (Iterator iterator = seats.iterator(); iterator.hasNext();) {
			Seat seat = (Seat) iterator.next();
			seat.setSeatStatus(SeatState.BOOKED);
			dao.update(seat);	
		}
		
	}

	@Override
	public void unBookSeat(Integer id) {
		// TODO Auto-generated method stub
		Seat seat=dao.findById(id);
		seat.setSeatStatus(SeatState.AVAILABLE);
		dao.update(seat);
	}

}
