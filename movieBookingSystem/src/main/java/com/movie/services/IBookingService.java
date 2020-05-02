package com.movie.services;

import com.movie.entities.Booking;

public interface IBookingService {

	public void saveBooking(Booking entityObject);
	
	public void updatePayment(Booking booking);
	
}
