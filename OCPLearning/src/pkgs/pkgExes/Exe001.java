package pkgs.pkgExes;

public class Exe001 {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		System.out.println("Exe001.m1()");
		pkgs.pkg1.pkg11.Ponei o = null;
		o.sm4();
	}

}

/*
quando executado um mtd sttc de uma classe que chama outro mtd sttc que NAO esteja REDEFINIDO nessa classe,
o java executa o mtd REDEFINIDO no supertype
*/
