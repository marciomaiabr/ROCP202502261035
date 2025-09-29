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

	long m1() {return 32767;}
	long m3() {return new Long(5);}
	Long m4() {return (long)5;}

	public void im1(String[] args) {
		System.out.println("Exe001.im1()");
 	}

}

/*

*/
