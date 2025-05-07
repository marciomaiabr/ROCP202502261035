package pkgs.pkgExes;

import java.time.LocalDateTime;
import java.util.*;

import pkgs.pkg0.Pessoa;

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
		Collection<Pessoa> collection = new HashSet<>();
		Pessoa.criaPessoas(collection);
		System.out.println();
		System.out.println("collection.forEach(System.out::println)");
		collection.forEach(System.out::println);
		System.out.println();
		System.out.println("\ncollection.contains(new Pessoa(9, \"Pessoa9C\"))");
		System.out.println(collection.contains(new Pessoa(9, "Pessoa9C")));
		System.out.println("\ncollection.contains(new Pessoa(5, \"Pessoa5E\"))");
		System.out.println(collection.contains(new Pessoa(5, "Pessoa5E")));
		System.out.println("\ncollection.contains(new Pessoa(1, \"Pessoa1G\"))");
		System.out.println(collection.contains(new Pessoa(1, "Pessoa1G")));
	}

}

/*
Primeiro ordena pelo hashCode
Segundo, como tem hashCode repetido, dentre os hashCode ordena pela ordem de foi adicionado na implementação da Collection no HashSet
*/
