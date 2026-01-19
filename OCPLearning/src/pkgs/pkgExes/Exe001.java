package pkgs.pkgExes;



public class Exe001 {



	public static void main(String[] args) {

		new Exe001().go();

	}

	void go() {

		Object o = null;
		System.out.println("1...");
		synchronized (o) {//NullPointerException
			System.out.println("2...");
		}
		System.out.println("3...");

	}

}
