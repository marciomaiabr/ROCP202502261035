package pkgs.pkgExes;

import java.sql.SQLException;

@FunctionalInterface
interface FunctionalInterface1 { String mA(int i1) throws SQLException ; }

@FunctionalInterface
interface FunctionalInterface2 { void mB(int i2); }

public class Exe001 {

	public static void main(String[] args) {

		new Exe001().go();

	}

	private void go() {
		mqqc(v->{return (v*2)+"";});
	}

	private void mqqc(FunctionalInterface1 ff1) {System.out.println("Exe001.mqqcA()");}

	private void mqqc(FunctionalInterface2 ff2) {System.out.println("Exe001.mqqcB()");}

}
