package se.chalmers.cse.mdsd1617.yakindu;

public class Assignment3Complete {
	private long currentBookingId = 0;
	private long currentReservationNumber = 0;

	private final int MAX_ROOMS = 5;

	public long initiateBooking() {
		return ++currentBookingId;
	}

	public boolean addRoomToBooking(long bookingId) {
		if (bookingId < 1 || bookingId > currentBookingId) {
			return false;
		} else if (currentReservationNumber >= MAX_ROOMS) {
			return false;
		} else {
			++currentReservationNumber;
			return true;
		}
	}
}
