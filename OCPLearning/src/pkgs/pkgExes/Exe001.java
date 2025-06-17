package pkgs.pkgExes;

import java.time.LocalDateTime;

interface IQqc1 {  }
//@FunctionalInterface interface IQqc2 {  }//compile error//Invalid '@FunctionalInterface' annotation; IQqc2 is not a functional interface
@FunctionalInterface interface IQqc3 { void mQqc(); }
//@FunctionalInterface interface IQqc4 { default void mQqc() {}; }//compile error//Invalid '@FunctionalInterface' annotation; IQqc4 is not a functional interface
//@FunctionalInterface interface IQqc5 { default void mQqc() {}; static void mQqc2() {}; }//compile error//Invalid '@FunctionalInterface' annotation; IQqc5 is not a functional interface
@FunctionalInterface interface IQqc6 { default void mQqc() {}; static void mQqc2() {}; void mQqc3(); }
//@FunctionalInterface interface IQqc7 { boolean equals2(Object obj); void mQqc(); }//compile error//Invalid '@FunctionalInterface' annotation; IQqc7 is not a functional interface
@FunctionalInterface interface IQqc8 { boolean equals(Object obj); void mQqc(); }

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
		//System.out.println("[="+()+"]");
	}

}

/*

*/
