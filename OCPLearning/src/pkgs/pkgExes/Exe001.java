package pkgs.pkgExes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.time.LocalDateTime;

public class Exe001 {

	static {
		System.out.println(LocalDateTime.now());
	}

	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ocp202509020748", "root", "senha123");
			System.out.println("[connection="+(connection)+"]"+"");

			Statement statement = connection.createStatement();
			System.out.println("[statement="+(statement)+"]"+"");
			ResultSet resultSet = statement.executeQuery("select * from pessoa");
			System.out.println("[resultSet="+(resultSet)+"]"+"");
			ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
			System.out.println("[resultSetMetaData="+(resultSetMetaData)+"]"+"");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*

*/
