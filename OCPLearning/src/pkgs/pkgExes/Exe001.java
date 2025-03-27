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
		char [] in = new char [] {'Z','Z','Z'};
		int size = 0;
		try {
			File file = new File("C:\\temp\\fileWrite2.txt");
			FileReader fileReader = new FileReader(file);
			size = fileReader.read(in);
			System.out.println("[size="+(size)+"]");
			for (char c : in)
				System.out.print("[c="+(c)+"]");

			System.out.println();

			size = fileReader.read(in);
			System.out.println("[size="+(size)+"]");
			for (char c : in)
				System.out.print("[c="+(c)+"]");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*
<>
Exe001.m1()
[size=3]
[c=l][c=i][c=n]
[size=3]
[c=h][c=a][c=1]</>
*/

/*
C:\temp\fileWrite2.txt
linha1
linha2
*/

/*
FileReader.read(char cbuf[]) caso o array seja menor q o conteúdo,
sem disparar exceção ele TRUNCA o conteúdo
quando executar NOVAMENTE FileReader.read(char cbuf[])
ele continua de onde parou
*/
