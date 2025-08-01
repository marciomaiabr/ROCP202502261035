package pkgs.pkgExes;

import java.time.LocalDateTime;

class ClasseQqc{
	public synchronized void doStuff1() {
		System.out.println("Exe001.im1(...).ClasseQqc.doStuff1()");
	}
	public void doStuff2() {
		synchronized(this) {
			System.out.println("Exe001.im1(...).ClasseQqc.doStuff2()");
		}
	}
	public synchronized static int getCount1() {
		return 0;
	}
	public static int getCount2() {
		synchronized(ClasseQqc.class) {
			return 0;
		}
	}
	public static int getCount3() throws ClassNotFoundException {
		Class c1 = Class.forName("ClasseQqc");
		synchronized(c1) {
			return 0;
		}
	}
}

public class Exe001 {

	static {
		System.out.println(LocalDateTime.now());
	}

	public static void main(String[] args) {

		try {
			System.out.println("<>");
			sm1(args);
			new Exe001().im1(args);
			System.out.println("</>");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			Runtime.getRuntime().exec("cmd.exe /c C:\\Users\\Administrador\\git\\ROCP202502261035\\OCPLearning\\logs\\logMM.txt");
		} catch (Exception e) {}

	}

	public static void sm1(String[] args) {
		System.out.println("Exe001.sm1()");
	}

	public void im1(String[] args) {
		System.out.println("Exe001.im1()");

	}

}

/*

*/
