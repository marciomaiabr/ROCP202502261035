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
ao carregar de uma classe SEM supertype
1 sao executados os blocos staticos em sequencia conforme ordem que estao escritos
*/
