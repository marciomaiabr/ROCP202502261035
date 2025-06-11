package pkgs.pkgExes;

import java.time.LocalDateTime;

class MyOuterClass {

	public Integer integerX = 1;
	@Override
	public String toString() {
		return "[this.getClass().getCanonicalName()="+(this.getClass().getCanonicalName())+"]"+"[integerX="+(integerX)+"]";
	}

	public class MyInnerClass {

		public Integer integerX = 2;
		@Override
		public String toString() {
			return "[this.getClass().getCanonicalName()="+(this.getClass().getCanonicalName())+"]"+"[integerX="+(integerX)+"]";
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
		MyOuterClass myOuterClass = new MyOuterClass();
		MyOuterClass.MyInnerClass myInnerClass = myOuterClass.new MyInnerClass();
		System.out.println("[myOuterClass]"+myOuterClass);
		System.out.println("[myInnerClass]"+myInnerClass);
	}

}

/*

*/
