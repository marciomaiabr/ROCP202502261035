package pkgs.pkgExes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Cat implements Serializable{}

public class Exe001 {

	public static void main(String[] args) {
		System.out.println("<>");
		m1(args);
		System.out.println("</>");
	}

	public static void m1(String[] args) {
		System.out.println("Exe001.m1()");
		try {
			Cat c = new Cat();
			FileOutputStream fos = new FileOutputStream("C:\\temp\\testSer.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(c);
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fos = new FileInputStream("C:\\temp\\testSer.ser");
			ObjectInputStream ois = new ObjectInputStream(fos);
			Cat c = (Cat) ois.readObject();
			System.out.println(c);
			ois.close();
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
