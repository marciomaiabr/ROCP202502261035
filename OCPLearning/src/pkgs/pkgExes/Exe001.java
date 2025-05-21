package pkgs.pkgExes;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;



class Classe1 {}
class Classe2 extends Classe1 {}
class Classe3 extends Classe2 {}
class Classe4 extends Classe3 {}

class Classe5 extends Classe4 {}

class Classe6 extends Classe5 {}
class Classe7 extends Classe6 {}
class Classe8 extends Classe7 {}



public class Exe001 {

	static {
		System.out.println(LocalDateTime.now());
	}

	public static void main(String[] args) {

		try {
			System.out.println("<>");
			m1(args);
			System.out.println("</>");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			Runtime.getRuntime().exec("cmd.exe /c C:\\Users\\Administrador\\git\\ROCP202502261035\\OCPLearning\\logs\\logMM.txt");
		} catch (Exception e) {}

	}

	public static void m1(String[] args) {
		System.out.println("Exe001.m1()");

		List list = null;
		List<Classe5> list5 = null;
		List<Classe3> list3 = null;
		List<Classe7> list7 = null;

		mqqc(list);
		mqqcTudo(list);
		mqqcExtendsClasse5(list);
		mqqcSuperClasse5(list);

		mqqc(list5);
		mqqcTudo(list5);
		mqqcExtendsClasse5(list5);
		mqqcSuperClasse5(list5);

		mqqc(list3);
		mqqcTudo(list3);
		mqqcExtendsClasse5(list3);//compile error because Classe3 not extends Classe5
		mqqcSuperClasse5(list3);

		mqqc(list7);
		mqqcTudo(list7);
		mqqcExtendsClasse5(list7);
		mqqcSuperClasse5(list7);;//compile error because Classe7 is not upper to Classe5

	}

	public static void mqqc(List list) {
		System.out.println("Exe001.mqqc()");
	}

	public static void mqqcTudo(List<?> list) {
		System.out.println("Exe001.mqqcTudo()");
	}

	public static void mqqcExtendsClasse5(List<? extends Classe5> list) {
		System.out.println("Exe001.mqqcExtendsClasse5()");
	}

	public static void mqqcSuperClasse5(List<? super Classe5> list) {
		System.out.println("Exe001.mqqcSuperClasse5()");
	}

}

/*

*/
