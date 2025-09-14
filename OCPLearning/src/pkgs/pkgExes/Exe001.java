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
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ocp202509020748", "root", "senha123");
			connection.setAutoCommit(false);

			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);

			ResultSet resultSet = null;
			resultSet = statement.executeQuery("select * from pessoa");

			System.out.println();
			System.out.println("[resultSet.last()="+(resultSet.last())+"]"+"");
			System.out.println("[resultSet.getRow()="+(resultSet.getRow())+"]"+"");
			System.out.println();

			System.out.println();
			resultSet.beforeFirst();
			while (resultSet.next())
				System.out.println(resultSet.getString("nome"));

			System.out.println();

			resultSet.absolute(3);
			System.out.println("[resultSet.getRow()="+(resultSet.getRow())+"]"+"");
			System.out.println("[resultSet.getRow()="+(resultSet.getString("nome"))+"]"+"");
			resultSet.updateString("nome", resultSet.getString("nome").concat(" Maia"));
			//System.out.println("[resultSet.getRow()="+(resultSet.rowUpdated())+"]"+"");//java.sql.SQLFeatureNotSupportedException
			System.out.println("[resultSet.getRow()="+(resultSet.getString("nome"))+"]"+"");
			resultSet.updateRow();
			System.out.println("[resultSet.getRow()="+(resultSet.getString("nome"))+"]"+"");
			System.out.println();

			resultSet.absolute(2);
			System.out.println("[resultSet.getRow()="+(resultSet.getRow())+"]"+"");
			System.out.println("[resultSet.getRow()="+(resultSet.getString("nome"))+"]"+"");
			resultSet.updateString("nome", resultSet.getString("nome").concat(" Maia"));
			//System.out.println("[resultSet.getRow()="+(resultSet.rowUpdated())+"]"+"");//java.sql.SQLFeatureNotSupportedException
			System.out.println("[resultSet.getRow()="+(resultSet.getString("nome"))+"]"+"");
			resultSet.relative(1);
			resultSet.relative(-1);
			System.out.println("[resultSet.getRow()="+(resultSet.getString("nome"))+"]"+"");
			System.out.println();

			resultSet.absolute(1);
			//resultSet.deleteRow();//SQLIntegrityConstraintViolationException: Cannot delete or update a parent row: a foreign key constraint fails (`ocp202509020748`.`carros`, CONSTRAINT `carros_ibfk_1` FOREIGN KEY (`pessoa`) REFERENCES `pessoa` (`id`))
			resultSet.absolute(2);
			resultSet.deleteRow();

			System.out.println();
			System.out.println("[resultSet.last()="+(resultSet.first())+"]"+"");
			System.out.println("[resultSet.last()="+(resultSet.last())+"]"+"");
			System.out.println("[resultSet.getRow()="+(resultSet.getRow())+"]"+"");
			System.out.println();

			System.out.println();
			resultSet.beforeFirst();
			while (resultSet.next())
				System.out.println(resultSet.getString("nome"));

			connection.rollback();

			resultSet = statement.executeQuery("select * from pessoa");

			System.out.println();
			resultSet.beforeFirst();
			while (resultSet.next())
				System.out.println(resultSet.getString("nome"));

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
