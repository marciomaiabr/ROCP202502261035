package pkgs.pkgExes;

import java.time.LocalDateTime;
import java.util.*;

import pkgs.pkg0.*;

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

		Pessoa pessoa1A = new Pessoa(new Id(1l), "Pessoa1A");
		Pessoa pessoa2B = new Pessoa(new Id(2l), "Pessoa2B");
		Pessoa pessoa1C = new Pessoa(new Id(1l), "Pessoa1C");
		Pessoa pessoa4D = new Pessoa(new Id(4l), "Pessoa4D");
		Pessoa pessoa6F = new Pessoa(new Id(6l), "Pessoa6F");
		Pessoa pessoa5E = new Pessoa(new Id(5l), "Pessoa5E");
		Pessoa pessoa7G = new Pessoa(new Id(7l), "Pessoa7G");

		Set<Pessoa> s = new HashSet<>();

		System.out.println("\n\nm.puts");

		System.out.println("\ns.add(pessoa1A)");
		System.out.println(s.add(pessoa1A));
		System.out.println("\ns.add(pessoa2B)");
		System.out.println(s.add(pessoa2B));
		System.out.println("\ns.add(pessoa1C)");
		System.out.println(s.add(pessoa1C));
		System.out.println("\ns.add(pessoa4D)");
		System.out.println(s.add(pessoa4D));
		System.out.println("\ns.add(pessoa6F)");
		System.out.println(s.add(pessoa6F));
		System.out.println("\ns.add(pessoa5E)");
		System.out.println(s.add(pessoa5E));
		System.out.println("\ns.add(pessoa7G)");
		System.out.println(s.add(pessoa7G));

		System.out.println();
		System.out.println("\ns.forEach"+"\n");
		s.forEach(v -> System.out.println("[v="+(v)+"]"));

		System.out.println("\n\ns.contains");
		System.out.println("\ns.contains(pessoa5E)");
		System.out.println(s.contains(pessoa5E));
	}
}

/*

*/
