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
			Statement statement = null;
			ResultSet resultSet = null;
			boolean r = false;
			int intRowSAffected = -7;

			statement = connection.createStatement();
			r = statement.execute("update pessoa set nome = CONCAT(\"Marcio2\", \" \", \"B Maia\") where id in (1)");
			System.out.println("[r="+(r)+"]"+"");

			resultSet = statement.getResultSet();
			System.out.println("[resultSet="+(resultSet)+"]"+"");
			if( (resultSet != null) && resultSet.next())
				System.out.println("[resultSet.getString(\"nome\")="+(resultSet.getString("nome"))+"]"+"");

			intRowSAffected = statement.getUpdateCount();
			System.out.println("[intRowSAffected="+(intRowSAffected)+"]"+"");
			System.out.println();



			statement = connection.createStatement();
			r = statement.execute("select * from pessoa");
			System.out.println("[r="+(r)+"]"+"");

			resultSet = statement.getResultSet();
			System.out.println("[resultSet="+(resultSet)+"]"+"");
			if( (resultSet != null) && resultSet.next())
				System.out.println("[resultSet.getString(\"nome\")="+(resultSet.getString("nome"))+"]"+"");

			intRowSAffected = statement.getUpdateCount();
			System.out.println("[intRowSAffected="+(intRowSAffected)+"]"+"");
			System.out.println();



			statement = connection.createStatement();
			r = statement.execute("CREATE TABLE pessoa3 (id INT AUTO_INCREMENT PRIMARY KEY,nome VARCHAR(100) NOT NULL);");
			System.out.println("[r="+(r)+"]"+"");

			resultSet = statement.getResultSet();
			System.out.println("[resultSet="+(resultSet)+"]"+"");
			if( (resultSet != null) && resultSet.next())
				System.out.println("[resultSet.getString(\"nome\")="+(resultSet.getString("nome"))+"]"+"");

			intRowSAffected = statement.getUpdateCount();
			System.out.println("[intRowSAffected="+(intRowSAffected)+"]"+"");
			System.out.println();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*

*/
