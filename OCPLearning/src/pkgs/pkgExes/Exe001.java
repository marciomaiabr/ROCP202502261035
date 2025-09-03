package pkgs.pkgExes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.time.LocalDateTime;

public class Exe001 {

	static {
		System.out.println(LocalDateTime.now());
	}

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ocp202509020748", "root", "senha123");
			ResultSet resultSet = connection.prepareStatement("select * from pessoa").executeQuery();

			if(resultSet.next())
				System.out.println("[connection="+(resultSet.getString("nome"))+"]"+"");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*

*/
