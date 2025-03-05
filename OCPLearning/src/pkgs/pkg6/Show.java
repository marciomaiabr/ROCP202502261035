package pkgs.pkg6;

import java.util.HashSet;
import java.util.Set;

public class Show {

	private static Show INSTANCE;
	private Set<String> availableSeats;

	public static Show getInstance() {
		if(INSTANCE == null)
			INSTANCE = new Show();
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
		Show show = Show.getInstance();
		System.out.println(show.bookSeat(set));
	}

}
