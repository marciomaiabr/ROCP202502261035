package pkgs.pkgExes;

class ClassMM {
	int level = 0;
	@Override public String toString() { return "[ClassMM][level="+(level)+"]"; }
}

public class Exe001 {

	class ClassMM {
		int level = 1;
		@Override public String toString() { return "[ClassMM][level="+(level)+"]"; }
	}

	public static void main(String[] args) {

		class ClassMM {
			int level = 2;
			@Override public String toString() { return "[ClassMM][1][level="+(level)+"]"; }
		}

		new Exe001().go();

	}

	void go() {

		class ClassMM {
			int level = 2;
			@Override public String toString() { return "[ClassMM][2][level="+(level)+"]"; }
		}

		ClassMM a = new ClassMM();
		System.out.println(a);

	}

}
