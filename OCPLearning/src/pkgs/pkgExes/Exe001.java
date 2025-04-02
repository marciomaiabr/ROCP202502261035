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
		Path path = Paths.get("/folderA/folderAA", "../..", "folderB/folderBB");
		System.out.println("[path="+(path)+"]");
		System.out.println("[path.normalize()="+(path.normalize())+"]");
	}

}

/*
<>
Exe001.m1()
[path=\folderA\folderAA\..\..\folderB\folderBB]
[path.normalize()=\folderB\folderBB]
</>
*/

/*

*/

/*

*/
