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
		Map<Chave, Pessoa> m = new HashMap<>();

		Chave chave1A = new Chave(1l);
		Chave chave2B = new Chave(2l);
		Chave chave1C = new Chave(1l);
		Chave chave2D = new Chave(2l);
		Chave chave6F = new Chave(6l);
		Chave chave5E = new Chave(5l);
		Chave chave7G = new Chave(7l);

		Pessoa pessoa1A = new Pessoa(new Id(true), "Pessoa1A");
		Pessoa pessoa2B = new Pessoa(new Id(true), "Pessoa2B");
		Pessoa pessoa1C = new Pessoa(new Id(true), "Pessoa1C");
		Pessoa pessoa2D = new Pessoa(new Id(true), "Pessoa2D");
		Pessoa pessoa6F = new Pessoa(new Id(true), "Pessoa6F");
		Pessoa pessoa5E = new Pessoa(new Id(true), "Pessoa5E");
		Pessoa pessoa7G = new Pessoa(new Id(true), "Pessoa7G");

		System.out.println("\n\nm.puts");
		System.out.println("\nm.put(chave1A, pessoa1A)");
		System.out.println(m.put(chave1A, pessoa1A));
		System.out.println("\nm.put(chave2B, pessoa2B)");
		System.out.println(m.put(chave2B, pessoa2B));
		System.out.println("\nm.put(chave1C, pessoa1C)");
		System.out.println(m.put(chave1C, pessoa1C));
		System.out.println("\nm.put(chave2D, pessoa2D)");
		System.out.println(m.put(chave2D, pessoa2D));
		System.out.println("\nm.put(chave6F, pessoa6F)");
		System.out.println(m.put(chave6F, pessoa6F));
		System.out.println("\nm.put(chave5E, pessoa5E)");
		System.out.println(m.put(chave5E, pessoa5E));
		System.out.println("\nm.put(chave7G, pessoa7G)");
		System.out.println(m.put(chave7G, pessoa7G));

		System.out.println();
		System.out.println("\nm.forEach"+"\n");
		m.forEach((k,v) -> System.out.println("[k="+(k)+"]"+"[v="+(v)+"]"));

		System.out.println("\n\nm.gets");
		System.out.println("\nm.get(chave5E)");
		System.out.println(m.get(chave5E));
	}
}

/*

*/
