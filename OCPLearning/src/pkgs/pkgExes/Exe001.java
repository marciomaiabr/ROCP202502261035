package pkgs.pkgExes;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Exe001 {

	public static void main(String[] args) {
		System.out.println("<>");
		m1();
		System.out.println("</>");
	}

	public static void m1() {
		System.out.println("Exe001.m1()");
		LocalTime lt1 = LocalTime.of(12, 17, 32);
		System.out.println(lt1);
		LocalTime lt2 = LocalTime.of(13, 35, 56);
		System.out.println(lt2);
		long minutos = ChronoUnit.MINUTES.between(lt1, lt2);//perda de segundos na conversão
		System.out.println("[minutos="+(minutos)+"]");
		Duration duration = Duration.ofMinutes(minutos);
		System.out.println("[duration="+(duration)+"]");
		LocalTime lt3 = lt1.plus(duration);
		System.out.println("[lt2="+(lt2)+"][lt3="+(lt3)+"]");//não bateu pois houve perda de segundos na conversão

		System.out.println();

		System.out.println("[Duration.ofHours(49)="+(Duration.ofHours(49))+"][Duration.ofDays(3)="+(Duration.ofDays(3))+"]");//não são exibidos como dias para evitar confusão com Period

		System.out.println("[Duration.of(5, ChronoUnit.DAYS)="+(Duration.of(5, ChronoUnit.DAYS))+"]");

		//System.out.println("[Duration.of(5, ChronoUnit.MONTHS)="+(Duration.of(5, ChronoUnit.MONTHS))+"]");//maior ChronoUnit permitido é DAYS//UnsupportedTemporalTypeException: Unit must not have an estimated duration

	}

}

/*
<>
Exe001.m1()
12:17:32
13:35:56
[minutos=78]
[duration=PT1H18M]
[lt2=13:35:56][lt3=13:35:32]

[Duration.ofHours(49)=PT49H][Duration.ofDays(3)=PT72H]
[Duration.of(5, ChronoUnit.DAYS)=PT120H]
</>
*/

/*
testando Duration
horas, minutos e segundos
*/
