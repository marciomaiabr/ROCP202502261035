package pkgs.pkgExes;

interface InterfaceA { default void mia() {}; }

class ClassA { void mca() {} }

public class Exe001 extends ClassA implements InterfaceA {

	public static void main(String[] args) {
	}

	void mia() {}//mesmo sem o @Override o erro existe

	//@Override
	public void qqc() {}//o erro ocorre por causa  do @Override , tanto é que se vc tirar o erro para

}
