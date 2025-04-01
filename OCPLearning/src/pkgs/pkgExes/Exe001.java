package pkgs.pkgExes;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Exe001 {

	public static void main(String[] args) {
		System.out.println("<>");
		m1(args);
		System.out.println("</>");
	}

	public static void m1(String[] args) {
		System.out.println("Exe001.m1()");
		Path path1 = Paths.get("src/main/java");
		Path path2 = Paths.get("src/resources/images");

		Path relativePath = path1.relativize(path2);
		System.out.println("Relative Path: " + relativePath);
	}

}

/*

*/

/*
<>
Exe001.m1()
Relative Path: ..\..\resources\images
</>
*/

/*
https://medium.com/@AlexanderObregon/javas-path-relativize-method-explained-773c3dd6e181
*/
