package pkgs.pkgExes;

public class Exe001 {

	public static void main(String[] args) {
		System.out.println("<>");
		m1(args);
		System.out.println("</>");
	}

	public static void m1(String[] args) {
		System.out.println("Exe001.m1()");
		Object o = null;
		System.out.println("[="+(o instanceof Object)+"]");
		Object o2 = new Object();
		System.out.println("[="+(o2 instanceof Object)+"]");
	}

}

/*
<>
Exe001.m1()
[=false]
[=true]
</>
*/

/*

*/

/*

*/
