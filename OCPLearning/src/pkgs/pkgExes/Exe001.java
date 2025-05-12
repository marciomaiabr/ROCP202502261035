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
		List<Integer> nums = Arrays.asList(10,9,8,7,6,5);
		ArrayDeque<Integer> a = new ArrayDeque<>(2);
		ArrayDeque<Integer> b = new ArrayDeque<>(2);
		ArrayDeque<Integer> c = new ArrayDeque<>(2);
		ArrayDeque<Integer> d = new ArrayDeque<>(2);
		ArrayDeque<Integer> e = new ArrayDeque<>(2);
		for(Integer n : nums) {
			a.offer(n);
			b.offerFirst(n);
			c.push(n);
			d.add(n);
			e.addFirst(n);
		}
		System.out.println("[a="+(a)+"]");
		System.out.println("[b="+(b)+"]");
		System.out.println("[c="+(c)+"]");
		System.out.println("[d="+(d)+"]");
		System.out.println("[e="+(e)+"]");
	}
}

/*

*/
