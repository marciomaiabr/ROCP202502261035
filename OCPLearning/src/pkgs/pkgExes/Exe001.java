package pkgs.pkgExes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

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
			FileInputStream fos = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fos);
			Object o = ois.readObject();
			System.out.println(o);
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*
<>
Exe001.m1()
java.lang.ClassNotFoundException: pkgs.pkgExes.Dog
	at java.net.URLClassLoader.findClass(URLClassLoader.java:387)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:418)
	at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:359)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:351)
	at java.lang.Class.forName0(Native Method)
	at java.lang.Class.forName(Class.java:348)
	at java.io.ObjectInputStream.resolveClass(ObjectInputStream.java:763)
	at java.io.ObjectInputStream.readNonProxyDesc(ObjectInputStream.java:2011)
	at java.io.ObjectInputStream.readClassDesc(ObjectInputStream.java:1875)
	at java.io.ObjectInputStream.readOrdinaryObject(ObjectInputStream.java:2209)
	at java.io.ObjectInputStream.readObject0(ObjectInputStream.java:1692)
	at java.io.ObjectInputStream.readObject(ObjectInputStream.java:508)
	at java.io.ObjectInputStream.readObject(ObjectInputStream.java:466)</>

	at pkgs.pkgExes.Exe001.m1(Exe001.java:24)
	at pkgs.pkgExes.Exe001.main(Exe001.java:14)
*/

/*

*/

/*

*/
