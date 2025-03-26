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
			System.out.println("[file.exists()="+(file.exists())+"]");
			System.out.println("[file.createNewFile()="+(file.createNewFile())+"]");
			System.out.println("[file.exists()="+(file.exists())+"]");
			File file2 = new File("C:\\temp\\fileWrite1.txt");
			System.out.println("[file2.delete()="+(file2.delete())+"]");
			System.out.println("[file.exists()="+(file.exists())+"]");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*
<>
Exe001.m1()
[file.exists()=false]
[file.createNewFile()=true]
[file.exists()=true]
[file2.delete()=true]
[file.exists()=false]
</>
*/

/*
File não bloqueia o arquivo, tanto q nem tem um mdt close
*/
