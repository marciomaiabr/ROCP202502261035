package pkgs.pkgExes;

import java.time.LocalDateTime;
import java.util.*;

import pkgs.pkg0.*;

public class Exe001 {

	static {
		System.out.println(LocalDateTime.now());
	}

	static class PQsort implements Comparator<Integer> {
		@Override
		public int compare(Integer one, Integer two) {
			return two-one;
		}
	}

	public static void main(String[] args) {
		System.out.println("<>");
		m1(args);
		System.out.println("</>");
	}

	public static void m1(String[] args) {
		System.out.println("Exe001.m1()");

		int [] ia = {1,5,3,7,6,9,8};

		Queue<Integer> q = new PriorityQueue<>();

		for(int x : ia)
			q.offer(x);

		for(int x : ia)
			System.out.print(q.poll()+" ");

		System.out.println();
		PQsort pqs = new PQsort();
		q = new PriorityQueue<>(10, pqs);

		System.out.println("\n\npq2.offer");
		for(int x : ia)
			q.offer(x);

		System.out.println("size "+q.size());
		System.out.println("peek "+q.peek());
		System.out.println("size "+q.size());
		System.out.println("poll "+q.poll());
		System.out.println("size "+q.size());

		for(int x : ia)
			System.out.print(q.poll()+" ");

	}
}

/*

*/
