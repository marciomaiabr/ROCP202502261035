package pkgs.pkgExes;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.time.LocalDateTime;

public class Exe001 {

	static {
		System.out.println(LocalDateTime.now());
	}

	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ocp202509020748", "root", "senha123");
			System.out.println("[connection="+(connection)+"]"+"");

			DatabaseMetaData dbmd = connection.getMetaData();

			if (dbmd.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
			    System.out.print("Supports TYPE_FORWARD_ONLY");
			    if (dbmd.supportsResultSetConcurrency(
			            ResultSet.TYPE_FORWARD_ONLY,
			            ResultSet.CONCUR_UPDATABLE)) {
			    	System.out.println(" and supports CONCUR_UPDATABLE");
			    }
			}

			if (dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
				System.out.print("Supports TYPE_SCROLL_INSENSITIVE");
			    if (dbmd.supportsResultSetConcurrency(
			            ResultSet.TYPE_SCROLL_INSENSITIVE,
			            ResultSet.CONCUR_UPDATABLE)) {
			    	System.out.println(" and supports CONCUR_UPDATABLE");
			    }
			}

			if (dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
				System.out.print("Supports TYPE_SCROLL_SENSITIVE");
			    if (dbmd.supportsResultSetConcurrency(
			            ResultSet.TYPE_SCROLL_SENSITIVE,
			            ResultSet.CONCUR_UPDATABLE)) {
			    	System.out.println("Supports CONCUR_UPDATABLE");
			    }
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*

*/
