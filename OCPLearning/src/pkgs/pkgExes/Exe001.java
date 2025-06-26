package pkgs.pkgExes;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
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

		Consumer<Connection> consumidorDeConnection1 = (Connection connection) -> {
			System.out.println("consumidorDeConnection1...");
			if(connection == null)
				System.out.println("Connection not initialized");
			else
				System.out.println("Connection initialized");
		};

		Consumer<Connection> consumidorDeConnection2 = (Connection connection) -> {
			System.out.println("consumidorDeConnection2...");
			if(connection == null)
				System.out.println("Connection not initialized");
			else
				System.out.println("Connection initialized");
		};

		Consumer<Connection> consumidorDeConnection3 = (Connection connection) -> {
			System.out.println("consumidorDeConnection3...");
			if(connection == null)
				System.out.println("Connection not initialized");
			else
				System.out.println("Connection initialized");
		};

		List<Connection> list = new ArrayList<>();
		Connection connection = null;
		list.add(connection);
		list.forEach(consumidorDeConnection1.andThen(consumidorDeConnection2).andThen(consumidorDeConnection3));

	}

}

/*

*/
