package pkgs.pkgExes;

import java.time.*;
import java.time.temporal.ChronoField;

public class Exe001 {



	public static void main(String[] args) {

		System.out.println();
		LocalDateTime ldt200304050200 = LocalDateTime.of(2003, Month.APRIL, 5, 2, 0);
		System.out.println("[ldt200304050200="+(ldt200304050200)+"]");
		ZonedDateTime zdt200304050200 = null;
		System.out.println("\n.toZonedDateTime()");
		OffsetDateTime odt200304050200 = OffsetDateTime.of(ldt200304050200, ZoneOffset.of("-05:00"));
		System.out.println("[odt200304050200="+(odt200304050200)+"]");
		zdt200304050200 = odt200304050200.toZonedDateTime();
		System.out.println("[zdt200304050200="+(zdt200304050200)+"]"+"[zdt200304050200.getZone()="+(zdt200304050200.getZone())+"]"+"[zdt200304050200.getZone().getRules()="+(zdt200304050200.getZone().getRules())+"]"+"[zdt200304050200.getZone().getRules().isDaylightSavings(zdt200304050200.toInstant())="+(zdt200304050200.getZone().getRules().isDaylightSavings(zdt200304050200.toInstant()))+"]");
		odt200304050200 = OffsetDateTime.of(ldt200304050200, ZoneOffset.of("-01:00"));
		System.out.println("[odt200304050200="+(odt200304050200)+"]");
		zdt200304050200 = odt200304050200.toZonedDateTime();
		System.out.println("[zdt200304050200="+(zdt200304050200)+"]"+"[zdt200304050200.getZone()="+(zdt200304050200.getZone())+"]"+"[zdt200304050200.getZone().getRules()="+(zdt200304050200.getZone().getRules())+"]"+"[zdt200304050200.getZone().getRules().isDaylightSavings(zdt200304050200.toInstant())="+(zdt200304050200.getZone().getRules().isDaylightSavings(zdt200304050200.toInstant()))+"]");
		System.out.println("\n.atZoneSameInstant()");
		zdt200304050200 = odt200304050200.atZoneSameInstant(ZoneId.of("America/New_York"));
		System.out.println("[zdt200304050200="+(zdt200304050200)+"]"+"[zdt200304050200.getZone()="+(zdt200304050200.getZone())+"]"+"[zdt200304050200.getZone().getRules()="+(zdt200304050200.getZone().getRules())+"]"+"[zdt200304050200.getZone().getRules().isDaylightSavings(zdt200304050200.toInstant())="+(zdt200304050200.getZone().getRules().isDaylightSavings(zdt200304050200.toInstant()))+"]");
		zdt200304050200 = odt200304050200.atZoneSameInstant(ZoneId.of("America/Los_Angeles"));
		System.out.println("[zdt200304050200="+(zdt200304050200)+"]"+"[zdt200304050200.getZone()="+(zdt200304050200.getZone())+"]"+"[zdt200304050200.getZone().getRules()="+(zdt200304050200.getZone().getRules())+"]"+"[zdt200304050200.getZone().getRules().isDaylightSavings(zdt200304050200.toInstant())="+(zdt200304050200.getZone().getRules().isDaylightSavings(zdt200304050200.toInstant()))+"]");
		System.out.println("\n.atZoneSimilarLocal()");
		zdt200304050200 = odt200304050200.atZoneSimilarLocal(ZoneId.of("America/New_York"));
		System.out.println("[zdt200304050200="+(zdt200304050200)+"]"+"[zdt200304050200.getZone()="+(zdt200304050200.getZone())+"]"+"[zdt200304050200.getZone().getRules()="+(zdt200304050200.getZone().getRules())+"]"+"[zdt200304050200.getZone().getRules().isDaylightSavings(zdt200304050200.toInstant())="+(zdt200304050200.getZone().getRules().isDaylightSavings(zdt200304050200.toInstant()))+"]");
		zdt200304050200 = odt200304050200.atZoneSimilarLocal(ZoneId.of("America/Los_Angeles"));
		System.out.println("[zdt200304050200="+(zdt200304050200)+"]"+"[zdt200304050200.getZone()="+(zdt200304050200.getZone())+"]"+"[zdt200304050200.getZone().getRules()="+(zdt200304050200.getZone().getRules())+"]"+"[zdt200304050200.getZone().getRules().isDaylightSavings(zdt200304050200.toInstant())="+(zdt200304050200.getZone().getRules().isDaylightSavings(zdt200304050200.toInstant()))+"]");

		System.out.println();
		LocalDateTime ldt200304060100 = LocalDateTime.of(2003, Month.APRIL, 6, 1, 0);
		System.out.println("[ldt200304060100="+(ldt200304060100)+"]");
		ZonedDateTime zdt200304060100 = null;
		System.out.println("\n.toZonedDateTime()");
		OffsetDateTime odt200304060100 = OffsetDateTime.of(ldt200304060100, ZoneOffset.of("-05:00"));
		System.out.println("[odt200304060100="+(odt200304060100)+"]");
		zdt200304060100 = odt200304060100.toZonedDateTime();
		System.out.println("[zdt200304060100="+(zdt200304060100)+"]"+"[zdt200304060100.getZone()="+(zdt200304060100.getZone())+"]"+"[zdt200304060100.getZone().getRules()="+(zdt200304060100.getZone().getRules())+"]"+"[zdt200304060100.getZone().getRules().isDaylightSavings(zdt200304060100.toInstant())="+(zdt200304060100.getZone().getRules().isDaylightSavings(zdt200304060100.toInstant()))+"]");
		odt200304060100 = OffsetDateTime.of(ldt200304060100, ZoneOffset.of("-01:00"));
		System.out.println("[odt200304060100="+(odt200304060100)+"]");
		zdt200304060100 = odt200304060100.toZonedDateTime();
		System.out.println("[zdt200304060100="+(zdt200304060100)+"]"+"[zdt200304060100.getZone()="+(zdt200304060100.getZone())+"]"+"[zdt200304060100.getZone().getRules()="+(zdt200304060100.getZone().getRules())+"]"+"[zdt200304060100.getZone().getRules().isDaylightSavings(zdt200304060100.toInstant())="+(zdt200304060100.getZone().getRules().isDaylightSavings(zdt200304060100.toInstant()))+"]");
		System.out.println("\n.atZoneSameInstant()");
		zdt200304060100 = odt200304060100.atZoneSameInstant(ZoneId.of("America/New_York"));
		System.out.println("[zdt200304060100="+(zdt200304060100)+"]"+"[zdt200304060100.getZone()="+(zdt200304060100.getZone())+"]"+"[zdt200304060100.getZone().getRules()="+(zdt200304060100.getZone().getRules())+"]"+"[zdt200304060100.getZone().getRules().isDaylightSavings(zdt200304060100.toInstant())="+(zdt200304060100.getZone().getRules().isDaylightSavings(zdt200304060100.toInstant()))+"]");
		zdt200304060100 = odt200304060100.atZoneSameInstant(ZoneId.of("America/Los_Angeles"));
		System.out.println("[zdt200304060100="+(zdt200304060100)+"]"+"[zdt200304060100.getZone()="+(zdt200304060100.getZone())+"]"+"[zdt200304060100.getZone().getRules()="+(zdt200304060100.getZone().getRules())+"]"+"[zdt200304060100.getZone().getRules().isDaylightSavings(zdt200304060100.toInstant())="+(zdt200304060100.getZone().getRules().isDaylightSavings(zdt200304060100.toInstant()))+"]");
		System.out.println("\n.atZoneSimilarLocal()");
		zdt200304060100 = odt200304060100.atZoneSimilarLocal(ZoneId.of("America/New_York"));
		System.out.println("[zdt200304060100="+(zdt200304060100)+"]"+"[zdt200304060100.getZone()="+(zdt200304060100.getZone())+"]"+"[zdt200304060100.getZone().getRules()="+(zdt200304060100.getZone().getRules())+"]"+"[zdt200304060100.getZone().getRules().isDaylightSavings(zdt200304060100.toInstant())="+(zdt200304060100.getZone().getRules().isDaylightSavings(zdt200304060100.toInstant()))+"]");
		zdt200304060100 = odt200304060100.atZoneSimilarLocal(ZoneId.of("America/Los_Angeles"));
		System.out.println("[zdt200304060100="+(zdt200304060100)+"]"+"[zdt200304060100.getZone()="+(zdt200304060100.getZone())+"]"+"[zdt200304060100.getZone().getRules()="+(zdt200304060100.getZone().getRules())+"]"+"[zdt200304060100.getZone().getRules().isDaylightSavings(zdt200304060100.toInstant())="+(zdt200304060100.getZone().getRules().isDaylightSavings(zdt200304060100.toInstant()))+"]");

		System.out.println();
		LocalDateTime ldt200304060200 = LocalDateTime.of(2003, Month.APRIL, 6, 2, 0);
		System.out.println("[ldt200304060200="+(ldt200304060200)+"]");
		ZonedDateTime zdt200304060200 = null;
		System.out.println("\n.toZonedDateTime()");
		OffsetDateTime odt200304060200 = OffsetDateTime.of(ldt200304060200, ZoneOffset.of("-05:00"));
		System.out.println("[odt200304060200="+(odt200304060200)+"]");
		zdt200304060200 = odt200304060200.toZonedDateTime();
		System.out.println("[zdt200304060200="+(zdt200304060200)+"]"+"[zdt200304060200.getZone()="+(zdt200304060200.getZone())+"]"+"[zdt200304060200.getZone().getRules()="+(zdt200304060200.getZone().getRules())+"]"+"[zdt200304060200.getZone().getRules().isDaylightSavings(zdt200304060200.toInstant())="+(zdt200304060200.getZone().getRules().isDaylightSavings(zdt200304060200.toInstant()))+"]");
		odt200304060200 = OffsetDateTime.of(ldt200304060200, ZoneOffset.of("-01:00"));
		System.out.println("[odt200304060200="+(odt200304060200)+"]");
		zdt200304060200 = odt200304060200.toZonedDateTime();
		System.out.println("[zdt200304060200="+(zdt200304060200)+"]"+"[zdt200304060200.getZone()="+(zdt200304060200.getZone())+"]"+"[zdt200304060200.getZone().getRules()="+(zdt200304060200.getZone().getRules())+"]"+"[zdt200304060200.getZone().getRules().isDaylightSavings(zdt200304060200.toInstant())="+(zdt200304060200.getZone().getRules().isDaylightSavings(zdt200304060200.toInstant()))+"]");
		System.out.println("\n.atZoneSameInstant()");
		zdt200304060200 = odt200304060200.atZoneSameInstant(ZoneId.of("America/New_York"));
		System.out.println("[zdt200304060200="+(zdt200304060200)+"]"+"[zdt200304060200.getZone()="+(zdt200304060200.getZone())+"]"+"[zdt200304060200.getZone().getRules()="+(zdt200304060200.getZone().getRules())+"]"+"[zdt200304060200.getZone().getRules().isDaylightSavings(zdt200304060200.toInstant())="+(zdt200304060200.getZone().getRules().isDaylightSavings(zdt200304060200.toInstant()))+"]");
		zdt200304060200 = odt200304060200.atZoneSameInstant(ZoneId.of("America/Los_Angeles"));
		System.out.println("[zdt200304060200="+(zdt200304060200)+"]"+"[zdt200304060200.getZone()="+(zdt200304060200.getZone())+"]"+"[zdt200304060200.getZone().getRules()="+(zdt200304060200.getZone().getRules())+"]"+"[zdt200304060200.getZone().getRules().isDaylightSavings(zdt200304060200.toInstant())="+(zdt200304060200.getZone().getRules().isDaylightSavings(zdt200304060200.toInstant()))+"]");
		System.out.println("\n.atZoneSimilarLocal()");
		zdt200304060200 = odt200304060200.atZoneSimilarLocal(ZoneId.of("America/New_York"));
		System.out.println("[zdt200304060200="+(zdt200304060200)+"]"+"[zdt200304060200.getZone()="+(zdt200304060200.getZone())+"]"+"[zdt200304060200.getZone().getRules()="+(zdt200304060200.getZone().getRules())+"]"+"[zdt200304060200.getZone().getRules().isDaylightSavings(zdt200304060200.toInstant())="+(zdt200304060200.getZone().getRules().isDaylightSavings(zdt200304060200.toInstant()))+"]");
		zdt200304060200 = odt200304060200.atZoneSimilarLocal(ZoneId.of("America/Los_Angeles"));
		System.out.println("[zdt200304060200="+(zdt200304060200)+"]"+"[zdt200304060200.getZone()="+(zdt200304060200.getZone())+"]"+"[zdt200304060200.getZone().getRules()="+(zdt200304060200.getZone().getRules())+"]"+"[zdt200304060200.getZone().getRules().isDaylightSavings(zdt200304060200.toInstant())="+(zdt200304060200.getZone().getRules().isDaylightSavings(zdt200304060200.toInstant()))+"]");

		System.out.println();
		LocalDateTime ldt200304060300 = LocalDateTime.of(2003, Month.APRIL, 6, 3, 0);
		System.out.println("[ldt200304060300="+(ldt200304060300)+"]");
		ZonedDateTime zdt200304060300 = null;
		System.out.println("\n.toZonedDateTime()");
		OffsetDateTime odt200304060300 = OffsetDateTime.of(ldt200304060300, ZoneOffset.of("-05:00"));
		System.out.println("[odt200304060300="+(odt200304060300)+"]");
		zdt200304060300 = odt200304060300.toZonedDateTime();
		System.out.println("[zdt200304060300="+(zdt200304060300)+"]"+"[zdt200304060300.getZone()="+(zdt200304060300.getZone())+"]"+"[zdt200304060300.getZone().getRules()="+(zdt200304060300.getZone().getRules())+"]"+"[zdt200304060300.getZone().getRules().isDaylightSavings(zdt200304060300.toInstant())="+(zdt200304060300.getZone().getRules().isDaylightSavings(zdt200304060300.toInstant()))+"]");
		odt200304060300 = OffsetDateTime.of(ldt200304060300, ZoneOffset.of("-01:00"));
		System.out.println("[odt200304060300="+(odt200304060300)+"]");
		zdt200304060300 = odt200304060300.toZonedDateTime();
		System.out.println("[zdt200304060300="+(zdt200304060300)+"]"+"[zdt200304060300.getZone()="+(zdt200304060300.getZone())+"]"+"[zdt200304060300.getZone().getRules()="+(zdt200304060300.getZone().getRules())+"]"+"[zdt200304060300.getZone().getRules().isDaylightSavings(zdt200304060300.toInstant())="+(zdt200304060300.getZone().getRules().isDaylightSavings(zdt200304060300.toInstant()))+"]");
		System.out.println("\n.atZoneSameInstant()");
		zdt200304060300 = odt200304060300.atZoneSameInstant(ZoneId.of("America/New_York"));
		System.out.println("[zdt200304060300="+(zdt200304060300)+"]"+"[zdt200304060300.getZone()="+(zdt200304060300.getZone())+"]"+"[zdt200304060300.getZone().getRules()="+(zdt200304060300.getZone().getRules())+"]"+"[zdt200304060300.getZone().getRules().isDaylightSavings(zdt200304060300.toInstant())="+(zdt200304060300.getZone().getRules().isDaylightSavings(zdt200304060300.toInstant()))+"]");
		zdt200304060300 = odt200304060300.atZoneSameInstant(ZoneId.of("America/Los_Angeles"));
		System.out.println("[zdt200304060300="+(zdt200304060300)+"]"+"[zdt200304060300.getZone()="+(zdt200304060300.getZone())+"]"+"[zdt200304060300.getZone().getRules()="+(zdt200304060300.getZone().getRules())+"]"+"[zdt200304060300.getZone().getRules().isDaylightSavings(zdt200304060300.toInstant())="+(zdt200304060300.getZone().getRules().isDaylightSavings(zdt200304060300.toInstant()))+"]");
		System.out.println("\n.atZoneSimilarLocal()");
		zdt200304060300 = odt200304060300.atZoneSimilarLocal(ZoneId.of("America/New_York"));
		System.out.println("[zdt200304060300="+(zdt200304060300)+"]"+"[zdt200304060300.getZone()="+(zdt200304060300.getZone())+"]"+"[zdt200304060300.getZone().getRules()="+(zdt200304060300.getZone().getRules())+"]"+"[zdt200304060300.getZone().getRules().isDaylightSavings(zdt200304060300.toInstant())="+(zdt200304060300.getZone().getRules().isDaylightSavings(zdt200304060300.toInstant()))+"]");
		zdt200304060300 = odt200304060300.atZoneSimilarLocal(ZoneId.of("America/Los_Angeles"));
		System.out.println("[zdt200304060300="+(zdt200304060300)+"]"+"[zdt200304060300.getZone()="+(zdt200304060300.getZone())+"]"+"[zdt200304060300.getZone().getRules()="+(zdt200304060300.getZone().getRules())+"]"+"[zdt200304060300.getZone().getRules().isDaylightSavings(zdt200304060300.toInstant())="+(zdt200304060300.getZone().getRules().isDaylightSavings(zdt200304060300.toInstant()))+"]");

		System.out.println();
		LocalDateTime ldt200604060600 = LocalDateTime.of(2006, Month.APRIL, 6, 6, 0);
		System.out.println("[ldt200604060600="+(ldt200604060600)+"]");
		ZonedDateTime zdt200604060600 = null;
		System.out.println("\n.toZonedDateTime()");
		OffsetDateTime odt200604060600 = OffsetDateTime.of(ldt200604060600, ZoneOffset.of("-05:00"));
		System.out.println("[odt200604060600="+(odt200604060600)+"]");
		zdt200604060600 = odt200604060600.toZonedDateTime();
		System.out.println("[zdt200604060600="+(zdt200604060600)+"]"+"[zdt200604060600.getZone()="+(zdt200604060600.getZone())+"]"+"[zdt200604060600.getZone().getRules()="+(zdt200604060600.getZone().getRules())+"]"+"[zdt200604060600.getZone().getRules().isDaylightSavings(zdt200604060600.toInstant())="+(zdt200604060600.getZone().getRules().isDaylightSavings(zdt200604060600.toInstant()))+"]");
		odt200604060600 = OffsetDateTime.of(ldt200604060600, ZoneOffset.of("-01:00"));
		System.out.println("[odt200604060600="+(odt200604060600)+"]");
		zdt200604060600 = odt200604060600.toZonedDateTime();
		System.out.println("[zdt200604060600="+(zdt200604060600)+"]"+"[zdt200604060600.getZone()="+(zdt200604060600.getZone())+"]"+"[zdt200604060600.getZone().getRules()="+(zdt200604060600.getZone().getRules())+"]"+"[zdt200604060600.getZone().getRules().isDaylightSavings(zdt200604060600.toInstant())="+(zdt200604060600.getZone().getRules().isDaylightSavings(zdt200604060600.toInstant()))+"]");
		System.out.println("\n.atZoneSameInstant()");
		zdt200604060600 = odt200604060600.atZoneSameInstant(ZoneId.of("America/New_York"));
		System.out.println("[zdt200604060600="+(zdt200604060600)+"]"+"[zdt200604060600.getZone()="+(zdt200604060600.getZone())+"]"+"[zdt200604060600.getZone().getRules()="+(zdt200604060600.getZone().getRules())+"]"+"[zdt200604060600.getZone().getRules().isDaylightSavings(zdt200604060600.toInstant())="+(zdt200604060600.getZone().getRules().isDaylightSavings(zdt200604060600.toInstant()))+"]");
		zdt200604060600 = odt200604060600.atZoneSameInstant(ZoneId.of("America/Los_Angeles"));
		System.out.println("[zdt200604060600="+(zdt200604060600)+"]"+"[zdt200604060600.getZone()="+(zdt200604060600.getZone())+"]"+"[zdt200604060600.getZone().getRules()="+(zdt200604060600.getZone().getRules())+"]"+"[zdt200604060600.getZone().getRules().isDaylightSavings(zdt200604060600.toInstant())="+(zdt200604060600.getZone().getRules().isDaylightSavings(zdt200604060600.toInstant()))+"]");
		System.out.println("\n.atZoneSimilarLocal()");
		zdt200604060600 = odt200604060600.atZoneSimilarLocal(ZoneId.of("America/New_York"));
		System.out.println("[zdt200604060600="+(zdt200604060600)+"]"+"[zdt200604060600.getZone()="+(zdt200604060600.getZone())+"]"+"[zdt200604060600.getZone().getRules()="+(zdt200604060600.getZone().getRules())+"]"+"[zdt200604060600.getZone().getRules().isDaylightSavings(zdt200604060600.toInstant())="+(zdt200604060600.getZone().getRules().isDaylightSavings(zdt200604060600.toInstant()))+"]");
		zdt200604060600 = odt200604060600.atZoneSimilarLocal(ZoneId.of("America/Los_Angeles"));
		System.out.println("[zdt200604060600="+(zdt200604060600)+"]"+"[zdt200604060600.getZone()="+(zdt200604060600.getZone())+"]"+"[zdt200604060600.getZone().getRules()="+(zdt200604060600.getZone().getRules())+"]"+"[zdt200604060600.getZone().getRules().isDaylightSavings(zdt200604060600.toInstant())="+(zdt200604060600.getZone().getRules().isDaylightSavings(zdt200604060600.toInstant()))+"]");

		System.out.println();
		LocalDateTime ldt200304070200 = LocalDateTime.of(2003, Month.APRIL, 7, 2, 0);
		System.out.println("[ldt200304070200="+(ldt200304070200)+"]");
		ZonedDateTime zdt200304070200 = null;
		System.out.println("\n.toZonedDateTime()");
		OffsetDateTime odt200304070200 = OffsetDateTime.of(ldt200304070200, ZoneOffset.of("-05:00"));
		System.out.println("[odt200304070200="+(odt200304070200)+"]");
		zdt200304070200 = odt200304070200.toZonedDateTime();
		System.out.println("[zdt200304070200="+(zdt200304070200)+"]"+"[zdt200304070200.getZone()="+(zdt200304070200.getZone())+"]"+"[zdt200304070200.getZone().getRules()="+(zdt200304070200.getZone().getRules())+"]"+"[zdt200304070200.getZone().getRules().isDaylightSavings(zdt200304070200.toInstant())="+(zdt200304070200.getZone().getRules().isDaylightSavings(zdt200304070200.toInstant()))+"]");
		odt200304070200 = OffsetDateTime.of(ldt200304070200, ZoneOffset.of("-01:00"));
		System.out.println("[odt200304070200="+(odt200304070200)+"]");
		zdt200304070200 = odt200304070200.toZonedDateTime();
		System.out.println("[zdt200304070200="+(zdt200304070200)+"]"+"[zdt200304070200.getZone()="+(zdt200304070200.getZone())+"]"+"[zdt200304070200.getZone().getRules()="+(zdt200304070200.getZone().getRules())+"]"+"[zdt200304070200.getZone().getRules().isDaylightSavings(zdt200304070200.toInstant())="+(zdt200304070200.getZone().getRules().isDaylightSavings(zdt200304070200.toInstant()))+"]");
		System.out.println("\n.atZoneSameInstant()");
		zdt200304070200 = odt200304070200.atZoneSameInstant(ZoneId.of("America/New_York"));
		System.out.println("[zdt200304070200="+(zdt200304070200)+"]"+"[zdt200304070200.getZone()="+(zdt200304070200.getZone())+"]"+"[zdt200304070200.getZone().getRules()="+(zdt200304070200.getZone().getRules())+"]"+"[zdt200304070200.getZone().getRules().isDaylightSavings(zdt200304070200.toInstant())="+(zdt200304070200.getZone().getRules().isDaylightSavings(zdt200304070200.toInstant()))+"]");
		zdt200304070200 = odt200304070200.atZoneSameInstant(ZoneId.of("America/Los_Angeles"));
		System.out.println("[zdt200304070200="+(zdt200304070200)+"]"+"[zdt200304070200.getZone()="+(zdt200304070200.getZone())+"]"+"[zdt200304070200.getZone().getRules()="+(zdt200304070200.getZone().getRules())+"]"+"[zdt200304070200.getZone().getRules().isDaylightSavings(zdt200304070200.toInstant())="+(zdt200304070200.getZone().getRules().isDaylightSavings(zdt200304070200.toInstant()))+"]");
		System.out.println("\n.atZoneSimilarLocal()");
		zdt200304070200 = odt200304070200.atZoneSimilarLocal(ZoneId.of("America/New_York"));
		System.out.println("[zdt200304070200="+(zdt200304070200)+"]"+"[zdt200304070200.getZone()="+(zdt200304070200.getZone())+"]"+"[zdt200304070200.getZone().getRules()="+(zdt200304070200.getZone().getRules())+"]"+"[zdt200304070200.getZone().getRules().isDaylightSavings(zdt200304070200.toInstant())="+(zdt200304070200.getZone().getRules().isDaylightSavings(zdt200304070200.toInstant()))+"]");
		zdt200304070200 = odt200304070200.atZoneSimilarLocal(ZoneId.of("America/Los_Angeles"));
		System.out.println("[zdt200304070200="+(zdt200304070200)+"]"+"[zdt200304070200.getZone()="+(zdt200304070200.getZone())+"]"+"[zdt200304070200.getZone().getRules()="+(zdt200304070200.getZone().getRules())+"]"+"[zdt200304070200.getZone().getRules().isDaylightSavings(zdt200304070200.toInstant())="+(zdt200304070200.getZone().getRules().isDaylightSavings(zdt200304070200.toInstant()))+"]");

	}

}
