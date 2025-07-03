package pkgs.pkgExes;

import java.time.LocalDateTime;
import java.util.*;
import java.util.Map.Entry;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Exe001 {

	static {
		System.out.println(LocalDateTime.now());
	}

	public static void main(String[] args) {

		try {
			System.out.println("<>");
			sm1(args);
			new Exe001().im1(args);
			System.out.println("</>");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			Runtime.getRuntime().exec("cmd.exe /c C:\\Users\\Administrador\\git\\ROCP202502261035\\OCPLearning\\logs\\logMM.txt");
		} catch (Exception e) {}

	}

	public static void sm1(String[] args) {
		System.out.println("Exe001.sm1()");
	}

	public void im1(String[] args) {
		System.out.println("Exe001.im1()");
		Map<String, Integer> maps = new HashMap<>();
		maps.put("Ana", 17);
		maps.put("Paula", 18);
		maps.put("Karina", 19);
		Set<Entry<String, Integer>> set = maps.entrySet();
		System.out.println(set.stream().filter(d -> d.getValue() >= 18).count());
	}

}

/*

*/
