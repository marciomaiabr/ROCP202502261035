package pkgs.pkgExes;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
		//readings.stream().map(r -> r.value).filter(v -> v >= 406 && v <= 407).average();//compile error//The method average() is undefined for the type Stream<Double>
		//System.out.println(readings.stream().mapToDouble(r -> r.value).filter(v -> v >= 1000).average().getAsDouble());//java.util.NoSuchElementException: No value present
		OptionalDouble avg = readings.stream().peek(v -> System.out.println(v)).mapToDouble(r -> r.value).filter(v -> v >= 406 && v <= 407).average();
		System.out.println("[="+(avg)+"]");
		System.out.println("[="+(avg.getAsDouble())+"]");
		System.out.println("[="+(avg.isPresent())+"]");
	}

}

/*

*/
