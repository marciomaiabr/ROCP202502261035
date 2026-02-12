package pkgs.pkgExes;

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

public class ClassA2 {

	private void usaMetodos() {
		new pkgs.pkgExes.ClassA().metodoPackagePrivate();
		new pkgs.pkgExes.ClassA().metodoProtected();
		new pkgs.pkgExes.ClassA().metodoPublic();
	}

}
