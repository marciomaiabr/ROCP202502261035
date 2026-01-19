package pkgs.pkgExes;



public class Exe001 {



	public static void main(String[] args) {

		new Exe001().go();

	}

	void go() {

		System.out.println(null instanceof Thread);
		Object o = null;
		System.out.println(o instanceof Thread);

	}

}
