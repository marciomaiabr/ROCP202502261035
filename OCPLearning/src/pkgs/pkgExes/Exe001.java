package pkgs.pkgExes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Exe001 {



	public static void main(String[] args) {

		LocalDate pieDay = LocalDate.of(2017, Month.JANUARY, 23);
		LocalTime midnight = LocalTime.of(0, 0);
		LocalDateTime pieTime = LocalDateTime.of(pieDay, midnight);

		DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println("[f="+(f)+"]"+"[f.getLocale()="+(f.getLocale())+"]");
		System.out.println("[f.format(pieDay)="+(f.format(pieDay))+"]");
		System.out.println("[f.format(pieTime)="+(f.format(pieTime))+"]");
		//f.format(midnight);//UnsupportedTemporalTypeException: Unsupported field: DayOfMonth

	}

}
