package pkgs.pkgExes;

import java.io.IOException;
import java.sql.SQLException;

public class Exe001 {

	public static void main(String[] args) {

		try {
			qqc();
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}

	}

	static void qqc() throws SQLException , IOException {}

}
