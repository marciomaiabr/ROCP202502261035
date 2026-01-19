package pkgs.pkgExes;



public class Exe001 {



	public static void main(String[] args) {

		new Exe001().go();

	}

	void go() {

		System.out.println("1...");
		synchronized (null) {
			System.out.println("2...");
		}
		System.out.println("3...");

	}

}
