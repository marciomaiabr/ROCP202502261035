package pkgs.pkgExes;

import java.time.LocalDateTime;

class ClassA { public String mqqc1() { return "ClassA.mqqc1"; } }
class ClassB { public String mqqc1() { return "ClassB.mqqc1"; } }
class ClassC { public String mqqc1() { return "ClassC.mqqc1"; } }

class MyLevel1Class1 extends ClassA {
	private Integer integerX = 1;
	@Override
	public String mqqc1() { return "MyLevel1Class1.mqqc1"; }
	@Override
	public String toString() {
		String retorno = "["
				+"[this.getClass().getCanonicalName()="+(this.getClass().getCanonicalName())+"]"
				+"[getClass().getCanonicalName()="+(getClass().getCanonicalName())+"]"
				+"[this.integerX="+(this.integerX)+"]"
				+"[integerX="+(integerX)+"]"
				+"[this.mqqc1()="+(this.mqqc1())+"]"
				+"[mqqc1()="+(mqqc1())+"]"
				+"[super.mqqc1()="+(super.mqqc1())+"]"
				+"\n"+"]";
		retorno = retorno.replaceAll("\\[", "\n\t"+"\\[");
		return retorno;
	}

	class MyLevel2Class1 extends ClassB {
		private Integer integerX = 2;
		@Override
		public String mqqc1() { return "MyLevel2Class1.mqqc1"; }
		@Override
		public String toString() {
			String retorno = "["
					+"[this.getClass().getCanonicalName()="+(this.getClass().getCanonicalName())+"]"
					+"[getClass().getCanonicalName()="+(getClass().getCanonicalName())+"]"
					+"[MyLevel1Class1.this.getClass().getCanonicalName()="+(MyLevel1Class1.this.getClass().getCanonicalName())+"]"
					+"[this.integerX="+(this.integerX)+"]"
					+"[integerX="+(integerX)+"]"
					+"[MyLevel1Class1.this.integerX="+(MyLevel1Class1.this.integerX)+"]"
					+"[MyLevel1Class1.this="+(MyLevel1Class1.this)+"]"
					+"[this.mqqc1()="+(this.mqqc1())+"]"
					+"[mqqc1()="+(mqqc1())+"]"
					+"[MyLevel1Class1.this.mqqc1()="+(MyLevel1Class1.this.mqqc1())+"]"
					+"[super.mqqc1()="+(super.mqqc1())+"]"
					+"[MyLevel1Class1.super.mqqc1()="+(MyLevel1Class1.super.mqqc1())+"]"
					+"\n"+"]";
			retorno = retorno.replaceAll("\\[", "\n\t"+"\\[");
			return retorno;
		}

		class MyLevel3Class1 extends ClassC {
			private Integer integerX = 3;
			@Override
			public String mqqc1() { return "MyLevel3Class1.mqqc1"; }
			@Override
			public String toString() {
				String retorno = "["
						+"[this.getClass().getCanonicalName()="+(this.getClass().getCanonicalName())+"]"
						+"[getClass().getCanonicalName()="+(getClass().getCanonicalName())+"]"
						+"[MyLevel1Class1.this.getClass().getCanonicalName()="+(MyLevel1Class1.this.getClass().getCanonicalName())+"]"
						+"[MyLevel2Class1.this.getClass().getCanonicalName()="+(MyLevel2Class1.this.getClass().getCanonicalName())+"]"
						+"[this.integerX="+(this.integerX)+"]"
						+"[integerX="+(integerX)+"]"
						+"[MyLevel1Class1.this.integerX="+(MyLevel1Class1.this.integerX)+"]"
						+"[MyLevel2Class1.this.integerX="+(MyLevel2Class1.this.integerX)+"]"
						+"[MyLevel1Class1.this="+(MyLevel1Class1.this)+"]"
						+"[MyLevel2Class1.this="+(MyLevel2Class1.this)+"]"
						+"[this.mqqc1()="+(this.mqqc1())+"]"
						+"[mqqc1()="+(mqqc1())+"]"
						+"[MyLevel1Class1.this.mqqc1()="+(MyLevel1Class1.this.mqqc1())+"]"
						+"[MyLevel2Class1.this.mqqc1()="+(MyLevel2Class1.this.mqqc1())+"]"
						+"[super.mqqc1()="+(super.mqqc1())+"]"
						+"[MyLevel1Class1.super.mqqc1()="+(MyLevel1Class1.super.mqqc1())+"]"
						+"[MyLevel2Class1.super.mqqc1()="+(MyLevel2Class1.super.mqqc1())+"]"
						+"\n"+"]";
				retorno = retorno.replaceAll("\\[", "\n\t"+"\\[");
				return retorno;
			}

		}

	}

}

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
		MyLevel1Class1 myLevel1Class1 = new MyLevel1Class1();
		//System.out.println("[myLevel1Class1]"+myLevel1Class1);
		MyLevel1Class1.MyLevel2Class1 myLevel2Class1 = myLevel1Class1.new MyLevel2Class1();
		//System.out.println("[myLevel2Class1]"+myLevel2Class1);
		MyLevel1Class1.MyLevel2Class1.MyLevel3Class1 myLevel3Class1 = myLevel2Class1.new MyLevel3Class1();
		System.out.println("[myLevel3Class1]"+myLevel3Class1);
	}

}

/*

*/
