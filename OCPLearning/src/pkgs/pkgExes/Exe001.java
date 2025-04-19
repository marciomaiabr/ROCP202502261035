package pkgs.pkgExes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;

class Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	private int attribute1;
	public int getAttribute1() {
		return attribute1;
	}
	public void setAttribute1(int attribute1) {
		this.attribute1 = attribute1;
	}
}

public class Exe001 {

	public static void main(String[] args) {
		System.out.println("<>");
		m2(args);
		System.out.println("</>");
	}

	public static void m1(String[] args) {
		System.out.println("Exe001.m1()");
		File file = new File("C:\\temp\\pessoa.ser");
		try {
			Files.deleteIfExists(file.toPath());
			Pessoa pessoa = new Pessoa();
			System.out.println(file.exists());
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(pessoa);
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void m2(String[] args) {
		System.out.println("Exe001.m2()");
		File file = new File("C:\\temp\\pessoa.ser");
		try {
			FileInputStream fos = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fos);
			Pessoa pessoa = (Pessoa) ois.readObject();
			System.out.println(pessoa);
			ois.close();
			Files.deleteIfExists(file.toPath());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*
<>
Exe001.m2()
java.io.InvalidClassException: pkgs.pkgExes.Pessoa; incompatible types for field attribute1
	at java.io.ObjectStreamClass.matchFields(ObjectStreamClass.java:2468)
	at java.io.ObjectStreamClass.getReflector(ObjectStreamClass.java:2362)
	at java.io.ObjectStreamClass.initNonProxy(ObjectStreamClass.java:753)
	at java.io.ObjectInputStream.readNonProxyDesc(ObjectInputStream.java:2028)
	at java.io.ObjectInputStream.readClassDesc(ObjectInputStream.java:1875)
	at java.io.ObjectInputStream.readOrdinaryObject(ObjectInputStream.java:2209)
	at java.io.ObjectInputStream.readObject0(ObjectInputStream.java:1692)
	at java.io.ObjectInputStream.readObject(ObjectInputStream.java:508)
	at java.io.ObjectInputStream.readObject(ObjectInputStream.java:466)
	at pkgs.pkgExes.Exe001.m2(Exe001.java:52)
	at pkgs.pkgExes.Exe001.main(Exe001.java:26)
</>
*/

/*

*/

/*

*/
