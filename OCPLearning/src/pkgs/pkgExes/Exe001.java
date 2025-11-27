package pkgs.pkgExes;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Exe001 {

	public static void main(String[] args) {

		//System.out.println();
		//ZoneId.getAvailableZoneIds().forEach(System.out::println);

		System.out.println();

		LocalDateTime ld = LocalDateTime.of(2025, 12, 31, 14, 59, 59, 999);
		System.out.println("[ld="+(ld)+"]");

		System.out.println();
		ZonedDateTime zonedDateTime_Greenwich = ZonedDateTime.of(ld, ZoneId.of("Greenwich"));
		System.out.println("[zonedDateTime_Greenwich="+(zonedDateTime_Greenwich)+"]");
		System.out.println("[zonedDateTime_Greenwich.toInstant()="+(zonedDateTime_Greenwich.toInstant())+"]");

		System.out.println();

		ZonedDateTime zonedDateTime_USAlaska = ZonedDateTime.of(ld, ZoneId.of("US/Alaska"));
		System.out.println("[zonedDateTime_USAlaska="+(zonedDateTime_USAlaska)+"]");
		System.out.println("[zonedDateTime_USAlaska.toInstant()="+(zonedDateTime_USAlaska.toInstant())+"]");

		System.out.println();

		ZonedDateTime zonedDateTime_Japan = ZonedDateTime.of(ld, ZoneId.of("Japan"));
		System.out.println("[zonedDateTime_Japan="+(zonedDateTime_Japan)+"]");
		System.out.println("[zonedDateTime_Japan.toInstant()="+(zonedDateTime_Japan.toInstant())+"]");

	}

}
