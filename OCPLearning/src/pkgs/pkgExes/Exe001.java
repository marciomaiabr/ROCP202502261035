package pkgs.pkgExes;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Reading {
	int year;
	int month;
	int day;
	double value;
	public Reading() {
		super();
	}
	public Reading(int year, int month, int day, double value) {
		super();this.year = year;this.month = month;this.day = day;this.value = value;
	}
	@Override
	public String toString() {
		return "Reading [year=" + year + ", month=" + month + ", day=" + day + ", value=" + value + "]";
	}
}

public class Exe001 {

	static {
		System.out.println(LocalDateTime.now());
	}

	public static void main(String[] args) {

		try {
			System.out.println("<>");
			sm1(args);
			new Exe001().im1(args);
			System.out.println("</>");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			Runtime.getRuntime().exec("cmd.exe /c C:\\Users\\Administrador\\git\\ROCP202502261035\\OCPLearning\\logs\\logMM.txt");
		} catch (Exception e) {}

	}

	public static void sm1(String[] args) {
		System.out.println("Exe001.sm1()");
	}

	public void im1(String[] args) {
		System.out.println("Exe001.im1()");
		List<Reading> readings = Arrays.asList (
				new Reading(2017, 1, 1, 405.91),
				new Reading(2017, 1, 8, 405.98),
				new Reading(2017, 1, 15, 406.14),
				new Reading(2017, 1, 22, 406.48),
				new Reading(2017, 1, 29, 406.20),
				new Reading(2017, 2, 5, 407.12),
				new Reading(2017, 2, 12, 406.03)
		);
		Optional<Reading> optional1 = Optional.of(new Reading(2025, 7, 10, 7.39));
		optional1.ifPresent(optional1V -> System.out.println("[optional1V="+(optional1V)+"]"));
		//Optional<Reading> optional2 = Optional.of(null);//NullPointerException
		//optional2.ifPresent(optional2V -> System.out.println("[optional2V="+(optional2V)+"]"));
		Optional<Reading> optional3 = Optional.ofNullable(null);
		optional3.ifPresent(optional3V -> System.out.println("[optional3V="+(optional3V)+"]"));
	}

}

/*

*/
