package pkgs.pkgExes;

class ClassA {}

public class Exe001 {



	public static void main(String[] args) {

		new Exe001().go();

	}

	private void go() {
		ClassA cai = new ClassA();
		ClassA can = null;
		System.out.println("[cai.equals(can)="+(cai.equals(can))+"]"+"");
		System.out.println("[can.equals(cai)="+(can.equals(cai))+"]"+"");
	}



}
