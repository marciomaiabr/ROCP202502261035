package pkgs.pkgExes;

import java.time.LocalDateTime;
import java.util.*;

class Dog {
	public Dog(String n) { name = n; }
	public String name;
	@Override
	public boolean equals(Object o) { System.out.println("Dog.equals()"); return ( (o != null) && (o instanceof Dog) && (((Dog) o).name == name) ); }
	@Override
	public int hashCode() { System.out.println("Dog.hashCode()"); int hashCode = name.length(); System.out.println("[hashCode="+(hashCode)+"]"); return hashCode; }
}

class Cat {}

enum Pets {DOG, CAT, HORSE}

public class Exe001 {

	static {
		System.out.println(LocalDateTime.now());
	}

	public static void main(String[] args) {
		System.out.println("<>");
		m1(args);
		System.out.println("</>");
	}

	public static void m1(String[] args) {
		System.out.println("Exe001.m1()");
		Map<Object, Object> m = new HashMap<>();
		System.out.println("m.put(\"k1\", new Dog(\"aiko\"))");
		System.out.println(m.put("k1", new Dog("aiko")));
		System.out.println("m.put(\"k2\", Pets.DOG)");
		System.out.println(m.put("k2", Pets.DOG));
		System.out.println("m.put(Pets.CAT, \"CAT key\")");
		System.out.println(m.put(Pets.CAT, "CAT key"));
		Dog d1 = new Dog("clover");
		System.out.println("m.put(d1, \"Dog key\")");
		System.out.println(m.put(d1, "Dog key"));
		System.out.println("m.put(new Cat(), \"Cat key\")");
		System.out.println(m.put(new Cat(), "Cat key"));

		System.out.println();

		System.out.println(m.get("k1"));
		String k2 = "k2";
		System.out.println(m.get(k2));
		Pets p = Pets.CAT;
		System.out.println(m.get(p));
		System.out.println(m.get(d1));
		System.out.println(m.get(new Cat()));
		System.out.println(m.size());
	}

}

/*

*/
