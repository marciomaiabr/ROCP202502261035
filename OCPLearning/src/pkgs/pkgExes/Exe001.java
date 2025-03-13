package pkgs.pkgExes;

public class Exe001 {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		System.out.println("Exe001.m1()");
		assert(true);
		System.out.println("/Exe001.m1()");
	}

}

/*
em assertions enabled
quando expression1, ou seja, o que esta entre parenteses do assert TRUE
a execucao OCORRE SEM PROBLEMAS
*/
