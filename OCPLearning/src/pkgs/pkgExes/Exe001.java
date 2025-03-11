package pkgs.pkgExes;

public class Exe001 {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		System.out.println("Exe001.m1()");
		pkgs.pkg1.pkg11.Ponei p = null;
		p.smAnimal();
	}

}

/*
quando executado somente o metodo statico de uma superclass,
o java nem executa os blocos staticos da classe da variavel declarada 
*/
