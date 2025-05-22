package pkgs.pkgExes;

import java.time.LocalDateTime;
import java.util.*;

class UseInformationOfGeneric<T> {
	T t;
	public UseInformationOfGeneric(T t) {
		this.t = t;
	}
	T getT() {
		return t;
	}
	String getTClassName() {
		return getT().getClass().getName();
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
		UseInformationOfGeneric<LocalDateTime> useInformationOfGeneric = new UseInformationOfGeneric<>(LocalDateTime.now());
		System.out.println("[="+(useInformationOfGeneric.getT())+"]");
		System.out.println("[="+(useInformationOfGeneric.getTClassName())+"]");
	}

}

/*

*/
