package pkgs.pkgExes;

import pkgs.pkg7.ADSR;

public class Exe001 {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		System.out.println("Exe001.m1()");
		StringBuilder sb = new StringBuilder("a1 ");
		ADSR a1 = new ADSR(sb, 5, 7);
		ADSR a2 = a1.getADSR();
		System.out.println(a1.getName());
		sb.append("alter the name ");
		System.out.println(a1.getName());
		System.out.println(a2.getName());
	}

}
