package pkgs.pkgExes;

import java.time.*;
import java.time.temporal.ChronoField;

public class Exe001 {



	public static void main(String[] args) {

		System.out.println();
		LocalDateTime ldt200304050200 = LocalDateTime.of(2003, Month.APRIL, 5, 2, 0);
		System.out.println("[ldt200304050200="+(ldt200304050200)+"]");
		ZonedDateTime zdt200304050200 = ZonedDateTime.of(ldt200304050200, ZoneId.of("America/New_York"));
		System.out.println("[zdt200304050200="+(zdt200304050200)+"]"+"[zdt200304050200="+(zdt200304050200.getZone().getRules().isDaylightSavings(zdt200304050200.toInstant()))+"]");

		System.out.println();
		LocalDateTime ldt200304060100 = LocalDateTime.of(2003, Month.APRIL, 6, 1, 0);
		System.out.println("[ldt200304060100="+(ldt200304060100)+"]");
		ZonedDateTime zdt200304060100 = ZonedDateTime.of(ldt200304060100, ZoneId.of("America/New_York"));
		System.out.println("[zdt200304060100="+(zdt200304060100)+"]"+"[zdt200304060100="+(zdt200304060100.getZone().getRules().isDaylightSavings(zdt200304060100.toInstant()))+"]");

		System.out.println();
		LocalDateTime ldt200304060200 = LocalDateTime.of(2003, Month.APRIL, 6, 2, 0);
		System.out.println("[ldt200304060200="+(ldt200304060200)+"]");
		ZonedDateTime zdt200304060200 = ZonedDateTime.of(ldt200304060200, ZoneId.of("America/New_York"));
		System.out.println("[zdt200304060200="+(zdt200304060200)+"]"+"[zdt200304060200="+(zdt200304060200.getZone().getRules().isDaylightSavings(zdt200304060200.toInstant()))+"]");
		zdt200304060200 = zdt200304060200.with(ChronoField.HOUR_OF_DAY, 5);
		System.out.println("[zdt200304060200="+(zdt200304060200)+"]");
		zdt200304060200 = zdt200304060200.with(ChronoField.HOUR_OF_DAY, 2);
		System.out.println("[zdt200304060200="+(zdt200304060200)+"]");

		System.out.println();
		LocalDateTime ldt200304060300 = LocalDateTime.of(2003, Month.APRIL, 6, 3, 0);
		System.out.println("[ldt200304060300="+(ldt200304060300)+"]");
		ZonedDateTime zdt200304060300 = ZonedDateTime.of(ldt200304060300, ZoneId.of("America/New_York"));
		System.out.println("[zdt200304060300="+(zdt200304060300)+"]"+"[zdt200304060300="+(zdt200304060300.getZone().getRules().isDaylightSavings(zdt200304060300.toInstant()))+"]");

		System.out.println();
		LocalDateTime ldt200304070200 = LocalDateTime.of(2003, Month.APRIL, 7, 2, 0);
		System.out.println("[ldt200304070200="+(ldt200304070200)+"]");
		ZonedDateTime zdt200304070200 = ZonedDateTime.of(ldt200304070200, ZoneId.of("America/New_York"));
		System.out.println("[zdt200304070200="+(zdt200304070200)+"]"+"[zdt200304070200="+(zdt200304070200.getZone().getRules().isDaylightSavings(zdt200304070200.toInstant()))+"]");

	}

}
