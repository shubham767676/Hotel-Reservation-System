package com.bridgelabz.HotelReservationClass;

/* @purpose: Hotel Reservation System
 * @file: HotelReservationClass.java
 * @author: Shubham Singh
 */

public class HotelReservationClass {
	public Hotel addHotel(String hotelName, double weekDayRate) {
		Hotel hotel = new Hotel(); // New Constructor
		hotel.setHotelName(hotelName);
		hotel.setWeekdayRegularCustomerCost(weekDayRate);
		return hotel;
	}

	Hotel hotel = new Hotel("Lakewood", 110, 0.0); // New Hotel added

	public static void main(String[] args) {
		System.out.println("Welcome to Hotel Reservation Program"); // Displaying welcome message
		// System.out.println(hotel);
		System.out.println(Hotel);
	}

}
