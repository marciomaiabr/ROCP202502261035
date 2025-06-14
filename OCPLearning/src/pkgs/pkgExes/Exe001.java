package pkgs.pkgExes;

import java.time.LocalDateTime;

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

	interface InterfaceA {};

	public void mqqc(InterfaceA pInterfaceA) {
		System.out.println(pInterfaceA);
	}

	public void im1(String[] args) {
		System.out.println("Exe001.im1()");
		mqqc(new InterfaceA() {
			public InterfaceA() {}//An anonymous class cannot have an explicitly declared constructor.//https://docs.oracle.com/javase/specs/jls/se7/html/jls-15.html#jls-15.9.5.1
			@Override public String toString() {
				return "[Anonymous class][from InterfaceA]";
			}
		});
	}

}

/*

*/
