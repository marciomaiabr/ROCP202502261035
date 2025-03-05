package pkgs.pkg6;

import java.util.HashSet;
import java.util.Set;

public class Show {

	private Set<String> availableSeats;

	public Show() {
		availableSeats = new HashSet<String>();
		availableSeats.add("1A");
		availableSeats.add("1B");
	}

	public boolean bookSeat(String seat) {
		return availableSeats.remove(seat);
	}

}
