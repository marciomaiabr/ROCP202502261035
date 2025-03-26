package pkgs.pkgExes;

import java.io.File;

public class Exe001 {

	public static void main(String[] args) {
		System.out.println("<>");
		m1(args);
		System.out.println("</>");
	}

	public static void m1(String[] args) {
		System.out.println("Exe001.m1()");
		try {
			File file = new File("C:\\temp\\fileWrite1.txt");
			System.out.println(file.exists());
			System.out.println(file.createNewFile());
			System.out.println(file.exists());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*

*/

/*

*/
