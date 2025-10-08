package pkgs.pkgExes;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Exe001 {

	public static void main(String[] args) {
		//A
		/*ZonedDateTime totalityUTC = ZonedDateTime.of(LocalDateTime.of(2019, 7, 2, 16, 55));
		ZonedDateTime totalitySanJuan = totalityUTC.withZoneSameInstant(ZoneId.of("America/Argentina/San_Juan"));
		System.out.println(totalitySanJuan);*/
		//B
		/*ZonedDateTime totalityUTC = ZonedDateTime.of (LocalDateTime.of(2019, 7, 2, 4, 55, "PM") , ZoneId.of("Z"));
		ZonedDateTime totalitySanJuan = totalityUTC.withZoneSameInstant(ZoneId.of ("America/Argentina/San_Juan"));
		System.out.println(totalitySanJuan);*/
		//C
		{
			ZonedDateTime totalityUTC = ZonedDateTime.of(LocalDateTime.of (2019, 7, 2, 16, 55), ZoneId.of("Z"));
			ZonedDateTime totalitySanJuan = totalityUTC.withZoneSameInstant (ZoneId.of("America/Argentina/San_Juan")) ;
			System.out.println(totalitySanJuan);
		}
		//D
		{
			ZonedDateTime totalityUTC = ZonedDateTime.of(LocalDateTime.of(2019, 7, 2, 16, 55), ZoneId.of("America/Argentina/San_Juan"));
			ZonedDateTime totalitySanJuan = totalityUTC.withZoneSameInstant(ZoneId.of("America/Argentina/San_Juan"));
			System.out.println(totalitySanJuan);
		}

	}

}
