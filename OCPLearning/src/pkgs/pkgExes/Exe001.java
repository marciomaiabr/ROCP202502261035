package pkgs.pkgExes;

public class Exe001 {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		System.out.println("Exe001.m1()");
		int x = 5;
		try {
			assert(false):"[x="+(x)+"]";
		} catch (Throwable t) {
			System.out.println("MSG disparada: "+t.getMessage());
		}
		System.out.println("/Exe001.m1()");
	}

}

/*
capturar assertion com try/catch E POSSIVEL pois dispara AssertionError ou seja um ERROR ou seja um Throwable
*/
