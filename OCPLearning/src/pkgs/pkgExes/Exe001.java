package pkgs.pkgExes;

import java.io.File;

public class Exe001 {

	public static void main(String[] args) {
		System.out.println("<>");
		m2(args);
		System.out.println("</>");
	}

	public static void m2(String[] args) {
		System.out.println("Exe001.m2()");
		//cria diretorio em estrutura existente
		try {
			File temp = new File("C:\\temp");
			File dir1 = new File(temp, "dir1");
			File dir11 = new File(dir1, "dir11");
			File dir111 = new File(dir11, "dir111");
			System.out.println("[dir1.mkdir()="+(dir111.mkdir())+"]");//não cria pois a estrutura não existe
			System.out.println("[dir1.mkdir()="+(dir111.mkdirs())+"]");//cria a estrutura completa
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void m1(String[] args) {
		System.out.println("Exe001.m1()");
		//cria diretorio em estrutura existente
		try {
			File temp = new File("C:\\temp");
			File dir1 = new File(temp, "dir1");
			System.out.println("[dir1.mkdir()="+(dir1.mkdir())+"]");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*

*/

/*

*/

/*

*/
