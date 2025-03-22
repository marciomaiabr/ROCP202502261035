package pkgs.pkgExes;

import java.time.*;

public class Exe001 {

	public static void main(String[] args) {
		System.out.println("<>");
		m1();
		System.out.println("</>");
	}

	public static void m1() {
		System.out.println("Exe001.m1()");
		LocalDate ld = LocalDate.of(2024, 4, 10);
		LocalTime lt = LocalTime.of(2, 30, 0, 0);
		LocalDateTime ldt = LocalDateTime.of(ld, lt);
		System.out.println(ldt);

		System.out.println();

		ZoneId zoneId = ZoneId.of("US/Central");

		ZonedDateTime zdt = ZonedDateTime.of(ldt, zoneId);
		System.out.println(zdt);
		System.out.println("[isDaylightSavings="+(zdt.getZone().getRules().isDaylightSavings(zdt.toInstant()))+"]");

		System.out.println();

		System.out.println("Um mês atrás, primeiro dia horário de verão");

		System.out.println();

		ZonedDateTime zdt2 = zdt.minus(Period.ofMonths(1));
		System.out.println(zdt2);
		System.out.println("[isDaylightSavings="+(zdt2.getZone().getRules().isDaylightSavings(zdt2.toInstant()))+"]");

		System.out.println();

		System.out.println("mudando o zoneId de US/Central para US/Pacific");

		System.out.println();

		zoneId = ZoneId.of("US/Pacific");

		System.out.println("withZoneSameInstant");
		ZonedDateTime zdt3 = zdt2.withZoneSameInstant(zoneId);//sendo Instant o LocalDateTime corrigido para o GMT Z, ele pega esse valor e corrige para o zoneId do parâmetro
		System.out.println(zdt3);
		System.out.println("[isDaylightSavings="+(zdt3.getZone().getRules().isDaylightSavings(zdt3.toInstant()))+"]");

		System.out.println();

		System.out.println("withZoneSameLocal");
		ZonedDateTime zdt4 = zdt2.withZoneSameLocal(zoneId);//ele TENTA manter o LocalDateTime, porém há situações em que não consegue, vide abaixo
		System.out.println(zdt4);
		System.out.println("[isDaylightSavings="+(zdt4.getZone().getRules().isDaylightSavings(zdt4.toInstant()))+"]");
	}

}

/*

neste caso withZoneSameLocal MANTÉM O MESMO LocalDateTime

<>
Exe001.m1()
2024-04-10T05:30

2024-04-10T05:30-05:00[US/Central]
[isDaylightSavings=true]

Um mês atrás, primeiro dia horário de verão

2024-03-10T05:30-05:00[US/Central]
[isDaylightSavings=true]

mudando o zoneId de US/Central para US/Pacific

withZoneSameInstant
2024-03-10T03:30-07:00[US/Pacific]
[isDaylightSavings=true]

withZoneSameLocal
2024-03-10T05:30-07:00[US/Pacific]
[isDaylightSavings=true]
</>

neste caso withZoneSameLocal TENTA MANTER O MESMO LocalDateTime PORÉM PRIMEIRO DIA DE Daylight portanto NÃO EXISTE T02:30 POIS ADIANTA-SE 1H, ou seja T03:30

<>
Exe001.m1()
2024-04-10T02:30

2024-04-10T02:30-05:00[US/Central]
[isDaylightSavings=true]

Um mês atrás, primeiro dia horário de verão

2024-03-10T03:30-05:00[US/Central]
[isDaylightSavings=true]

mudando o zoneId de US/Central para US/Pacific

withZoneSameInstant
2024-03-10T00:30-08:00[US/Pacific]
[isDaylightSavings=false]

withZoneSameLocal
2024-03-10T03:30-07:00[US/Pacific]
[isDaylightSavings=true]
</>

*/
