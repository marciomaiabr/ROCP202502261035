package pkgs.pkgExes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Exe001 {

	public static void main(String[] args) {
		System.out.println("<>");
		m1(args);
		System.out.println("</>");
	}

	public static void m1(String[] args) {
		System.out.println("Exe001.m1()");
		try {
			File file = new File("C:\\temp\\202503280725.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String linha = null;
			while ((linha = bufferedReader.readLine()) != null) {
				System.out.println("[linha="+(linha)+"]");
			}
			bufferedReader.close();
			fileReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*
C:\temp\202503280725.txt
20250328072811_561000000
20250328072811_567000000
*/

/*
<>
Exe001.m1()
[linha=20250328072811_561000000]
[linha=20250328072811_567000000]
</>
*/

/*

*/
