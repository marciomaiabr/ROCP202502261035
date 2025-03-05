package pkgs.pkg6;

import java.util.HashSet;
import java.util.Set;

public class Show {

	private static final Show INSTANCE = new Show();
	private Set<String> availableSeats;

	public static Show getInstance() {
		return INSTANCE;
	}

	private Show() {
		availableSeats = new HashSet<String>();
		availableSeats.add("1A");
		availableSeats.add("1B");
	}

	public boolean bookSeat(String seat) {
		return availableSeats.remove(seat);
	}

	public static void ticketAgentBooks(String set) {
		System.out.println(INSTANCE.bookSeat(set));
	}

}
