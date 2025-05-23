package pkgs.pkgExes;

import java.time.LocalDateTime;
import java.util.*;

class ClassQQ1<T> {
	void mqq1(T t) {}
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
		ClassQQ1 classQQ1 = null;
		System.out.println(classQQ1);
	}

}

/*

*/
