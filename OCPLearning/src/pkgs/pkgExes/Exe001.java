package pkgs.pkgExes;

import java.time.*;

public class Exe001 {

	public static void main(String[] args) {
		System.out.println("<>");
		m1();
		System.out.println("</>");
	}

	public static void m1() {
		System.out.println("Exe001.m1()");
		LocalDate ld = LocalDate.of(2024, 4, 8);
		LocalTime lt = LocalTime.of(13, 35, 56, 0);
		LocalDateTime ldt = LocalDateTime.of(ld, lt);
		System.out.println(ldt);
		ZoneId zoneIdUSCentral = ZoneId.of("US/Central");
		ZonedDateTime zdt = ZonedDateTime.of(ldt, zoneIdUSCentral);
		System.out.println(zdt);
	}

}

/*

*/

/*

*/
