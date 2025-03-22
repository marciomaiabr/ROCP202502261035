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
		LocalDate ld = LocalDate.of(2024, 4, 8);
		LocalTime lt = LocalTime.of(13, 35, 56, 0);
		LocalDateTime ldt = LocalDateTime.of(ld, lt);
		System.out.println(ldt);
		ZoneId zoneIdUSCentral = ZoneId.of("US/Central");
		ZonedDateTime zdt = ZonedDateTime.of(ldt, zoneIdUSCentral);
		System.out.println(zdt);
		Instant instant = zdt.toInstant();
		System.out.println("[instant="+(instant)+"]");
		System.out.println("[ZonedDateTime.ofInstant(instant, zoneIdUSCentral)="+(ZonedDateTime.ofInstant(instant, zoneIdUSCentral))+"]");
		System.out.println("[ZonedDateTime.ofInstant(instant, ZoneId.systemDefault())="+(ZonedDateTime.ofInstant(instant, ZoneId.systemDefault()))+"]");
	}

}

/*
<>
Exe001.m1()
2024-04-08T13:35:56
2024-04-08T13:35:56-05:00[US/Central]
[instant=2024-04-08T18:35:56Z]
[ZonedDateTime.ofInstant(instant, zoneIdUSCentral)=2024-04-08T13:35:56-05:00[US/Central]]
[ZonedDateTime.ofInstant(instant, ZoneId.systemDefault())=2024-04-08T14:35:56-04:00[America/Cuiaba]]
</>
*/

/*
testando Instant
comparando com timestamps é como se fosse um gigante long, não é timestamps pois Instant inclui também nanoseconds e ficaria muito muito grande
para OBTER um Instant PRECISA de um ZoneId
POIS Instant nada mais é do que o ZonedDateTime calculado no GMT raíz/central/inicial/0 que é indicado com o "Z" no final ao invés de "US/Central" por exemplo
*/
