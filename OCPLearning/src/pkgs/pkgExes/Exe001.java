package pkgs.pkgExes;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Exe001 {



	public static void main(String[] args) {

		ConcurrentMap<String, Integer> m = new ConcurrentHashMap<>();
		String john = "John";
		System.out.println(m.put(john, 23));
		System.out.println(m.size());
		System.out.println(m);
		System.out.println(m.remove(john, 3));
		System.out.println(m);
		System.out.println(m.remove("qqc", 23));
		System.out.println(m);
		System.out.println(m.remove(john, 23));
		System.out.println(m);

	}



}
