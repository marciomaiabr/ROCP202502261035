package pkgs.pkgExes;

class ClassA implements AutoCloseable {

	@Override public void close() throws Exception { System.out.println("ClassA.close()..."); }

}

public class Exe001 {

	public static void main(String[] args) {

		try (ClassA classA = new ClassA();) {
			System.out.println("try...");
		} catch (Exception e) {
			System.out.println("catch...");
		} finally {
			System.out.println("finally...");
		}

	}

}
