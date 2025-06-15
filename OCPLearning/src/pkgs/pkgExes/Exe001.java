package pkgs.pkgExes;

import java.time.LocalDateTime;

interface ICalculadora { int calcula(int p1, int p2); }

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

		ICalculadora calculadora = null;

		calculadora = (n1, n2) -> n1 + n2;
		System.out.println(calculadora.calcula(6,2));

		calculadora = (n1, n2) -> n1 - n2;
		System.out.println(calculadora.calcula(6,2));

		System.out.println(multiplica((n1, n2) -> n1 * n2));

		System.out.println(divide((n1, n2) -> n1 / n2));

	}

	private int multiplica(ICalculadora calculadora) {
		return calculadora.calcula(6,2);
	}

	private int divide(ICalculadora calculadora) {
		return calculadora.calcula(6,2);
	}

}

/*

*/
