package pkgs.pkgExes;

import java.time.*;
import java.time.format.*;

public class Exe001 {

	public static void main(String[] args) {
		m1();
	}

	public static void m1() {
		System.out.println("Exe001.m1()");
		ZonedDateTime zdt = ZonedDateTime.of(2024, 10, 17, 18, 35, 59, 9999, ZoneId.of("GMT-7"));
		System.out.println(zdt);
	}

}

/*

*/
