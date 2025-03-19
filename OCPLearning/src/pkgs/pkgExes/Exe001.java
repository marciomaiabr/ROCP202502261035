package pkgs.pkgExes;

import java.io.Closeable;
import java.io.IOException;

class ClasseCloseable1 implements Closeable {
	public ClasseCloseable1() {System.out.println("ClasseCloseable1.this()");}

	@Override
	public void close() throws IOException {
		System.out.println("ClasseCloseable1.close()");
	}
}

public class Exe001 {

	public static void main(String[] args) throws IOException {
		m1();
	}

	private static void m1() throws IOException {
		System.out.println("Exe001.m1()");
		try(
				ClasseCloseable1 cc1 = new ClasseCloseable1();
				)  {
			System.out.println("Exe001.m1()[try]");
		}
	}

}

/*
OK try-with-resources funcionando perfeitamente com Closeable pois a interface Closeable extends da interface AutoCloseable
POREM a assinatura de close() de AutoCloseable throws Exception
ENQUANTO a assinatura de close() de Closeable throws IOException OBRIGANDO assim um tratamento ou com bloco catch (Exception e) ou throws IOException(ou supertypes destes)
*/
