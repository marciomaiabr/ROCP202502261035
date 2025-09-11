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

			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);

			ResultSet resultSet = statement.executeQuery("select * from pessoa");

			System.out.println();
			System.out.println("[resultSet.last()="+(resultSet.last())+"]"+"");
			System.out.println("[resultSet.getRow()="+(resultSet.getRow())+"]"+"");

			System.out.println();
			System.out.println("[resultSet.absolute(4)="+(resultSet.absolute(0))+"]"+"");
			System.out.println("[resultSet.getRow()="+(resultSet.getRow())+"]"+"");
			//System.out.println("[resultSet.getRow()="+(resultSet.getString("nome"))+"]"+"");//java.sql.SQLException: Before start of result set

			System.out.println();
			System.out.println("[resultSet.absolute(7)="+(resultSet.absolute(7))+"]"+"");
			System.out.println("[resultSet.getRow()="+(resultSet.getRow())+"]"+"");
			System.out.println("[resultSet.getRow()="+(resultSet.getString("nome"))+"]"+"");

			System.out.println();
			System.out.println("[resultSet.absolute(8)="+(resultSet.absolute(8))+"]"+"");
			System.out.println("[resultSet.getRow()="+(resultSet.getRow())+"]"+"");
			//System.out.println("[resultSet.getRow()="+(resultSet.getString("nome"))+"]"+"");//java.sql.SQLException: After end of result set

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*

*/
