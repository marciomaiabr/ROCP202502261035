package pkgs.pkgExes;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
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
		System.out.println(zdt.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm")));
		System.out.println(zdt.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));
		System.out.println(zdt.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).withLocale(Locale.UK)));
	}

}

/*
<>
Exe001.m1()
2024-04-08T13:35:56
2024-04-08T13:35:56-05:00[US/Central]
08/04/2024 01:35
13:35
13:35
</>
*/

/*

*/
