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
			int intRowSAffected = statement.executeUpdate("delete from pessoa where id not in (1)");

			System.out.println("[intRowSAffected="+(intRowSAffected)+"]"+"");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*

*/
