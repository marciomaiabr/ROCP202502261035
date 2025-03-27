package pkgs.pkgExes;

import java.io.File;
import java.io.FileOutputStream;

public class Exe001 {

	public static void main(String[] args) {
		System.out.println("<>");
		m1(args);
		System.out.println("</>");
	}

	public static void m1(String[] args) {
		System.out.println("Exe001.m1()");
		try {
			File file = new File("C:\\temp\\fileWrite3.txt");
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			fileOutputStream.write("linha1\nlinha2\n".getBytes());
			fileOutputStream.flush();
			fileOutputStream.write("linha3\nlinha4\n".getBytes());
			fileOutputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*
C:\temp\fileWrite3.txt
linha1
linha2
linha3
linha4
*/

/*
<>
Exe001.m1()
</>
*/

/*

*/
