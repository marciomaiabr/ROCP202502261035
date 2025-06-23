package pkgs.pkgExes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.time.LocalDateTime;
import java.util.function.*;

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
		Supplier<Connection> fornecedorDeConnection = () -> {
			try {
				Class.forName("").newInstance();
				return DriverManager.getConnection("");
			} catch (Exception e) {}
			return null;
		};
		System.out.println("[fornecedorDeConnection="+(fornecedorDeConnection)+"]");
		System.out.println("[fornecedorDeConnection.get()="+(fornecedorDeConnection.get())+"]");
	}

}

/*

*/
