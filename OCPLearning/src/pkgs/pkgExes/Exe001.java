package pkgs.pkgExes;

import pkgs.pkg3.ExceptionA;
import pkgs.pkg3.ExceptionB;
import pkgs.pkg3.ExceptionC;

class ClasseQQ {

	public void throwsExceptionA() throws ExceptionA {}
	public void throwsExceptionAExceptionB() throws ExceptionA, ExceptionB {}
	public void throwsExceptionAExceptionBExceptionC() throws ExceptionA, ExceptionB, ExceptionC {}

	public void mtd() throws ExceptionA, ExceptionB {
		try {
			throwsExceptionAExceptionB();
		} catch (Exception e) {
			throw e;
		}
	}

}

public class Exe001 {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		System.out.println("Exe001.m1()");
		try {
			new ClasseQQ().mtd();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("/Exe001.m1()");
	}

}

/*
OK pois o java sabe q no throws tem as exceptions disparadas no body do try
*/
