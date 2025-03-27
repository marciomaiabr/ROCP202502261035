package pkgs.pkgExes;

import java.io.File;
import java.io.FileWriter;

public class Exe001 {

	public static void main(String[] args) {
		System.out.println("<>");
		m1(args);
		System.out.println("</>");
	}

	public static void m1(String[] args) {
		System.out.println("Exe001.m1()");

		try {
			File file = new File("C:\\temp\\fileWrite2.txt");
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write("linha1\nlinha2\n");
			fileWriter.flush();
			fileWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

/*
<>
Exe001.m1()
</>
*/

/*
o arquivo é SOBREPOSTO e NÃO CONCATENADO
*/
