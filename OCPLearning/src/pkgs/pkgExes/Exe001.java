package pkgs.pkgExes;

import java.time.*;
import java.util.Locale;

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
		System.out.println(Locale.ITALY);
		System.out.println(Locale.ITALIAN);
		System.out.println(new Locale("it"));//language
		System.out.println(new Locale("it", "IT"));//language//country
	}

}

/*
<>
Exe001.m1()
2024-04-08T13:35:56
2024-04-08T13:35:56-05:00[US/Central]
it_IT
it
it
it_IT
</>
*/

/*

*/
