package pkgs.pkgExes;

class ClassA implements AutoCloseable {

	//@Override public void close() throws Exception { throw new Exception("ClassA... close()... Exception..."); }
	@Override public void close() { throw new RuntimeException("ClassA... close()... RuntimeException..."); }
	
}

public class Exe001 {

	public static void main(String[] args) {

		try(ClassA ca = new ClassA();){
			System.out.println(ca);
		}

	}

}
