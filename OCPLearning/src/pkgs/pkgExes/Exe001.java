package pkgs.pkgExes;

public class Exe001 {

	public static void main(String[] args) {
		System.out.println("<>");
		m1(args);
		System.out.println("</>");
	}

	public static void m1(String[] args) {
		System.out.println("Exe001.m1()");//https://stackoverflow.com/questions/1700081/why-is-128-128-false-but-127-127-is-true-when-comparing-integer-wrappers-in-ja

		{
			Integer i1 = 127;
			Integer i2 = 127;
			System.out.println("["+(i1==i2)+"]");
		}

		{
			Integer i1 = 128;
			Integer i2 = 128;
			System.out.println("["+(i1==i2)+"]");
		}

		{
			Long l1 = 127l;
			Long l2 = 127l;
			System.out.println("["+(l1==l2)+"]");
		}

		{
			Long l1 = 128l;
			Long l2 = 128l;
			System.out.println("["+(l1==l2)+"]");
		}

	}

}

/*
<>
Exe001.m1()
[true]
[false]
[true]
[false]
</>
*/

/*

*/

/*

*/
