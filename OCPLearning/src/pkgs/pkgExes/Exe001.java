package pkgs.pkgExes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;



public class Exe001 {

	public static File file = new File("C:\\temp\\pessoa.ser");

	public static void main(String[] args) {
		System.out.println("<>");
		m1(args);
		System.out.println("</>");
	}

	public static void m1(String[] args) {
		System.out.println("Exe001.m1()");
		new Exe002().m1();
		new Exe003().m1();
	}

}

class Exe002 implements Serializable {

	public class Pessoa implements Serializable {
		private int attribute1;
		public int getAttribute1() {
			return attribute1;
		}
		public void setAttribute1(int attribute1) {
			this.attribute1 = attribute1;
		}
	}

	public void m1() {
		try {
			Files.deleteIfExists(Exe001.file.toPath());
			Pessoa pessoa = new Pessoa();
			FileOutputStream fos = new FileOutputStream(Exe001.file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(pessoa);
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

class Exe003 implements Serializable {

	public class Pessoa implements Serializable {
		private int attribute1;
		public int getAttribute1() {
			return attribute1;
		}
		public void setAttribute1(int attribute1) {
			this.attribute1 = attribute1;
		}
	}

	public void m1() {
		try {
			FileInputStream fos = new FileInputStream(Exe001.file);
			ObjectInputStream ois = new ObjectInputStream(fos);
			Pessoa pessoa = (Pessoa) ois.readObject();
			System.out.println(pessoa);
			ois.close();
			Files.deleteIfExists(Exe001.file.toPath());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*
<>
Exe001.m1()
java.lang.ClassCastException: pkgs.pkgExes.Exe002$Pessoa cannot be cast to pkgs.pkgExes.Exe003$Pessoa
	at pkgs.pkgExes.Exe003.m1(Exe001.java:74)
	at pkgs.pkgExes.Exe001.m1(Exe001.java:26)
	at pkgs.pkgExes.Exe001.main(Exe001.java:19)
</>
*/

/*

*/

/*

*/
