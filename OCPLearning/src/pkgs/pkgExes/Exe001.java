package pkgs.pkgExes;

import java.time.LocalDateTime;

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

	void m1(long l) {System.out.println("Exe001.m(long l)");}
	void m1(Long l) {System.out.println("Exe001.m(Long l)");}
	void m2(Long l) {System.out.println("Exe001.m(Long l)");}

	public void im1(String[] args) {
		System.out.println("Exe001.im1()");
		m1(5);
		//m2(5);//The method m2(Long) in the type Exe001 is not applicable for the arguments (int)
		m2(5l);
 	}

}

/*

*/
