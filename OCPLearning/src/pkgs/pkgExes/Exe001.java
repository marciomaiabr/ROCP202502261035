package pkgs.pkgExes;

class ClassA {
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class Exe001 {

	ClassA classA;

	public static void main(String[] args) {

	}

	void m(ClassA classA) throws Exception {
		this.classA = (ClassA) classA.clone();
	}

}
