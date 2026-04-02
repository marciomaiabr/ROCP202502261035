package pkgs.pkgExes;

interface FunctionalInterfaceReturnPrimitiveDouble {
	double methodReturnPrimitiveDouble();
}

interface FunctionalInterfaceReturnObjectDouble {
	Double methodReturnObjectDouble();
}

interface FunctionalInterfaceReturnPrimitiveLong {
	long methodReturnPrimitiveLong();
}

interface FunctionalInterfaceReturnObjectLong {
	Long methodReturnObjectLong();
}

interface FunctionalInterfaceReturnPrimitiveInt {
	int methodReturnPrimitiveInt();
}

interface FunctionalInterfaceReturnObjectInteger {
	Integer methodReturnObjectInteger();
}

public class Exe001 {



	public static void main(String[] args) {

		new Exe001().go();

	}

	private void go() {
		FunctionalInterfaceReturnPrimitiveDouble f1 = () -> { double v1 = 500; return v1; };
	}

}
