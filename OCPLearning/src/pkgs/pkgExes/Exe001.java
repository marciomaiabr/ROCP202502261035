package pkgs.pkgExes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Colar {
	private int collarSize;
	public Colar(int collarSize) {
		this.collarSize = collarSize;
	}
	public int getCollarSize() {
		return collarSize;
	}
}

class Dog implements Serializable {
	private Colar colar;
	private int dogSize;
	public Dog(Colar colar, int dogSize) {
		super();
		this.colar = colar;
		this.dogSize = dogSize;
	}
	public Colar getColar() {
		return colar;
	}
	public int getDogSize() {
		return dogSize;
	}
}

public class Exe001 {

	public static void main(String[] args) {
		System.out.println("<>");
		m1(args);
		System.out.println("</>");
	}

	public static void m1(String[] args) {
		System.out.println("Exe001.m1()");
		File file = new File("C:\\temp\\dog.ser");
		try {
			Colar colar = new Colar(3);
			Dog dog = new Dog(colar, 8);
			System.out.println(file.exists());
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(dog);
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(file.exists());
	}

}

/*
<>
Exe001.m1()
false
java.io.NotSerializableException: pkgs.pkgExes.Colar
	at java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1184)
	at java.io.ObjectOutputStream.defaultWriteFields(ObjectOutputStream.java:1548)
	at java.io.ObjectOutputStream.writeSerialData(ObjectOutputStream.java:1509)
	at java.io.ObjectOutputStream.writeOrdinaryObject(ObjectOutputStream.java:1432)
	at java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1178)
	at java.io.ObjectOutputStream.writeObject(ObjectOutputStream.java:348)
	at pkgs.pkgExes.Exe001.m1(Exe001.java:53)
	at pkgs.pkgExes.Exe001.main(Exe001.java:40)
true
</>
*/

/*

*/

/*

*/
