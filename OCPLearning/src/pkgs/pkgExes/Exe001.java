package pkgs.pkgExes;

import java.time.LocalDateTime;

public class Exe001 {

	static {
		System.out.println(LocalDateTime.now());
	}

	class MyInner1 {
		public void mQqc() {
			MyInner2 myInner2 = new MyInner2();
			System.out.println(myInner2);
		}
	}

	class MyInner2 {
		public void mQqc() {
			MyInner1 myInner1 = new MyInner1();
			System.out.println(myInner1);
		}
	}

	public static void main(String[] args) {

		try {
			System.out.println("<>");
			m1(args);
			System.out.println("</>");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			Runtime.getRuntime().exec("cmd.exe /c C:\\Users\\Administrador\\git\\ROCP202502261035\\OCPLearning\\logs\\logMM.txt");
		} catch (Exception e) {}

	}

	public static void m1(String[] args) {
		System.out.println("Exe001.m1()");
		//System.out.println("[="+()+"]");
	}

}

/*

*/
