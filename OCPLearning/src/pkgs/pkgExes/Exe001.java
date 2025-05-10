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
		Map<KeyPessoa, Pessoa> m = new HashMap<>();

		KeyPessoa keyPessoa1A = new KeyPessoa(1l);
		KeyPessoa keyPessoa2B = new KeyPessoa(2l);
		KeyPessoa keyPessoa1C = new KeyPessoa(1l);
		KeyPessoa keyPessoa2D = new KeyPessoa(2l);
		KeyPessoa keyPessoa6F = new KeyPessoa(6l);
		KeyPessoa keyPessoa5E = new KeyPessoa(5l);

		Pessoa pessoa1A = new Pessoa(new Key(true), "Pessoa1A");
		Pessoa pessoa2B = new Pessoa(new Key(true), "Pessoa2B");
		Pessoa pessoa1C = new Pessoa(new Key(true), "Pessoa1C");
		Pessoa pessoa2D = new Pessoa(new Key(true), "Pessoa2D");
		Pessoa pessoa6F = new Pessoa(new Key(true), "Pessoa6F");
		Pessoa pessoa5E = new Pessoa(new Key(true), "Pessoa5E");

		System.out.println("\n\nm.puts");
		System.out.println("\nm.put(keyPessoa1A, pessoa1A)");
		System.out.println(m.put(keyPessoa1A, pessoa1A));
		System.out.println("\nm.put(keyPessoa2B, pessoa2B)");
		System.out.println(m.put(keyPessoa2B, pessoa2B));
		System.out.println("\nm.put(keyPessoa1C, pessoa1C)");
		System.out.println(m.put(keyPessoa1C, pessoa1C));
		System.out.println("\nm.put(keyPessoa2D, pessoa2D)");
		System.out.println(m.put(keyPessoa2D, pessoa2D));
		System.out.println("\nm.put(keyPessoa6F, pessoa6F)");
		System.out.println(m.put(keyPessoa6F, pessoa6F));
		System.out.println("\nm.put(keyPessoa5E, pessoa5E)");
		System.out.println(m.put(keyPessoa5E, pessoa5E));

		System.out.println();
		System.out.println("\nm.forEach"+"\n");
		m.forEach((k,v) -> System.out.println("[k="+(k)+"]"+"[v="+(v)+"]"));

		System.out.println("\n\nm.gets");
		System.out.println("\nm.get(keyPessoa5E)");
		System.out.println(m.get(keyPessoa5E));
	}
}

/*
ele ordena pelo generic k(de key)
*/
