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
			File file = new File("C:\\temp\\File202503310853.txt");
			System.out.println("[file.exists()="+(file.exists())+"]");
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write("linha1\nlinha2");
			fileWriter.flush();
			System.out.println("[file.exists()="+(file.exists())+"]");
			fileWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*
<>
Exe001.m1()
[file.exists()=false]
[file.exists()=true]
</>
*/

/*

*/

/*
flush() força a criação do arquivo
*/
