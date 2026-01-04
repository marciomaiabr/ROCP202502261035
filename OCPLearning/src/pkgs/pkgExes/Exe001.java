package pkgs.pkgExes;

import java.time.*;

public class Exe001 {



	public static void main(String[] args) {

		LocalTime o3 = null;

		//o3 = LocalTime.from(LocalDate.now());//DateTimeException: Unable to obtain LocalTime from TemporalAccessor: 2026-01-04 of type java.time.LocalDate
		System.out.println(o3);

		o3 = LocalTime.from(LocalTime.now());
		System.out.println(o3);

		o3 = LocalTime.from(LocalDateTime.now());
		System.out.println(o3);

		o3 = LocalTime.from(LocalDateTime.now().atZone(ZoneId.systemDefault()));
		System.out.println(o3);

		LocalDate o2 = null;

		o2 = LocalDate.from(LocalDate.now());
		System.out.println(o2);

		//o2 = LocalDate.from(LocalTime.now());//DateTimeException: Unable to obtain LocalDate from TemporalAccessor: 10:18:19.997 of type java.time.LocalTime
		System.out.println(o2);

		o2 = LocalDate.from(LocalDateTime.now());
		System.out.println(o2);

		o2 = LocalDate.from(LocalDateTime.now().atZone(ZoneId.systemDefault()));
		System.out.println(o2);

		LocalDateTime o = null;

		//o = LocalDateTime.from(LocalDate.now());//DateTimeException: Unable to obtain LocalTime from TemporalAccessor: 2026-01-04 of type java.time.LocalDate
		System.out.println(o);

		//o = LocalDateTime.from(LocalTime.now());//DateTimeException: Unable to obtain LocalDateTime from TemporalAccessor: 10:15:54.356 of type java.time.LocalTime
		System.out.println(o);

		o = LocalDateTime.from(LocalDateTime.now());
		System.out.println(o);

		o = LocalDateTime.from(LocalDateTime.now().atZone(ZoneId.systemDefault()));
		System.out.println(o);

	}

}
