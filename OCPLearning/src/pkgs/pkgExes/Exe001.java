package pkgs.pkgExes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
			ResultSet resultSet = statement.executeQuery("select * from pessoa");

			if(resultSet.next())
				System.out.println("[resultSet.getString(\"nome\")="+(resultSet.getString("nome"))+"]"+"");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*

*/
