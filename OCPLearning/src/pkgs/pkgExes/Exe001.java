package pkgs.pkgExes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;

class Pessoa implements Serializable {
	private int attribute1;
	private int attribute2;
	public int getAttribute1() {
		return attribute1;
	}
	public void setAttribute1(int attribute1) {
		this.attribute1 = attribute1;
	}
	public int getAttribute2() {
		return attribute2;
	}
	public void setAttribute2(int attribute2) {
		this.attribute2 = attribute2;
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
java.io.InvalidClassException: pkgs.pkgExes.Pessoa; local class incompatible: stream classdesc serialVersionUID = 6924733891751361056, local class serialVersionUID = -7354908922431995500
	at java.io.ObjectStreamClass.initNonProxy(ObjectStreamClass.java:699)
	at java.io.ObjectInputStream.readNonProxyDesc(ObjectInputStream.java:2028)
	at java.io.ObjectInputStream.readClassDesc(ObjectInputStream.java:1875)
	at java.io.ObjectInputStream.readOrdinaryObject(ObjectInputStream.java:2209)
	at java.io.ObjectInputStream.readObject0(ObjectInputStream.java:1692)
	at java.io.ObjectInputStream.readObject(ObjectInputStream.java:508)
	at java.io.ObjectInputStream.readObject(ObjectInputStream.java:466)
	at pkgs.pkgExes.Exe001.m2(Exe001.java:58)
	at pkgs.pkgExes.Exe001.main(Exe001.java:32)
</>
*/

/*

*/

/*

*/
