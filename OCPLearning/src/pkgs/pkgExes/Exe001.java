package pkgs.pkgExes;

public class Exe001 {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		System.out.println("Exe001.m1()");
		try {
			new pkgs.pkg8.pkg81.ClassePKG8A().mtd();
		} catch (Throwable t) {
			System.out.println(t.getMessage());
		}
		try {
			new pkgs.pkg8.pkg81.pkg811.ClassePKG8B().mtd();
		} catch (Throwable t) {
			System.out.println(t.getMessage());
		}
		try {
			new pkgs.pkg8.pkg81.pkg811.pkg8111.ClassePKG8C().mtd();
		} catch (Throwable t) {
			System.out.println(t.getMessage());
		}
		System.out.println("/Exe001.m1()");
	}

}

/*

*/
