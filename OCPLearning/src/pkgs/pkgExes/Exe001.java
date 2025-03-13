package pkgs.pkgExes;

public class Exe001 {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		System.out.println("Exe001.m1()");
		int x = 5;
		assert(false):"[x="+(x)+"]";
		System.out.println("/Exe001.m1()");
	}

}

/*

*/
