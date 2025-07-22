package pkgs.pkgExes;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Person {
	public String name;
	public Integer age;
	public String state;
	public String city;
	public Person(String name, Integer age, String state, String city) {
		this.name = name;
		this.age = age;
		this.state = state;
		this.city = city;
	}
	public String getName() {
		return this.name;
	}
	public Integer getAge() {
		return this.age;
	}
	public String getState() {
		return state;
	}
	public String getCity() {
		return city;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", state=" + state + ", city=" + city + "]";
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

		Person [] arr = {new Person("Bert", 32, "MT", "CBA"),new Person("Wendi", 34, "MT", "CBA"),new Person("Bill", 34, "MT", "SINOP"),new Person("Kathy", 35, "MT", "VG"),new Person("Robert", 38, "MT", "VG"),new Person("Beth", 30, "MG", "OUP"),new Person("Liz", 30, "MG", "OUP"),new Person("Eric", 31, "MG", "BELO"),new Person("Deb", 31, "MG", "BELO")};
		Map<Integer, List<Person>> map = Stream.of(arr).collect(Collectors.groupingBy(Person::getAge));
		System.out.println(map);
		System.out.println(Stream.of(arr).collect(Collectors.groupingBy(Person::getAge)));
		System.out.println(Stream.of(arr).collect(Collectors.groupingBy(Person::getState, Collectors.counting())));
		System.out.println(Stream.of(arr).collect(Collectors.groupingBy(Person::getState, Collectors.groupingBy(Person::getCity, Collectors.counting()))));
		System.out.println(Stream.of(arr).collect(Collectors.groupingBy(Person::getState, Collectors.groupingBy(Person::getCity, Collectors.toList()))));
		System.out.println(Stream.of(arr).collect(Collectors.groupingBy(Person::getState, Collectors.groupingBy(Person::getCity, Collectors.mapping(Person::getName, Collectors.toList())))));
		System.out.println(Stream.of(arr).collect(Collectors.partitioningBy(p->p.getCity().equals("CBA"))));

	}

}

/*

*/
