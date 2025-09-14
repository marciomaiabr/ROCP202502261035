package pkgs.pkgExes;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;

public class Exe001 {

	static {
		System.out.println(LocalDateTime.now());
	}

	public static void main(String[] args) {
		sm1(args);
		new Exe001().im1(args);
	}

	public static void sm1(String[] args) {
		System.out.println("Exe001.sm1()");
		//System.out.println("[="+()+"]"+"");
	}

	public void im1(String[] args) {
		System.out.println("Exe001.im1()");
		try {
			preparaCenario();

			new Thread(()->{
				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ocp202509020748", "root", "senha123");
					connection.setAutoCommit(false);

					Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);

					ResultSet resultSet = statement.executeQuery("select * from pessoa");

					System.out.println("[aki][1]");
					resultSet.next();
					resultSet.next();
					resultSet.next();
					resultSet.updateString("nome", resultSet.getString("nome").concat(" Maia"));
					resultSet.updateRow();
					Thread.sleep(30*1000);
					System.out.println("[aki][2]");

					connection.rollback();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}).start();

			System.out.println("[aki][3]");
			try {
				Thread.sleep(3*1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("[aki][4]");

			new Thread(()->{
				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ocp202509020748", "root", "senha123");
					connection.setAutoCommit(false);

					//Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
					Statement statement = connection.createStatement();

					System.out.println("[aki][5]");
					ResultSet resultSet = statement.executeQuery("select * from pessoa");

					System.out.println("[aki][6]");
					resultSet.next();
					resultSet.next();
					resultSet.next();
					System.out.println("[resultSet.getRow()="+(resultSet.getRow())+"]"+"");
					System.out.println("[resultSet.getRow()="+(resultSet.getString("nome"))+"]"+"");
					System.out.println("[aki][7]");

					connection.rollback();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}).start();

		} catch (Exception e) {
			e.printStackTrace();
		}
 	}

	private void preparaCenario() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ocp202509020748", "root", "senha123");
			connection.prepareStatement(" delete from carros ").execute();
			connection.prepareStatement(" delete from pessoa ").execute();

			connection.prepareStatement(" insert into pessoa (nome) values ('Marcio') ").execute();
			connection.prepareStatement(" insert into pessoa (nome) values ('Ana') ").execute();
			connection.prepareStatement(" insert into pessoa (nome) values ('Fernanda') ").execute();

			connection.prepareStatement(" insert into carros (descricao, pessoa) values ('Ferrari', (select id from pessoa where nome = 'Marcio')) ").execute();
			connection.prepareStatement(" insert into carros (descricao, pessoa) values ('Lamborghini', (select id from pessoa where nome = 'Marcio')) ").execute();
		} catch (Exception e) {
			throw new RuntimeException("Falha ao criar cenario", e);
		} finally {
			try {
				connection.close();
			} catch (Exception e2) { }
		}
	}

}

/*

*/
