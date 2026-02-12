package pkgs.pkg1;

class ClassAA extends pkgs.pkgExes.ClassA {

	@Override void metodoPackagePrivate() {}
	@Override protected void metodoProtected() {}
	@Override public void metodoPublic() {}

	private void usaMetodos() {
		new pkgs.pkgExes.ClassA().metodoPackagePrivate();
		new pkgs.pkgExes.ClassA().metodoProtected();
		new pkgs.pkgExes.ClassA().metodoPublic();
	}

}

class ClassAB extends pkgs.pkgExes.ClassA {

	private void usaMetodos() {
		metodoPackagePrivate();
		metodoProtected();
		metodoPublic();
	}

}

class ClassAC extends pkgs.pkgExes.ClassA {

	private void usaMetodos(pkgs.pkgExes.ClassA ca) {
		ca.metodoPackagePrivate();
		ca.metodoProtected();
		ca.metodoPublic();
	}

}

class ClassAD {

	private void usaMetodos(pkgs.pkgExes.ClassA ca) {
		ca.metodoPackagePrivate();
		ca.metodoProtected();
		ca.metodoPublic();
	}

}

public class ClassB {

	private void usaMetodos() {
		new pkgs.pkgExes.ClassA().metodoPackagePrivate();
		new pkgs.pkgExes.ClassA().metodoProtected();
		new pkgs.pkgExes.ClassA().metodoPublic();
	}

}
