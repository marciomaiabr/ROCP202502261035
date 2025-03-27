package pkgs.pkgExes;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Exe001 {

	public static void main(String[] args) {
		System.out.println("<>");
		m1(args);
		System.out.println("</>");
	}

	public static void m1(String[] args) {
		System.out.println("Exe001.m1()");
		char [] in = new char [20];
		int size = 0;
		try {
			File file = new File("C:\\temp\\fileWrite2.txt");
			FileReader fileReader = new FileReader(file);
			size = fileReader.read(in);
			System.out.println("[size="+(size)+"]");
			for (char c : in)
				System.out.print("[c="+(c)+"]");

			fileReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*
<>
Exe001.m1()
[size=14]
[c=l][c=i][c=n][c=h][c=a][c=1][c=
][c=l][c=i][c=n][c=h][c=a][c=2][c=
][c= ][c= ][c= ][c= ][c= ][c= ]</>
*/

/*
C:\temp\fileWrite2.txt
linha1
linha2
*/

/*
faltou o  close() nos outros testes
*/
