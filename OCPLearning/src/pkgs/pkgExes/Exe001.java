package pkgs.pkgExes;

import java.util.*;

public class Exe001 {



	public static void main(String[] args) {

		Set set = null;

		set = new HashSet<>();
		set.add("2");
		set.add(3);
		set.add("1");
		set.forEach(System.out::println);

		set = new TreeSet<>();
		set.add("2");
		//set.add(3);//ClassCastException: java.lang.String cannot be cast to java.lang.Integer
		set.add("1");
		set.forEach(System.out::println);

	}

}
