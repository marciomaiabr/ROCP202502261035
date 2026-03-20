package pkgs.pkgExes;

import java.util.function.Supplier;

public class Exe001 {



	public static void main(String[] args) {

		new Exe001().go();

	}

	private void go() {
		int i1 = 1;
		int i11;
		int i111;
		i11 = 11;
		if(java.time.LocalDate.now().getDayOfMonth()==1)
			i111=111;
		else
			i111=112;
		final int i2 = 2;
		final int i22;
		i22 = 22;
		final int i222;
		if(java.time.LocalDate.now().getDayOfMonth()==1)
			i222=222;
		else
			i222=223;
		class ClassA{
			public void m1() {
				System.out.println("\nClassA");
				System.out.println(i1);
				System.out.println(i11);
				System.out.println(i111);
				System.out.println(i2);
				System.out.println(i22);
				System.out.println(i222);
			}
		}
		ClassA ca = new ClassA();
		ca.m1();
		Supplier s = () -> {
			System.out.println("\nSupplier");
			System.out.println(i1);
			System.out.println(i11);
			System.out.println(i111);
			System.out.println(i2);
			System.out.println(i22);
			System.out.println(i222);
			return null;
		};
		s.get();
	}



}
