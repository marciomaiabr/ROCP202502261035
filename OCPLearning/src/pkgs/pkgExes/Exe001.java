package pkgs.pkgExes;

import pkgs.pkg3.ExceptionA;
import pkgs.pkg3.ExceptionB;
import pkgs.pkg3.ExceptionC;

class ClasseQQ {

	public void throwsExceptionA() throws ExceptionA {}
	public void throwsExceptionAExceptionB() throws ExceptionA, ExceptionB {}
	public void throwsExceptionAExceptionBExceptionC() throws ExceptionA, ExceptionB, ExceptionC {}

	public void mtd() throws ExceptionA, ExceptionB, ExceptionC {
		try {
			throwsExceptionAExceptionBExceptionC();
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
CORRECAO 1 OK pois foi adicionado no throws a excecao disparada no corpo do try
*/
