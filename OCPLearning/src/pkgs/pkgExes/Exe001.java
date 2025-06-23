package pkgs.pkgExes;

import java.sql.*;
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
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
				return DriverManager.getConnection("");
			} catch (Exception e) {}
			return null;
		};

		Consumer<Connection> consumidorDeConnection = (Connection connection) -> {
			if(connection == null)
				System.out.println("Connection not initialized");
			else
				System.out.println("Connection initialized");
		};
		System.out.println("[consumidorDeConnection="+(consumidorDeConnection)+"]");
		consumidorDeConnection.accept(fornecedorDeConnection.get());
	}

}

/*

*/
