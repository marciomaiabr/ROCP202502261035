package pkgs.pkgExes;

class ClasseAutoCloseable1 implements AutoCloseable {
	public ClasseAutoCloseable1() {System.out.println("ClasseAutoCloseable1.this()");}
	@Override
	public void close() throws Exception { System.out.println("ClasseAutoCloseable1.close()"); }
}

class ClasseAutoCloseable2 implements AutoCloseable {
	public ClasseAutoCloseable2() {System.out.println("ClasseAutoCloseable2.this()");}
	@Override
	public void close() throws Exception { System.out.println("ClasseAutoCloseable2.close()"); throw new RuntimeException("RTE do ClasseAutoCloseable2.close()"); }
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
		int x = 5;
		try (
				ClasseAutoCloseable1 ac1 = new ClasseAutoCloseable1();
				ClasseAutoCloseable2 ac2 = new ClasseAutoCloseable2();
				x = x+1;
				ClasseAutoCloseable3 ac3 = new ClasseAutoCloseable3();
				) {
			System.out.println("try");
			System.out.println(x);
			throw new RuntimeException("RTE do try");
		} catch (Exception e) {
			System.out.println("[catch][e.getMessage()="+(e.getMessage())+"]");
		} finally {
			System.out.println("finally");
		}
	}

}

/*

*/
