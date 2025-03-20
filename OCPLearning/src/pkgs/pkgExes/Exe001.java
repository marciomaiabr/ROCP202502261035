package pkgs.pkgExes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Exe001 {

	public static void main(String[] args) {
		m3();
	}

	public static void m3() {
		System.out.println("Exe001.m3()");
		//ISO-8601 YYYY-MM-DD//https://www.iso.org/iso-8601-date-and-time-format.html
		//https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

		LocalDate ld = null;
		LocalTime lt = null;
		LocalDateTime ldt = null;

		ld = LocalDate.of(2025, 12, 31);
		System.out.println(ld);
		ld = LocalDate.of(2025, Month.DECEMBER, 31);
		System.out.println(ld);
		//ld = LocalDate.parse("2025/12/31");//DateTimeParseException: Text '2025/12/31' could not be parsed at index 4
		//ld = LocalDate.parse("2025-31-12");//DateTimeParseException: Text '2025-31-12' could not be parsed: Invalid value for MonthOfYear (valid values 1 - 12): 31
		ld = LocalDate.parse("2025-12-31");
		System.out.println(ld);

		lt = LocalTime.of(23, 59);
		System.out.println(lt);
		lt = LocalTime.of(23, 59, 59);
		System.out.println(lt);
		lt = LocalTime.of(23, 59, 59, 999999999);
		System.out.println(lt);
		lt = LocalTime.parse("23:59");
		System.out.println(lt);
		lt = LocalTime.parse("23:59:59");
		System.out.println(lt);
		lt = LocalTime.parse("23:59:59.999999999");
		System.out.println(lt);

		ldt = LocalDateTime.of(ld, lt);
		System.out.println(ldt);
		ldt = LocalDateTime.of(2025, 12, 31, 23, 59);
		System.out.println(ldt);
		ldt = LocalDateTime.of(2025, 12, 31, 23, 59, 59);
		System.out.println(ldt);
		ldt = LocalDateTime.of(2025, 12, 31, 23, 59, 59, 999999999);
		System.out.println(ldt);
		ldt = LocalDateTime.parse("2025-12-31T23:59");
		System.out.println(ldt);
		ldt = LocalDateTime.parse("2025-12-31T23:59:59.999999999");
		System.out.println(ldt);
	}

	public static void m2() {
		System.out.println("Exe001.m2()");
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		LocalDateTime ldt = LocalDateTime.of(ld, lt);
		System.out.println(ldt);
	}

	public static void m1() {
		System.out.println("Exe001.m1()");
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
	}

}

/*

*/
