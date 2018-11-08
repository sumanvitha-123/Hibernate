package com.cg.jpastart.entities;

import javax.persistence.Embeddable;

@Embeddable
public class SeatInfo {
	
	int total_count;
	int booked_seat;
	int available_seat;
	public int getBooked_seat() {
		return booked_seat;
	}
	public void setBooked_seat(int booked_seat) {
		this.booked_seat = booked_seat;
	}
	public int getAvailable_seat() {
		return available_seat;
	}
	public void setAvailable_seat(int available_seat) {
		this.available_seat = available_seat;
	}
	@Override
	public String toString() {
		return "SeatInfo [total_count=" + total_count + ", booked_seat="
				+ booked_seat + ", available_seat=" + available_seat + "]";
	}
	public SeatInfo() {
		super();
	}
	
	public SeatInfo(int total_count, int booked_seat, int available_seat) {
		super();
		this.total_count = total_count;
		this.booked_seat = booked_seat;
		this.available_seat = available_seat;
	}
	

}
