package pkgs.pkgExes;

import java.io.File;
import java.io.FileInputStream;
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
			byte [] in = new byte[20];
			int size = 0;
			File file = new File("C:\\temp\\fileWrite3.txt");
			FileInputStream fileInputStream = new FileInputStream(file);
			size = fileInputStream.read(in);
			System.out.println("[size="+(size)+"]");

			for (byte b : in)
				System.out.print("[b="+(b)+"]");

			System.out.println();
			System.out.println();

			for (byte b : in)
				System.out.print("[(char)b="+((char)b)+"]");

			fileInputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*
C:\temp\fileWrite3.txt
linha1
linha2
*/

/*
<>
Exe001.m1()
[size=14]
[b=108][b=105][b=110][b=104][b=97][b=49][b=10][b=108][b=105][b=110][b=104][b=97][b=50][b=10][b=0][b=0][b=0][b=0][b=0][b=0]

[(char)b=l][(char)b=i][(char)b=n][(char)b=h][(char)b=a][(char)b=1][(char)b=
][(char)b=l][(char)b=i][(char)b=n][(char)b=h][(char)b=a][(char)b=2][(char)b=
][(char)b= ][(char)b= ][(char)b= ][(char)b= ][(char)b= ][(char)b= ]</>
*/

/*

*/
