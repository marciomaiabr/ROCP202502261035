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
		Path absolute = Paths.get("/folderA/folderAA");
		Path relative = Paths.get("folderB");
		System.out.println("["+("("+absolute+").resolve("+relative+")")+"="+(absolute.resolve(relative))+"]");
	}

}

/*
<>
Exe001.m1()
[(\folderA\folderAA).resolve(folderB)=\folderA\folderAA\folderB]
</>
*/

/*

*/

/*

*/
