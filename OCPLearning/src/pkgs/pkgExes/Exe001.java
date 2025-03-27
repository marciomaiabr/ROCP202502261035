package pkgs.pkgExes;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Exe001 {

	public static void main(String[] args) {
		System.out.println("<>");
		m1(args);
		System.out.println("</>");
	}

	public static void m1(String[] args) {
		System.out.println("Exe001.m1()");
		try {
			PrintWriter printWriter = new PrintWriter("C:\\temp\\fileWrite5.txt");
			printWriter.write("linha1\nlinha2");
			printWriter.flush();
			printWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*

*/

/*

*/

/*

*/
