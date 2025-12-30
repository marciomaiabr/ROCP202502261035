package pkgs.pkgExes;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Exe001 {



	public static void main(String[] args) {

		LocalDate montyPythonDay = LocalDate.of(2017, Month.MAY, 10);
		LocalDate aprilFools = LocalDate.of(2018, Month.APRIL, 1);
		Duration duration = Duration.ofDays(1);
		Period period = Period.ofDays(1);
		//LocalDate result = montyPythonDay.minus(duration);//UnsupportedTemporalTypeException: Unsupported unit: Seconds
		LocalDate result = montyPythonDay.minus(period);
		System.out.println(result + " " + aprilFools.isBefore(result));

	}

}
