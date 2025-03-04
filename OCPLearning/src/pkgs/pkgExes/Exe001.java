package pkgs.pkgExes;

interface I1{
	void mtc1();
}

interface I11 extends I1{
	default void mtc1() {System.out.println("I11.mtc1()");};
}

interface I12 extends I1{
	default void mtc1() {System.out.println("I12.mtc1()");};
}

abstract class C1 implements I11 , I12 {
	public void mtc1() {System.out.println("C1.mtc1()");};
}

public class Exe001 {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		System.out.println("Exe001.m1()");
	}

}
