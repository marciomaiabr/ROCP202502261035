package pkgs.pkgExes;

import java.time.LocalDateTime;
import java.util.*;

class TestGeneric<T> {
	T anInstance;
	T [] anArrayOfTs;
	public TestGeneric(T anInstance) {
		this.anInstance = anInstance;
	}
	T getT() {
		return anInstance;
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
		TestGeneric testGeneric = null;
		System.out.println("[="+(testGeneric)+"]");
	}

}

/*
sobre array de generico:
Obviamente, este é um uso ridículo de genéricos e, na verdade, você raramente os verá fora de coleções.
*/
