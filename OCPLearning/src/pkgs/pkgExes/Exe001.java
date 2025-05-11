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

		Queue<Pessoa> q = new PriorityQueue<>(new Comparator<Pessoa>() {
			@Override
			public int compare(Pessoa pessoa1, Pessoa pessoa2) {
				System.out.println("PessoaComparator.compare()");
				int intCompare = new Integer(pessoa2.getIdade()).compareTo(pessoa1.getIdade());
				System.out.println("[intCompare="+(intCompare)+"]");
				return intCompare;
			}
		});

		System.out.println("\n\nq.offer");

		System.out.println("\nq.offer(pessoa1A15)");
		System.out.println(q.offer(pessoa1A15));
		System.out.println("\nq.offer(pessoa2B18)");
		System.out.println(q.offer(pessoa2B18));
		System.out.println("\nq.offer(pessoa4D18)");
		System.out.println(q.offer(pessoa4D18));
		System.out.println("\nq.offer(pessoa3C18)");
		System.out.println(q.offer(pessoa3C18));
		System.out.println("\nq.offer(pessoa5E47)");
		System.out.println(q.offer(pessoa5E47));
		System.out.println("\nq.offer(pessoa6F16)");
		System.out.println(q.offer(pessoa6F16));
		System.out.println("\nq.offer(pessoa7G14)");
		System.out.println(q.offer(pessoa7G14));

		System.out.println("\n\nq.peek");
		System.out.println(q.peek());

		System.out.println("\n\nq.polls");
		while(q.size()>0)
			System.out.println(q.poll());
	}
}

/*

*/
