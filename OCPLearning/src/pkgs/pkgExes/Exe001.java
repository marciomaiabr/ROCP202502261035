package pkgs.pkgExes;

import java.time.LocalDateTime;

interface InterfaceA {
	public default void m1() {}
}

interface InterfaceB {
	public default void m1() {}
}

interface InterfaceC extends InterfaceA , InterfaceB {

}

class ClassA implements InterfaceC {

}

public class Exe001 {

	static {
		System.out.println(LocalDateTime.now());
	}

	public static void main(String[] args) {
		sm1(args);
		new Exe001().im1(args);
	}

	public static void sm1(String[] args) {
		System.out.println("Exe001.sm1()");
		//System.out.println("[="+()+"]"+"");
	}

	public void im1(String[] args) {
		System.out.println("Exe001.im1()");
		ClassA o = new ClassA();
		o.m1();
 	}

}

/*

*/
