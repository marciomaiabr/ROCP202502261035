package pkgs.pkgExes;

import java.time.*;

public class Exe001 {



	public static void main(String[] args) {

		LocalDate ld20241231_A = LocalDate.of(2024, 12, 31);
		LocalDate ld20241231_B = LocalDate.of(2024, 12, 31);
		LocalDate ld20251231_A = LocalDate.of(2025, 12, 31);
		LocalDate ld20251231_B = LocalDate.of(2025, 12, 31);
		LocalDate ld20261231_A = LocalDate.of(2026, 12, 31);
		LocalDate ld20261231_B = LocalDate.of(2026, 12, 31);

		LocalTime lt1231 = LocalTime.of(12, 31);

		LocalDateTime ldt20241231_A = LocalDateTime.of(2024, 12, 31, 23, 59);
		LocalDateTime ldt20241231_B = LocalDateTime.of(2024, 12, 31, 23, 59);
		LocalDateTime ldt20251231_A = LocalDateTime.of(2025, 12, 31, 23, 59);
		LocalDateTime ldt20251231_B = LocalDateTime.of(2025, 12, 31, 23, 59);
		LocalDateTime ldt20261231_A = LocalDateTime.of(2026, 12, 31, 23, 59);
		LocalDateTime ldt20261231_B = LocalDateTime.of(2026, 12, 31, 23, 59);

		ZonedDateTime zdt20241231_A1 = ZonedDateTime.of(2024, 12, 31, 12, 0, 0, 0, ZoneId.of("America/New_York"));
		ZonedDateTime zdt20241231_A2 = ZonedDateTime.of(2024, 12, 31, 12, 0, 0, 0, ZoneId.of("America/Los_Angeles"));
		ZonedDateTime zdt20241231_A3 = ZonedDateTime.of(2024, 12, 31, 12, 0, 0, 0, ZoneId.of("GMT0"));
		ZonedDateTime zdt20241231_A12 = zdt20241231_A1.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));

		System.out.println();
		System.out.println("[zdt20241231_A1="+(zdt20241231_A1)+"]");
		System.out.println("[zdt20241231_A2="+(zdt20241231_A2)+"]");
		System.out.println("[zdt20241231_A3="+(zdt20241231_A3)+"]");
		System.out.println("[zdt20241231_A12="+(zdt20241231_A12)+"]");
		System.out.println("[zdt20241231_A1.equals(zdt20241231_A2)="+(zdt20241231_A1.equals(zdt20241231_A2))+"]");
		System.out.println("[zdt20241231_A1.isEqual(zdt20241231_A2)="+(zdt20241231_A1.isEqual(zdt20241231_A2))+"]");
		System.out.println("[zdt20241231_A1.equals(zdt20241231_A3)="+(zdt20241231_A1.equals(zdt20241231_A3))+"]");
		System.out.println("[zdt20241231_A1.isEqual(zdt20241231_A3)="+(zdt20241231_A1.isEqual(zdt20241231_A3))+"]");
		System.out.println("[zdt20241231_A1.equals(zdt20241231_A12)="+(zdt20241231_A1.equals(zdt20241231_A12))+"]");
		System.out.println("[zdt20241231_A1.isEqual(zdt20241231_A12)="+(zdt20241231_A1.isEqual(zdt20241231_A12))+"]");
		System.out.println("[zdt20241231_A1.isEqual(zdt20241231_A12)="+(zdt20241231_A1.toEpochSecond())+"]");
		System.out.println("[zdt20241231_A1.isEqual(zdt20241231_A12)="+(zdt20241231_A1.toLocalTime().getNano())+"]");

		System.out.println();
		System.out.println("[ld20251231_A.isBefore(ld20251231_B)="+(ld20251231_A.isBefore(ld20251231_B))+"]");
		System.out.println("[ld20251231_A==ld20251231_A="+(ld20251231_A==ld20251231_A)+"]");
		System.out.println("[ld20251231_A==ld20251231_B="+(ld20251231_A==ld20251231_B)+"]");
		System.out.println("[ld20251231_A.equals(ld20251231_B)="+(ld20251231_A.equals(ld20251231_B))+"]");
		System.out.println("[ld20251231_A.isEqual(ld20251231_B)="+(ld20251231_A.isEqual(ld20251231_B))+"]");
		System.out.println("[ld20251231_A.compareTo(ld20251231_B)="+(ld20251231_A.compareTo(ld20251231_B))+"]");
		System.out.println("[ld20251231_A.isAfter(ld20251231_B)="+(ld20251231_A.isAfter(ld20251231_B))+"]");

		System.out.println();
		System.out.println("[ld20241231_A.toEpochDay()="+(ld20241231_A.toEpochDay())+"]");
		System.out.println("[ld20241231_A.isBefore(ld20261231_B)="+(ld20241231_A.isBefore(ld20261231_B))+"]");
		System.out.println("[ld20241231_A==ld20241231_A="+(ld20241231_A==ld20241231_A)+"]");
		System.out.println("[ld20241231_A==ld20261231_B="+(ld20241231_A==ld20261231_B)+"]");
		System.out.println("[ld20241231_A.equals(ld20261231_B)="+(ld20241231_A.equals(ld20261231_B))+"]");
		System.out.println("[ld20241231_A.isEqual(ld20261231_B)="+(ld20241231_A.isEqual(ld20261231_B))+"]");
		System.out.println("[ld20241231_A.compareTo(ld20261231_B)="+(ld20241231_A.compareTo(ld20261231_B))+"]");
		System.out.println("[ld20241231_A.isAfter(ld20261231_B)="+(ld20241231_A.isAfter(ld20261231_B))+"]");

		System.out.println();
		System.out.println("[lt1231.toSecondOfDay()="+(lt1231.toSecondOfDay())+"]");

		System.out.println();
		System.out.println("[ldt20251231_A.isBefore(ldt20251231_B)="+(ldt20251231_A.isBefore(ldt20251231_B))+"]");
		System.out.println("[ldt20251231_A==ldt20251231_A="+(ldt20251231_A==ldt20251231_A)+"]");
		System.out.println("[ldt20251231_A==ldt20251231_B="+(ldt20251231_A==ldt20251231_B)+"]");
		System.out.println("[ldt20251231_A.equals(ldt20251231_B)="+(ldt20251231_A.equals(ldt20251231_B))+"]");
		System.out.println("[ldt20251231_A.isEqual(ldt20251231_B)="+(ldt20251231_A.isEqual(ldt20251231_B))+"]");
		System.out.println("[ldt20251231_A.compareTo(ldt20251231_B)="+(ldt20251231_A.compareTo(ldt20251231_B))+"]");
		System.out.println("[ldt20251231_A.isAfter(ldt20251231_B)="+(ldt20251231_A.isAfter(ldt20251231_B))+"]");

		System.out.println();
		System.out.println("[ldt20241231_A.toEpochSecond(ZoneOffset.ofHours(0))="+(ldt20241231_A.toEpochSecond(ZoneOffset.ofHours(0)))+"]");
		System.out.println("[ldt20241231_A.isBefore(ldt20261231_B)="+(ldt20241231_A.isBefore(ldt20261231_B))+"]");
		System.out.println("[ldt20241231_A==ldt20241231_A="+(ldt20241231_A==ldt20241231_A)+"]");
		System.out.println("[ldt20241231_A==ldt20261231_B="+(ldt20241231_A==ldt20261231_B)+"]");
		System.out.println("[ldt20241231_A.equals(ldt20261231_B)="+(ldt20241231_A.equals(ldt20261231_B))+"]");
		System.out.println("[ldt20241231_A.isEqual(ldt20261231_B)="+(ldt20241231_A.isEqual(ldt20261231_B))+"]");
		System.out.println("[ldt20241231_A.compareTo(ldt20261231_B)="+(ldt20241231_A.compareTo(ldt20261231_B))+"]");
		System.out.println("[ldt20241231_A.isAfter(ldt20261231_B)="+(ldt20241231_A.isAfter(ldt20261231_B))+"]");

	}

}
