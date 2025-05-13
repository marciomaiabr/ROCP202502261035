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

		Pessoa pessoa1A15 = new Pessoa(new Id(1l), "Pessoa1A15", 15);
		Pessoa pessoa2B18 = new Pessoa(new Id(2l), "Pessoa2B18", 18);
		Pessoa pessoa3C18 = new Pessoa(new Id(3l), "Pessoa3C18", 18);
		Pessoa pessoa4D18 = new Pessoa(new Id(4l), "Pessoa4D18", 18);
		Pessoa pessoa5E47 = new Pessoa(new Id(5l), "Pessoa5E47", 47);
		Pessoa pessoa6F16 = new Pessoa(new Id(6l), "Pessoa6F16", 16);
		Pessoa pessoa7G14 = new Pessoa(new Id(7l), "Pessoa7G14", 14);

		ArrayDeque<Pessoa> q = null;

		System.out.println("\n\nq.offer");
		q = new ArrayDeque<>();

		System.out.println("\nq.offer(pessoa1A15)");
		System.out.println(q.offer(pessoa1A15));
		System.out.println("\nq.offer(pessoa2B18)");
		System.out.println(q.offer(pessoa2B18));
		System.out.println("\nq.offer(pessoa3C18)");
		System.out.println(q.offer(pessoa3C18));
		System.out.println("\nq.offer(pessoa4D18)");
		System.out.println(q.offer(pessoa4D18));
		System.out.println("\nq.offer(pessoa5E47)");
		System.out.println(q.offer(pessoa5E47));
		System.out.println("\nq.offer(pessoa6F16)");
		System.out.println(q.offer(pessoa6F16));
		System.out.println("\nq.offer(pessoa7G14)");
		System.out.println(q.offer(pessoa7G14));

		System.out.println("\n[q="+(q)+"]");
		System.out.println("\n[q.peek()="+(q.peek())+"]");

		System.out.println("\n\nq.offerFirst");
		q = new ArrayDeque<>();

		System.out.println("\nq.offerFirst(pessoa1A15)");
		System.out.println(q.offerFirst(pessoa1A15));
		System.out.println("\nq.offerFirst(pessoa2B18)");
		System.out.println(q.offerFirst(pessoa2B18));
		System.out.println("\nq.offerFirst(pessoa3C18)");
		System.out.println(q.offerFirst(pessoa3C18));
		System.out.println("\nq.offerFirst(pessoa4D18)");
		System.out.println(q.offerFirst(pessoa4D18));
		System.out.println("\nq.offerFirst(pessoa5E47)");
		System.out.println(q.offerFirst(pessoa5E47));
		System.out.println("\nq.offerFirst(pessoa6F16)");
		System.out.println(q.offerFirst(pessoa6F16));
		System.out.println("\nq.offerFirst(pessoa7G14)");
		System.out.println(q.offerFirst(pessoa7G14));

		System.out.println("\n[q="+(q)+"]");
		System.out.println("\n[q.peek()="+(q.peek())+"]");

		System.out.println("\n\nq.push");
		q = new ArrayDeque<>();

		System.out.println("\nq.push(pessoa1A15)");
		q.push(pessoa1A15);
		System.out.println("\nq.push(pessoa2B18)");
		q.push(pessoa2B18);
		System.out.println("\nq.push(pessoa3C18)");
		q.push(pessoa3C18);
		System.out.println("\nq.push(pessoa4D18)");
		q.push(pessoa4D18);
		System.out.println("\nq.push(pessoa5E47)");
		q.push(pessoa5E47);
		System.out.println("\nq.push(pessoa6F16)");
		q.push(pessoa6F16);
		System.out.println("\nq.push(pessoa7G14)");
		q.push(pessoa7G14);

		System.out.println("\n[q="+(q)+"]");
		System.out.println("\n[q.peek()="+(q.peek())+"]");

		System.out.println("\n\nq.add");
		q = new ArrayDeque<>();

		System.out.println("\nq.add(pessoa1A15)");
		System.out.println(q.add(pessoa1A15));
		System.out.println("\nq.add(pessoa2B18)");
		System.out.println(q.add(pessoa2B18));
		System.out.println("\nq.add(pessoa3C18)");
		System.out.println(q.add(pessoa3C18));
		System.out.println("\nq.add(pessoa4D18)");
		System.out.println(q.add(pessoa4D18));
		System.out.println("\nq.add(pessoa5E47)");
		System.out.println(q.add(pessoa5E47));
		System.out.println("\nq.add(pessoa6F16)");
		System.out.println(q.add(pessoa6F16));
		System.out.println("\nq.add(pessoa7G14)");
		System.out.println(q.add(pessoa7G14));

		System.out.println("\n[q="+(q)+"]");
		System.out.println("\n[q.peek()="+(q.peek())+"]");

		System.out.println("\n\nq.addFirst");
		q = new ArrayDeque<>();

		System.out.println("\nq.addFirst(pessoa1A15)");
		q.addFirst(pessoa1A15);
		System.out.println("\nq.addFirst(pessoa2B18)");
		q.addFirst(pessoa2B18);
		System.out.println("\nq.addFirst(pessoa3C18)");
		q.addFirst(pessoa3C18);
		System.out.println("\nq.addFirst(pessoa4D18)");
		q.addFirst(pessoa4D18);
		System.out.println("\nq.addFirst(pessoa5E47)");
		q.addFirst(pessoa5E47);
		System.out.println("\nq.addFirst(pessoa6F16)");
		q.addFirst(pessoa6F16);
		System.out.println("\nq.addFirst(pessoa7G14)");
		q.addFirst(pessoa7G14);

		System.out.println("\n[q="+(q)+"]");
		System.out.println("\n[q.peek()="+(q.peek())+"]");
	}
}

/*

*/
