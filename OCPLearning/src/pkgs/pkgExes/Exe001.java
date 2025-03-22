package pkgs.pkgExes;

import java.time.*;
import java.time.format.*;
import java.time.temporal.TemporalAdjusters;

public class Exe001 {

	public static void main(String[] args) {
		m1();
	}

	public static void m1() {
		System.out.println("Exe001.m1()");
		ZonedDateTime zdt = ZonedDateTime.of(2024, 4, 1, 18, 35, 59, 9999, ZoneId.systemDefault());
		System.out.println(zdt);
		ZonedDateTime zdt2 = zdt.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
		System.out.println(zdt);
		System.out.println(zdt2);
	}

}

/*

*/
