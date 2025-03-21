package pkgs.pkgExes;

import java.time.*;
import java.time.format.*;

public class Exe001 {

	public static void main(String[] args) {
		m1();
		m2();
	}

	public static void m2() {
		System.out.println("Exe001.m2()");
		ZoneId zone = ZoneId.of("GMT-7");
		System.out.println(zone);
		ZonedDateTime zdt = ZonedDateTime.of(2024, 4, 1, 18, 35, 59, 9999, ZoneId.of("US/Pacific"));
		System.out.println(zdt);
		Instant instant = zdt.toInstant();
		System.out.println(instant);
		System.out.println(zone.getRules().isDaylightSavings(instant));
		System.out.println(zone.getRules());
		System.out.println(zone.getRules().isFixedOffset());
		//zone.getRules().getTransitions().forEach(System.out::println);//historico de transicoes
	}

	public static void m1() {
		System.out.println("Exe001.m1()");
		ZoneId zone = ZoneId.of("US/Pacific");
		System.out.println(zone);
		ZonedDateTime zdt = ZonedDateTime.of(2024, 4, 1, 18, 35, 59, 9999, ZoneId.of("US/Pacific"));
		System.out.println(zdt);
		Instant instant = zdt.toInstant();
		System.out.println(instant);
		System.out.println(zone.getRules().isDaylightSavings(instant));
		System.out.println(zone.getRules());
		System.out.println(zone.getRules().isFixedOffset());
		//zone.getRules().getTransitions().forEach(System.out::println);//historico de transicoes
	}

}

/*

*/
