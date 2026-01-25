package pkgs.pkgExes;



public class Exe001 {



	public static void main(String[] args) {

		new Exe001().go();

	}

	private void go() {
		int intA = retorna_int();
		System.out.println(intA);
		intA = retorna_Integer();
		System.out.println(intA);
		Integer integerB = retorna_Integer();
		System.out.println(integerB);
		integerB = retorna_int();
		System.out.println(integerB);
	}

	private int retorna_int() { return 0; }
	private int retorna_Integer() { return new Integer(0); }

}
