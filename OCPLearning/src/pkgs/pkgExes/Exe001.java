package pkgs.pkgExes;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Exe001 {

	public static void main(String[] args) {

		try {
			System.out.println(Files.size(Paths.get("c:", "temp", "fqqc.txt")));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
