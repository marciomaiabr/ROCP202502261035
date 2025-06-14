package pkgs.pkgExes;

import java.time.LocalDateTime;

class ClassA { public String mqqc1() { return "ClassA.mqqc1"; } }

public class Exe001 {

	static {
		System.out.println(LocalDateTime.now());
	}

	public static void main(String[] args) {

		try {
			System.out.println("<>");
			sm1(args);
			new Exe001().im1(args);
			System.out.println("</>");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			Runtime.getRuntime().exec("cmd.exe /c C:\\Users\\Administrador\\git\\ROCP202502261035\\OCPLearning\\logs\\logMM.txt");
		} catch (Exception e) {}

	}

	public static void sm1(String[] args) {
		System.out.println("Exe001.sm1()");
	}

	public void im1(String[] args) {
		System.out.println("Exe001.im1()");
		qqc1(args);
	}

	String str = "s";

	public void qqc1(String[] args) {
		System.out.println("Exe001.qqc1()");

		class MyLevel1Class1 extends ClassA {
			private Integer integerX = 1;
			@Override
			public String mqqc1() { return "MyLevel1Class1.mqqc1"; }
			@Override
			public String toString() {
				str = "z";
				String retorno = "["
						+"[this.getClass().getCanonicalName()="+(this.getClass().getCanonicalName())+"]"
						+"[getClass().getCanonicalName()="+(getClass().getCanonicalName())+"]"
						+"[this.integerX="+(this.integerX)+"]"
						+"[integerX="+(integerX)+"]"
						+"[this.mqqc1()="+(this.mqqc1())+"]"
						+"[mqqc1()="+(mqqc1())+"]"
						+"[super.mqqc1()="+(super.mqqc1())+"]"
						+"[str="+(str)+"]"
						+"\n"+"]";
				retorno = retorno.replaceAll("\\[", "\n\t"+"\\[");
				return retorno;
			}

		}

		MyLevel1Class1 myLevel1Class1 = new MyLevel1Class1();
		System.out.println("[myLevel1Class1]"+myLevel1Class1);

	}

}

/*

*/
