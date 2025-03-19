package pkgs.pkgExes;

import java.io.Closeable;

class ClasseCloseable1 implements Closeable {
	public ClasseCloseable1() {System.out.println("ClasseCloseable1.this()");}

	@Override
	public void close() {
		System.out.println("ClasseCloseable1.close()");
	}
}

public class Exe001 {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
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
*/
