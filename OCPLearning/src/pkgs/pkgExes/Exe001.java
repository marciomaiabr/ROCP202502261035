package pkgs.pkgExes;

public class Exe001 {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		System.out.println("Exe001.m1()");
		pkgs.pkg1.Cavalo.sm();
	}

}

/*
ao executar o metodo statico de uma classe
PRIMEIRO sao executados os blocos staticos dos pais
depois o da classe q contem o metodo a ser executado
*/
