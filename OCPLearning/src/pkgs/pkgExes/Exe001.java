package pkgs.pkgExes;

class ClassA {
	static { System.out.println("static ClassA 1 "); }
	public final static String A = "a";
	public static void msClassA() { System.out.println("msClassA()"); }
	public ClassA() { System.out.println("ClassA()"); }
	static { System.out.println("static ClassA 2 "); }
}

class ClassB extends ClassA {
	static { System.out.println("static ClassB 1 "); }
	public final static String B = "b";
	public static void msClassB() { System.out.println("msClassB()"); }
	public ClassB() { System.out.println("ClassB()"); }
	static { System.out.println("static ClassB 2 "); }
}

class ClassC extends ClassB {
	static { System.out.println("static ClassC 1 "); }
	public final static String C = "c";
	public static void msClassC() { System.out.println("msClassC()"); }
	public ClassC() { System.out.println("ClassC()"); }
	static { System.out.println("static ClassC 2 "); }
}

public class Exe001 {

	public static void main(String[] args) {
		System.out.println(ClassC.C);
		System.out.println();
		System.out.println(ClassC.A);
		System.out.println();

		ClassC.msClassC();
	}

}

/*

*/
