package pkgs.pkgExes;

class ClassA { public void mca() {} }
class ClassB extends ClassA {}

interface InterfaceA { default public void mia() {} }

public class Exe001 extends ClassB implements InterfaceA {

	public static void main(String[] args) {
		new Exe001().m();
	}

	public void m() {
		super.mca();
		//super.mia();//The method mia() is undefined for the type ClassB
		InterfaceA.super.mia();
	}

}
