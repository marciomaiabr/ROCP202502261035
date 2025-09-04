package pkgs.pkgExes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.time.LocalDateTime;

public class Exe001 {

	static {
		System.out.println(LocalDateTime.now());
	}

	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ocp202509020748", "root", "senha123");
			Statement statement = connection.createStatement();
			System.out.println(statement);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*

*/
