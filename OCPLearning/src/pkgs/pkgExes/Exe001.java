package pkgs.pkgExes;

class ClasseAutoCloseable1 implements AutoCloseable {
	public ClasseAutoCloseable1() {System.out.println("ClasseAutoCloseable1.this()");}
	@Override
	public void close() throws Exception { System.out.println("ClasseAutoCloseable1.close()"); }
}

class ClasseAutoCloseable2 implements AutoCloseable {
	public ClasseAutoCloseable2() {System.out.println("ClasseAutoCloseable2.this()");}
	@Override
	public void close()  { System.out.println("ClasseAutoCloseable2.close()"); throw new RuntimeException("RTE do ClasseAutoCloseable2.close()"); }
}

class ClasseAutoCloseable3 implements AutoCloseable {
	public ClasseAutoCloseable3() {System.out.println("ClasseAutoCloseable3.this()");}
	@Override
	public void close() throws Exception { System.out.println("ClasseAutoCloseable3.close()"); }
}

public class Exe001 {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		System.out.println("Exe001.m1()");
		try()  {

		}
	}

}

/*

*/
