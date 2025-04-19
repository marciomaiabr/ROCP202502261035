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
	}

}

class Exe002 {

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
java.io.NotSerializableException: pkgs.pkgExes.Exe002
	at java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1184)
	at java.io.ObjectOutputStream.defaultWriteFields(ObjectOutputStream.java:1548)
	at java.io.ObjectOutputStream.writeSerialData(ObjectOutputStream.java:1509)
	at java.io.ObjectOutputStream.writeOrdinaryObject(ObjectOutputStream.java:1432)
	at java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1178)
	at java.io.ObjectOutputStream.writeObject(ObjectOutputStream.java:348)
	at pkgs.pkgExes.Exe002.m1(Exe001.java:48)
	at pkgs.pkgExes.Exe001.m1(Exe001.java:25)
	at pkgs.pkgExes.Exe001.main(Exe001.java:19)
java.io.WriteAbortedException: writing aborted; java.io.NotSerializableException: pkgs.pkgExes.Exe002
	at java.io.ObjectInputStream.readObject0(ObjectInputStream.java:1699)
	at java.io.ObjectInputStream.defaultReadFields(ObjectInputStream.java:2454)
	at java.io.ObjectInputStream.readSerialData(ObjectInputStream.java:2378)
	at java.io.ObjectInputStream.readOrdinaryObject(ObjectInputStream.java:2236)
	at java.io.ObjectInputStream.readObject0(ObjectInputStream.java:1692)
	at java.io.ObjectInputStream.readObject(ObjectInputStream.java:508)
	at java.io.ObjectInputStream.readObject(ObjectInputStream.java:466)
	at pkgs.pkgExes.Exe002.m1(Exe001.java:56)
	at pkgs.pkgExes.Exe001.m1(Exe001.java:25)
	at pkgs.pkgExes.Exe001.main(Exe001.java:19)
Caused by: java.io.NotSerializableException: pkgs.pkgExes.Exe002
	at java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1184)
	at java.io.ObjectOutputStream.defaultWriteFields(ObjectOutputStream.java:1548)
	at java.io.ObjectOutputStream.writeSerialData(ObjectOutputStream.java:1509)
	at java.io.ObjectOutputStream.writeOrdinaryObject(ObjectOutputStream.java:1432)
	at java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1178)
	at java.io.ObjectOutputStream.writeObject(ObjectOutputStream.java:348)
	at pkgs.pkgExes.Exe002.m1(Exe001.java:48)
	... 2 more
</>
*/

/*

*/

/*

*/
