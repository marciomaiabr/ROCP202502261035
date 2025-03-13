package pkgs.pkgExes;

public class Exe001 {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		System.out.println("Exe001.m1()");
		assert(false);
		System.out.println("/Exe001.m1()");
	}

}

/*
em assertions enabled
quando expression1, ou seja, o que esta entre parenteses do assert FALSE
a execucao DISPARA UMA java.lang.AssertionError
pra memorizar, assert FALSE quer dizer que aquilo que está em expression1 NAO BATEU com aquilo que vc esperava
*/
