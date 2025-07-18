package pkgs.pkgExes;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
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
	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return this.name;
	}
	public Integer getAge() {
		return this.age;
	}
	public String toString() {
		return this.name + " is " + this.age + " years old";
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

		Person beth = new Person("Beth", 30);
		Person eric = new Person("Eric", 31);
		Person deb = new Person("Deb", 31);

		Person liz = new Person("Liz", 30);
		Person wendi = new Person("Wendi", 34);
		Person kathy = new Person("Kathy", 35);
		Person bert = new Person("Bert", 32);
		Person bill = new Person("Bill", 34);
		Person robert = new Person("Robert", 38);

		List<Person> people = new ArrayList<Person>();
		people.add(beth); people.add(eric); people.add(deb);
		people.add(liz); people.add(wendi); people.add(kathy);
		people.add(bert); people.add(bill); people.add(robert);

		List<Person> peopleAge34 = people.stream().filter(v -> v.getAge().equals(34)).collect(Collectors.toCollection(ArrayList::new));
		System.out.println("People aged 34:" + peopleAge34);

	}

}

/*

*/
