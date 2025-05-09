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
		System.out.println("\nm.put(\"k1\", new Dog(\"aiko\"))");
		System.out.println(m.put("k1", new Dog("aiko")));
		System.out.println("\nm.put(\"k2\", Pets.DOG)");
		System.out.println(m.put("k2", Pets.DOG));
		System.out.println("\nm.put(Pets.CAT, \"CAT key\")");
		System.out.println(m.put(Pets.CAT, "CAT key"));
		Dog d1 = new Dog("clover1");
		System.out.println("\nm.put(d1, \"Dog key1\")");
		System.out.println(m.put(d1, "Dog key1"));
		Dog d2 = new Dog("clover2");
		System.out.println("\nm.put(d2, \"Dog key2\")");
		System.out.println(m.put(d2, "Dog key2"));
		Dog d3 = new Dog("clover1");
		System.out.println("\nm.put(d3, \"Dog key3\")");
		System.out.println(m.put(d1, "Dog key3"));
		System.out.println("\nm.put(new Cat(), \"Cat key\")");
		System.out.println(m.put(new Cat(), "Cat key"));

		System.out.println("\n\nm.forEach");
		m.forEach((k,v) -> System.out.println("\n"+"[k="+(k)+"]"+"[v="+(v)+"]"));

		System.out.println("\n\nm.gets");
		System.out.println("\nm.get(\"k1\")");
		System.out.println(m.get("k1"));
		String k2 = "k2";
		System.out.println("\nm.get(k2)");
		System.out.println(m.get(k2));
		Pets p = Pets.CAT;
		System.out.println("\nm.get(p)");
		System.out.println(m.get(p));
		System.out.println("\nm.get(d1)");
		System.out.println(m.get(d1));
		System.out.println("\nm.get(d2)");
		System.out.println(m.get(d2));
		System.out.println("\nm.get(new Cat())");
		System.out.println(m.get(new Cat()));
		System.out.println("\nm.size()");
		System.out.println(m.size());
	}

}

/*

*/
