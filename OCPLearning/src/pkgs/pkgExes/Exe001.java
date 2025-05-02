package pkgs.pkgExes;

import java.util.ArrayList;
import java.util.List;

public class Exe001 {

	public static void main(String[] args) {
		System.out.println("<>");
		m1(args);
		System.out.println("</>");
	}

	public static void m1(String[] args) {
		System.out.println("Exe001.m1()");
		System.out.println();
		try {
			System.out.println("testing Integer reference with equals null reference");
			Integer obj1 = new Integer(1000);
			Integer obj2 = null;
			System.out.println("[="+(obj1.equals(obj2))+"]");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		try {
			System.out.println("testing null reference with equals Integer reference");
			Integer obj1 = null;
			Integer obj2 = new Integer(1000);
			System.out.println("[="+(obj1.equals(obj2))+"]");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		try {
			System.out.println("testing Integer reference with == null reference");
			Integer obj1 = new Integer(1000);
			Integer obj2 = null;
			System.out.println("[="+(obj1 == obj2)+"]");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		try {
			System.out.println("testing int value with == null reference");
			int i1 = 1000;
			Integer obj1 = null;
			System.out.println("[="+(i1 == obj1)+"]");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		try {
			System.out.println("testing Generic List with primitive type");
			//List<int> list = new ArrayList<>();//não é permitido tipo primitivo no Generic List
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		try {
			System.out.println("testing Generic List with Integer type");
			List<Integer> list = new ArrayList<>();
			list.add(3);
			list.add(4);
			list.add(null);
			list.add(1);
			list.add(2);
			list.add(5);
			System.out.println("[="+(list.get(1))+"]");//get(int index);
			System.out.println("[="+(list.indexOf(4))+"]");//indexOf(Object o);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*
<>
Exe001.m1()

testing Integer reference with equals null reference
[=false]

testing null reference with equals Integer reference
java.lang.NullPointerException
	at pkgs.pkgExes.Exe001.m1(Exe001.java:30)
	at pkgs.pkgExes.Exe001.main(Exe001.java:10)

testing Integer reference with == null reference
[=false]

testing int value with == null reference
java.lang.NullPointerException
	at pkgs.pkgExes.Exe001.m1(Exe001.java:48)

	at pkgs.pkgExes.Exe001.main(Exe001.java:10)
testing Generic List with primitive type

testing Generic List with Integer type
[=4]
[=1]
</>
*/

/*

*/

/*

*/
