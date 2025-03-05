package pkgs.pkg6;

import java.util.HashSet;
import java.util.Set;

public enum ShowEnum {
	INSTANCE;
	private Set<String> availableSeats;

	private ShowEnum() {
		availableSeats = new HashSet<String>();
		availableSeats.add("1A");
		availableSeats.add("1B");
	}

	public boolean bookSeat(String seat) {
		return availableSeats.remove(seat);
	}

	public static void ticketAgentBooks(String set) {
		ShowEnum show = ShowEnum.INSTANCE;
		System.out.println(show.bookSeat(set));
	}

}
