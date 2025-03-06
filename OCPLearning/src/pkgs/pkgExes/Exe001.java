package pkgs.pkgExes;

public class Exe001 {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		System.out.println("Exe001.m1()");
		try {
			Class.forName("pkgs.pkg1.Animal");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*
blocos staticos em classe sem supertype sao executados em sequencia conforme ordem que estao escritos
*/
