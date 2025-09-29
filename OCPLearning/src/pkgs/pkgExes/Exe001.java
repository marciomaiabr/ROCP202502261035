package pkgs.pkgExes;

import java.time.LocalDateTime;

interface InterfaceA {
	//final default void mqqc1() {}//Illegal modifier for the interface method mqqc1; only public, abstract, default, static and strictfp are permitted
	//default static void mqqc2() {}//Illegal combination of modifiers for the interface method mqqc2; only one of abstract, default, or static permitted
	default void mqqc3() {;;;}
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
 	}

}

/*

*/
