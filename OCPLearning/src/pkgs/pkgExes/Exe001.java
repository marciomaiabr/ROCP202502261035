package pkgs.pkgExes;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

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
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.forEach(System.out::println);
		System.out.println();
		System.out.println("System.out.println(list.remove(2));");
		System.out.println(list.remove(2));
		System.out.println();
		list.forEach(System.out::println);
		System.out.println();
		System.out.println("System.out.println(list.remove(new Integer(20)));");
		System.out.println(list.remove(new Integer(20)));
		System.out.println();
		list.forEach(System.out::println);
	}

}

/*

*/
