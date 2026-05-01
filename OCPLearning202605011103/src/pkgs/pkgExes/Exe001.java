package pkgs.pkgExes;

class ClassA {}

public class Exe001 {



	public static void main(String[] args) {

		new Exe001().go();

	}

	private void go() {
		ClassA ca = new ClassA();
		ClassA [] arr = new ClassA[0];
		//System.out.println(ca instanceof ClassA[] );//compilation problem: Incompatible conditional operand types ClassA and ClassA[]
		System.out.println(arr instanceof ClassA[] );
		System.out.println(ca instanceof ClassA);
		//System.out.println(arr instanceof ClassA );//compilation problem: Incompatible conditional operand types ClassA[] and ClassA
	}



}
