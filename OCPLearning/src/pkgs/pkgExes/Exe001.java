package pkgs.pkgExes;

import pkgs.pkg6.ShowEnum;

public class Exe001 {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		System.out.println("Exe001.m1()");
		ShowEnum.ticketAgentBooks("1A");
		ShowEnum.ticketAgentBooks("1A");
	}

}
