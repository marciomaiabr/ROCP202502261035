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
			System.out.println("[connection="+(connection)+"]"+"");

			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			System.out.println("[statement="+(statement)+"]"+"");

			ResultSet resultSet = statement.executeQuery("select * from pessoa");
			System.out.println("[resultSet="+(resultSet)+"]"+"");

			System.out.println("[resultSet.last()="+(resultSet.last())+"]"+"");
			System.out.println("[resultSet.getRow()="+(resultSet.getRow())+"]"+"");

			System.out.println("[resultSet.last()="+(resultSet.absolute(0))+"]"+"");
			System.out.println("[resultSet.getRow()="+(resultSet.getRow())+"]"+"");

			System.out.println("[resultSet.last()="+(resultSet.absolute(2))+"]"+"");
			System.out.println("[resultSet.getRow()="+(resultSet.getRow())+"]"+"");

			System.out.println("[resultSet.last()="+(resultSet.absolute(4))+"]"+"");
			System.out.println("[resultSet.getRow()="+(resultSet.getRow())+"]"+"");

			System.out.println("[resultSet.last()="+(resultSet.absolute(9))+"]"+"");
			System.out.println("[resultSet.getRow()="+(resultSet.getRow())+"]"+"");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*

*/
