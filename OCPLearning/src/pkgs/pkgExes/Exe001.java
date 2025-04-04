package pkgs.pkgExes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Exe001 {

	public static void main(String[] args) {
		System.out.println("<>");
		m1(args);
		System.out.println("</>");
	}

	public static void m1(String[] args) {
		System.out.println("Exe001.m1()");
		System.out.println("[="+(LocalDate.now().format(DateTimeFormatter.ofPattern("EEEE", new Locale("PT"))))+"]");
		System.out.println("[="+(LocalDate.now().format(DateTimeFormatter.ofPattern("EEEE", new Locale("EN"))))+"]");
	}

}

/*

*/

/*

*/

/*

*/
