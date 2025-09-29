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

	short m1() {return 32767;}
	//short m2() {return 32768;}//Type mismatch: cannot convert from int to short
	short m3() {return new Short((short)5);}
	Short m4() {return (short)5;}

	public void im1(String[] args) {
		System.out.println("Exe001.im1()");
 	}

}

/*

*/
