package pkgs.pkgExes;

import java.io.Closeable;

class ClassA implements Closeable {

	//@Override public void close() throws Exception { System.out.println("ClassA.close()..."); throw new RuntimeException("RuntimeException close()..."); }//Exception Exception is not compatible with throws clause in Closeable.close()
	@Override public void close() { System.out.println("ClassA.close()..."); throw new RuntimeException("RuntimeException close()..."); }

}

public class Exe001 {

	public static void main(String[] args) {
		try {
			new Exe001().mtd();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void mtd() throws Exception {

		try (ClassA classA = new ClassA();) {
			System.out.println("try...");
			throw new RuntimeException("RuntimeException try...");
		} catch (Exception e) {
			System.out.println("catch...");
			throw new RuntimeException("RuntimeException catch...", e);
		} finally {
			System.out.println("finally...");
			throw new RuntimeException("RuntimeException finally...");
		}

	}

}
