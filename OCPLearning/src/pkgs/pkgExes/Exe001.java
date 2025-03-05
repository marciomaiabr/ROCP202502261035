package pkgs.pkgExes;

import pkgs.pkg6.Show;

public class Exe001 {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		System.out.println("Exe001.m1()");
		Show.ticketAgentBooks("1A");
		Show.ticketAgentBooks("1A");
	}

}
