package pkgs.pkgExes;

import pkgs.pkg1.Tamanhos;

public class Exe001 {

	public static void main(String[] args) {
		m7();
	}

	private static void m1() {
		System.out.println(Tamanhos.values()[1]);
	}

	private static void m2() {
		for (int i = 0; i < Tamanhos.values().length; i++) {
			System.out.println(Tamanhos.values()[i]);
		}
	}

	private static void m3() {
		Tamanhos tamanho = Tamanhos.valueOf("qqc");
		System.out.println(tamanho);
	}

	private static void m4() {
		Tamanhos tamanho = Tamanhos.valueOf("MEDIO");
		System.out.println(tamanho);
		System.out.println(tamanho.name());
		System.out.println(tamanho.ordinal());
		System.out.println(tamanho.getCodigo());
	}

	private static void m5() {
		Tamanhos tamanho = Tamanhos.getByCodigo(30);
		System.out.println(tamanho);
		System.out.println(tamanho.name());
		System.out.println(tamanho.ordinal());
		System.out.println(tamanho.getCodigo());
	}

	private static void m6() {
		System.out.println(Tamanhos.PEQUENO);
		System.out.println(Tamanhos.MEDIO);
	}

	private static void m7() {
		/*for(Tamanhos t : Tamanhos.values()) {
			System.out.println(t);
		}*/
		int [] arr = new int[] {1,2,3,4,5};
		for(int i : arr) {
			System.out.println(i);
		}
	}

}
