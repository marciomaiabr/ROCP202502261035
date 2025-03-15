package pkgs.pkgExes;

import pkgs.pkg3.ExceptionA;
import pkgs.pkg3.ExceptionB;

class ClasseQQ{

	public void mtd() throws ExceptionA, ExceptionB {
		try {} catch (Exception e) {}
	}

}

public class Exe001 {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		System.out.println("Exe001.m1()");
		System.out.println("/Exe001.m1()");
	}

}

/*

*/
