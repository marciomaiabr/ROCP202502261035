package pkgs.pkgExes;

import java.time.*;
import java.time.temporal.ChronoField;

public class Exe001 {



	public static void main(String[] args) {

		System.out.println();
		LocalDateTime ldt200304060100 = LocalDateTime.of(2003, Month.APRIL, 6, 1, 0);
		System.out.println("[ldt200304060100="+(ldt200304060100)+"]");
		OffsetDateTime odt200304060100 = OffsetDateTime.of(ldt200304060100, ZoneOffset.of("-05:00"));
		System.out.println("[odt200304060100="+(odt200304060100)+"]");

		System.out.println();
		LocalDateTime ldt200304060200 = LocalDateTime.of(2003, Month.APRIL, 6, 2, 0);
		System.out.println("[ldt200304060200="+(ldt200304060200)+"]");
		OffsetDateTime odt200304060200 = OffsetDateTime.of(ldt200304060200, ZoneOffset.of("-05:00"));
		System.out.println("[odt200304060200="+(odt200304060200)+"]");
		odt200304060200 = odt200304060200.with(ChronoField.HOUR_OF_DAY, 5);
		System.out.println("[odt200304060200="+(odt200304060200)+"]");
		odt200304060200 = odt200304060200.with(ChronoField.HOUR_OF_DAY, 2);
		System.out.println("[odt200304060200="+(odt200304060200)+"]");

		System.out.println();
		LocalDateTime ldt200304060300 = LocalDateTime.of(2003, Month.APRIL, 6, 3, 0);
		System.out.println("[ldt200304060300="+(ldt200304060300)+"]");
		OffsetDateTime odt200304060300 = OffsetDateTime.of(ldt200304060300, ZoneOffset.of("-05:00"));
		System.out.println("[odt200304060300="+(odt200304060300)+"]");

	}

}
