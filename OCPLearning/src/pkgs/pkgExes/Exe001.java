package pkgs.pkgExes;

import java.util.Properties;

public class Exe001 {

	public static void main(String[] args) {
		System.out.println("<>");
		m1();
		System.out.println("</>");
	}

	public static void m1() {
		System.out.println("Exe001.m1()");
		Properties p = System.getProperties();
		p.list(System.out);
	}

}

/*

*/

/*

*/
