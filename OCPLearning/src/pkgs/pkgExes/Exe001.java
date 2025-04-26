package pkgs.pkgExes;

public class Exe001 {

	public static void main(String[] args) {
		System.out.println("<>");
		m1(args);
		System.out.println("</>");
	}

	public static void m1(String[] args) {
		System.out.println("Exe001.m1()");
		System.out.println("[="+(null == null)+"]");
		Object o = null;
		Object o2 = null;
		System.out.println("[="+(o == o2)+"]");
	}

}

/*
<>
Exe001.m1()
[=true]
[=true]
</>
*/

/*

*/

/*

*/
