package pkgs.pkgExes;

import java.io.Console;

public class Exe001 {

	public static void main(String[] args) {
		System.out.println("<>");
		m1(args);
		System.out.println("</>");
	}

	public static void m1(String[] args) {
		System.out.println("Exe001.m1()");
		Console console = System.console();
		String readLine = console.readLine();
		System.out.println("[readLine="+(new String(readLine))+"]");
		char [] readPassword = console.readPassword();
		System.out.println("[readPassword="+(new String(readPassword))+"]");
	}

}

/*

*/

/*

*/

/*

*/
