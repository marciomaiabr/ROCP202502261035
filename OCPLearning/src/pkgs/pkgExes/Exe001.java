package pkgs.pkgExes;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

class Parent {}

class Child extends Parent {}

public class Exe001 {

	static {
		System.out.println(LocalDateTime.now());
	}

	public static void main(String[] args) {
		System.out.println("<>");
		m1(args);
		System.out.println("</>");
	}

	public static void m1(String[] args) {
		System.out.println("Exe001.m1()");
		//List<Parent> l1 = new ArrayList<Child>();//compile error=Type mismatch: cannot convert from ArrayList<Child> to List<Parent>
		//List<Child> l2 = new ArrayList<Parent>();//compile error=Type mismatch: cannot convert from ArrayList<Parent> to List<Child>
		Parent [] l1 = new Child [5];
		//Child [] l2 = new Parent [5];//compile error=Type mismatch: cannot convert from Parent[] to Child[]
	}

}

/*

*/
