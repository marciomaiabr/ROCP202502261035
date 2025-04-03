package pkgs.pkgExes;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exe001 {

	private static final String STRING_FILE_NAME = Paths.get("c:", "temp", "f202504020820.txt").toString();

	public static void main(String[] args) {
		System.out.println("<>");
		m1(args);
		System.out.println("</>");
	}

	public static void m1(String[] args) {
		System.out.println("Exe001.m1()");
		m11();
	}

	public static void m11() {
		System.out.println("Exe001.m11()");
		try {
			Path path = Paths.get(STRING_FILE_NAME);
			Files.deleteIfExists(path);
			System.out.println(Files.createFile(path));
			m12(false);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void m12(boolean canExit) {
		System.out.println("Exe001.m12()");
		try {
			Path path = Paths.get(STRING_FILE_NAME);
			System.out.println(Files.isHidden(path));
			if (canExit)
				return;
			else
				m13();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void m13() {
		System.out.println("Exe001.m13()");
		try {
			Path path = Paths.get(STRING_FILE_NAME);
			Files.setAttribute(path, "dos:hidden", true);
			m12(true);
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
