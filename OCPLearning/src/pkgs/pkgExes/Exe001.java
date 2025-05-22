package pkgs.pkgExes;

import java.time.LocalDateTime;
import java.util.*;

class UseTwo<T, U> {
	T one;
	U two;
	public UseTwo(T one, U two) {
		//this.one = two;//Type mismatch: cannot convert from U to T
		//this.two = one;//Type mismatch: cannot convert from T to U
		this.one = one;
		this.two = two;
	}
	T getT() {
		return one;
	}
	U getU() {
		return two;
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
		//UseTwo<int, String> useTwo = new UseTwo<>(1, "tst");//Syntax error, insert "Dimensions" to complete TypeArgument
		UseTwo<Integer, String> useTwo = new UseTwo<>(1, "tst");
		System.out.println("[="+(useTwo.getT())+"]");
		System.out.println("[="+(useTwo.getU())+"]");
	}

}

/*

*/
