package pkgs.pkgExes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Exe001 {

	public static void main(String[] args) {
		m3();
	}

	public static void m3() {
		System.out.println("Exe001.m3()");
		LocalTime lt = null;
		//lt = LocalTime.parse("2025/12/31", DateTimeFormatter.ofPattern("yyyy/MM/dd"));//DateTimeException: Unable to obtain LocalTime from TemporalAccessor: {},ISO resolved to 2025-12-31 of type java.time.format.Parsed
		lt = LocalTime.parse("2025/12/31 23:59", DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));
		System.out.println(lt);
		lt = LocalTime.parse("23:59", DateTimeFormatter.ofPattern("HH:mm"));
		System.out.println(lt);
	}

	public static void m2() {
		System.out.println("Exe001.m2()");
		LocalDate ld = null;
		//ld = LocalDate.parse("23:59", DateTimeFormatter.ofPattern("HH:mm"));//DateTimeException: Unable to obtain LocalDate from TemporalAccessor: {},ISO resolved to 23:59 of type java.time.format.Parsed
		ld = LocalDate.parse("2025/12/31 23:59", DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));
		System.out.println(ld);
		ld = LocalDate.parse("2025/12/31", DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		System.out.println(ld);
	}

	public static void m1() {
		System.out.println("Exe001.m1()");
		LocalDateTime ldt = null;
		//ldt = LocalDateTime.parse("2025/12/31", DateTimeFormatter.ofPattern("yyyy/MM/dd"));//DateTimeException: Unable to obtain LocalDateTime from TemporalAccessor
		ldt = LocalDateTime.parse("2025/12/31 23:59", DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));
		System.out.println(ldt);
	}

}

/*

*/
