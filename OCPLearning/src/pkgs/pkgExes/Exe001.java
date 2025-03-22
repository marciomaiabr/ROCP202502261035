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

		System.out.println();

		ZoneId zoneIdUSCentral = ZoneId.of("US/Central");

		ZonedDateTime zdt = ZonedDateTime.of(ldt, zoneIdUSCentral);
		System.out.println(zdt);
		System.out.println(zdt.toLocalDateTime());
		System.out.println("[isDaylightSavings="+(zdt.getZone().getRules().isDaylightSavings(zdt.toInstant()))+"]");

		System.out.println();

		Period period = Period.ofMonths(1);
		System.out.println(period);

		ZonedDateTime zdt2 = zdt.minus(period);
		System.out.println(zdt2);
		LocalDateTime ldt2 = zdt2.toLocalDateTime();
		System.out.println(ldt2);
		System.out.println("[isDaylightSavings="+(zdt2.getZone().getRules().isDaylightSavings(zdt2.toInstant()))+"]");
	}

}

/*
<>
Exe001.m1()
2024-04-08T13:35:56

2024-04-08T13:35:56-05:00[US/Central]
2024-04-08T13:35:56
[isDaylightSavings=true]

P1M
2024-03-08T13:35:56-06:00[US/Central]
2024-03-08T13:35:56
[isDaylightSavings=false]
</>
*/

/*
testando Period
período de dias, meses ou anos
*/
