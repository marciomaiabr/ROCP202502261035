package pkgs.pkgExes;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
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

			System.out.println();
			//System.out.println("[resultSet.last()="+(resultSet.last())+"]"+"");//java.sql.SQLException: Operation not allowed for a result set of type ResultSet.TYPE_FORWARD_ONLY.
			System.out.println("[resultSet.getRow()="+(resultSet.getRow())+"]"+"");
			System.out.println("[resultSet.next()="+(resultSet.next())+"]"+"");
			System.out.println("[resultSet.getRow()="+(resultSet.getRow())+"]"+"");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*

*/
