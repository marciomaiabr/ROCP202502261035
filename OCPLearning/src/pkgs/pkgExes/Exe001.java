package pkgs.pkgExes;

import java.io.PrintStream;

public class Exe001 {



	public static void main(String[] args) {

		new Exe001().go();

	}

	private void go() {

		try {
			System.out.println("aki...1...");
			try(PrintStream out2 = System.out){
				System.out.println("aki...2...");
				out2.println("aki...3...");
				System.out.println(System.out.checkError());
			}
			System.out.println("aki...4...");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(System.out.checkError());

	}



}
