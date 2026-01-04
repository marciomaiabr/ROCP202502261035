package pkgs.pkgExes;

import java.time.*;

public class Exe001 {



	public static void main(String[] args) {

		ZonedDateTime zdt = null;

		//zdt = ZonedDateTime.from(LocalDate.now());//DateTimeException: Unable to obtain ZonedDateTime from TemporalAccessor: 2026-01-04 of type java.time.LocalDate
		System.out.println(zdt);

		//zdt = ZonedDateTime.from(LocalTime.now());//DateTimeException: Unable to obtain ZoneId from TemporalAccessor: 09:53:08.970 of type java.time.LocalTime
		System.out.println(zdt);

		//zdt = ZonedDateTime.from(LocalDateTime.now());//DateTimeException: Unable to obtain ZonedDateTime from TemporalAccessor: 2026-01-04T09:53:28.386 of type java.time.LocalDateTime
		System.out.println(zdt);

		zdt = ZonedDateTime.from(LocalDateTime.now().atZone(ZoneId.systemDefault()));
		System.out.println(zdt);



		System.out.println(ZonedDateTime.parse("2025-12-31T23:59-04:00"));
		//System.out.println(LocalDateTime.parse("2025-12-31T23:59-04:00"));//DateTimeParseException: Text '2025-12-31T23:59-04:00' could not be parsed, unparsed text found at index 16
		System.out.println(LocalDateTime.parse("2025-12-31T23:59"));
		//System.out.println(LocalDate.parse("2025-12-31T23:59-04:00"));//DateTimeParseException: Text '2025-12-31T23:59-04:00' could not be parsed, unparsed text found at index 10
		System.out.println(LocalDate.parse("2025-12-31"));
		//System.out.println(LocalTime.parse("2025-12-31T23:59-04:00"));//DateTimeParseException: Text '2025-12-31T23:59-04:00' could not be parsed at index 2
		System.out.println(LocalTime.parse("23:59"));

	}

}
