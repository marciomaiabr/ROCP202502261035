package pkgs.pkgExes;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

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

	public static void m12(boolean deleteAndExit) {
		System.out.println("Exe001.m12()");
		try {
			Path path = Paths.get(STRING_FILE_NAME);
			File file = path.toFile();
			System.out.println(ZonedDateTime.ofInstant(Instant.ofEpochMilli(file.lastModified()), ZoneId.systemDefault()));
			if (deleteAndExit)
				Files.deleteIfExists(path);
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
			File file = path.toFile();
			Instant instant = ZonedDateTime.of(2024, 12, 31, 23, 59, 59, 9999, ZoneId.systemDefault()).toInstant();
			file.setLastModified(instant.getEpochSecond() * 1000);
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
