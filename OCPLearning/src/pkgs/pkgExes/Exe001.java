package pkgs.pkgExes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Colar implements Serializable {
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
		try {
			FileInputStream fos = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fos);
			Dog dog = (Dog) ois.readObject();
			System.out.println(dog.getDogSize());
			System.out.println(dog.getColar().getCollarSize());
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*
<>
Exe001.m1()
false
8
3
</>
*/

/*

*/

/*

*/
