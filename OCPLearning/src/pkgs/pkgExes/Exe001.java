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
	private transient Colar colar;
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
	//https://docs.oracle.com/javase/7/docs/api/java/io/ObjectOutputStream.html
	//https://docs.oracle.com/en/java/javase/11/docs/specs/serialization/input.html
	private void writeObject(ObjectOutputStream oos) {
		System.out.println("Dog.writeObject()");
		try {
			oos.defaultWriteObject();//se ñ chamar, não escreve os atributos automaticamente, como dogSize por exemplo//se chamar um sem o outro=StreamCorruptedException: invalid type code: 00
			oos.writeInt(colar.getCollarSize());
			oos.writeInt(100);
			oos.writeInt(200);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void readObject(ObjectInputStream ois) {
		System.out.println("Dog.readObject()");
		try {
			ois.defaultReadObject();//se ñ chamar, não carrega os atributos automaticamente, como dogSize por exemplo//se chamar um sem o outro=StreamCorruptedException: invalid type code: 00
			colar = new Colar(ois.readInt());
			System.out.println("[="+(ois.readInt())+"]");
			System.out.println("[="+(ois.readInt())+"]");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void readObjectNoData() {
		System.out.println("Dog.readObjectNoData()");
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
Dog.writeObject()
Dog.readObject()
[=100]
[=200]
8
3
</>
*/

/*

*/

/*

*/
