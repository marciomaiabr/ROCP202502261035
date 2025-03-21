package pkgs.pkgExes;

import java.time.*;
import java.time.format.*;

public class Exe001 {

	public static void main(String[] args) {
		m3();
	}

	public static void m3() {
		System.out.println("Exe001.m3()");
		LocalTime lt = LocalTime.of(18, 35);
		System.out.println(lt);
		LocalTime lt2 = lt.plusMinutes(30);
		System.out.println(lt);
		System.out.println(lt2);
	}

	public static void m2() {
		System.out.println("Exe001.m2()");
		LocalDate ld = LocalDate.of(2024, 10, 17);
		System.out.println(ld);
		LocalDate ld2 = ld.plusDays(1);
		System.out.println(ld);
		System.out.println(ld2);
	}

	public static void m1() {
		System.out.println("Exe001.m1()");
		LocalDateTime ldt = LocalDateTime.of(2024, 10, 17, 18, 35);
		System.out.println(ldt);
		LocalDateTime ldt2 = ldt.plusHours(1);
		System.out.println(ldt);
		System.out.println(ldt2);
	}

}

/*

*/
