package pkgs.pkgExes;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Exe001 {

	public static void main(String[] args) {
		System.out.println("<>");
		m1();
		System.out.println("</>");
	}

	public static void m1() {
		System.out.println("Exe001.m1()");
		LocalDate ld = LocalDate.of(2023, 4, 30);
		LocalTime lt = LocalTime.of(13, 35, 56, 0);
		LocalDateTime ldt = LocalDateTime.of(ld, lt);
		System.out.println(ldt);

		System.out.println(ldt.plus(Period.ofMonths(2)));
		System.out.println(ldt.plus(Duration.ofDays(3)));
		System.out.println(ldt.plus(1, ChronoUnit.YEARS));
		//System.out.println(LocalTime.now().plus(1, ChronoUnit.YEARS));//UnsupportedTemporalTypeException: Unsupported unit: Years//Claro pois LocalTime não tem ano
		System.out.println(ldt.with(ChronoField.MONTH_OF_YEAR, 7));//setta 7 no mês do LocalDateTime
		System.out.println(ldt.with(ChronoField.MONTH_OF_YEAR, 2));//setta 2 no mês do LocalDateTime mas como FEVEREIRO só tem 28 dias ela AJUSTA para o último dia, no caso 28

	}

}

/*
<>
Exe001.m1()
2023-04-30T13:35:56
2023-06-30T13:35:56
2023-05-03T13:35:56
2024-04-30T13:35:56
2023-07-30T13:35:56
2023-02-28T13:35:56
</>
*/

/*

*/
