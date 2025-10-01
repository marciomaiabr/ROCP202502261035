package pkgs.pkgExes;

class ClassA {
	static { System.out.println("static block ClassA 1 "); }
	{ System.out.println("instance block ClassA 1 "); }
	public ClassA() { System.out.println("ClassA()"); }
	static { System.out.println("static block ClassA 2 "); }
	{ System.out.println("instance block ClassA 2 "); }
}

class ClassB extends ClassA {
	static { System.out.println("static block ClassB 1 "); }
	{ System.out.println("instance block ClassB 1 "); }
	public ClassB() { System.out.println("ClassB()"); }
	static { System.out.println("static block ClassB 2 "); }
	{ System.out.println("instance block ClassB 2 "); }
}

class ClassC extends ClassB {
	static { System.out.println("static block ClassC 1 "); }
	{ System.out.println("instance block ClassC 1 "); }
	public ClassC() { System.out.println("ClassC()"); }
	static { System.out.println("static block ClassC 2 "); }
	{ System.out.println("instance block ClassC 2 "); }
}

public class Exe001 {

	public static void main(String[] args) {
		new ClassC();
	}

}
