package pkgs.pkgExes;

import java.io.Closeable;

public class Exe001 {



	public static void main(String[] args) {

		new Exe001().go();

	}

	private void go() {

		class Printer implements Closeable {
			public void print() {
				System.out.println("This just in!");
			}
			public void close() {}
		}

		try (Printer p = new Printer();) {
			p.print();
		}

		try (Printer p = new Printer()) {
			p.print();
		}


	}



}
