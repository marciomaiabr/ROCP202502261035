package pkgs.pkgExes;

import java.io.Closeable;
import java.io.IOException;
import java.sql.SQLException;

interface ICloseable extends Closeable {
	@Override
	void close() throws IOException;
}

interface IAutoCloseable extends AutoCloseable {
	@Override
	void close() throws SQLException;
}

class Classe1 implements IAutoCloseable, ICloseable {

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
	}

}

public class Exe001 {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		System.out.println("Exe001.m1()");
	}

}

/*
OBVIO, basico de interfaces, que QUANDO sub de subtype com diferentes throws NAO parentescos do mesmo metodo NAO COMPILA
*/
