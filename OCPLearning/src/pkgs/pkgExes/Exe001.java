package pkgs.pkgExes;

public class Exe001 {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		System.out.println("Exe001.m1()");
		System.out.println(pkgs.pkg1.Animal.X);
		System.out.println(pkgs.pkg1.pkg11.Ponei.X);
		System.out.println(pkgs.pkg1.pkg11.Ponei.Z);
	}

}
