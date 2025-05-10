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
		KeyPessoa keyPessoa3C = new KeyPessoa(3l);
		KeyPessoa keyPessoa4D = new KeyPessoa(4l);
		KeyPessoa keyPessoa5E = new KeyPessoa(5l);
		KeyPessoa keyPessoa6F = new KeyPessoa(6l);

		Pessoa pessoa1A = new Pessoa(new Key(true), "Pessoa1A");
		Pessoa pessoa2B = new Pessoa(new Key(true), "Pessoa2B");
		Pessoa pessoa3C = new Pessoa(new Key(true), "Pessoa3C");
		Pessoa pessoa4D = new Pessoa(new Key(true), "Pessoa4D");
		Pessoa pessoa5E = new Pessoa(new Key(true), "Pessoa5E");
		Pessoa pessoa6F = new Pessoa(new Key(true), "Pessoa6F");

		System.out.println("\n\nm.puts");
		System.out.println("\nm.put(keyPessoa1A, pessoa1A)");
		m.put(keyPessoa1A, pessoa1A);
		System.out.println("\nm.put(keyPessoa2B, pessoa2B)");
		m.put(keyPessoa2B, pessoa2B);
		System.out.println("\nm.put(keyPessoa3C, pessoa3C)");
		m.put(keyPessoa3C, pessoa3C);
		System.out.println("\nm.put(keyPessoa4D, pessoa4D)");
		m.put(keyPessoa4D, pessoa4D);
		System.out.println("\nm.put(keyPessoa5E, pessoa5E)");
		m.put(keyPessoa5E, pessoa5E);
		System.out.println("\nm.put(keyPessoa6F, pessoa6F)");
		m.put(keyPessoa6F, pessoa6F);

		System.out.println();
		System.out.println("\nm.forEach"+"\n");
		m.forEach((k,v) -> System.out.println("[k="+(k)+"]"+"[v="+(v)+"]"));

		System.out.println("\n\nm.gets");
		System.out.println("\nm.get(new KeyPessoa(4l))");
		System.out.println(m.get(new KeyPessoa(4l)));
	}
}

/*

*/
