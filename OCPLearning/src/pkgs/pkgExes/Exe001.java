package pkgs.pkgExes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Exe001 {



	public static void main(String[] args) {

		try (
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ocp202509020748", "root", "senha123");
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("select count(*) from pessoa")
			) {
			if(rs.next())
				System.out.println(rs.getInt(1));
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
