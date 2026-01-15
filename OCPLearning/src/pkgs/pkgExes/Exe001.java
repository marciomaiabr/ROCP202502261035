package pkgs.pkgExes;

interface InterfaceA<E> { void m1(E e); void m2(Object e); }

public class Exe001 {



	public static void main(String[] args) {



	}

	void m1(InterfaceA<? super Object> ia) {
		ia.m1("");
		ia.m2("");
	}

}
