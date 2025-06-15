package pkgs.pkgExes;

import java.time.LocalDateTime;

class MyLevel1Class1 {
	static class MyLevel2StaticClass1 { public void mqqc() { System.out.println("MyLevel1Class1.MyLevel2StaticClass1.mqqc()"); } }
	class MyLevel2InstanceClass1 { public void mqqc() { System.out.println("MyLevel1Class1.MyLevel2InstanceClass1.mqqc()"); } }
}

public class Exe001 {

	static {
		System.out.println(LocalDateTime.now());
	}

	static class MyLevel2StaticClass2 { public void mqqc() { System.out.println("Exe001.MyLevel2StaticClass2.mqqc()"); } }
	class MyLevel2InstanceClass2 { public void mqqc() { System.out.println("Exe001.MyLevel2InstanceClass2.mqqc()"); } }

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
		new MyLevel1Class1.MyLevel2StaticClass1().mqqc();
		//new MyLevel1Class1.MyLevel2InstanceClass1().mqqc();//compile error//No enclosing instance of type MyLevel1Class1 is accessible. Must qualify the allocation with an enclosing instance of type MyLevel1Class1 (e.g. x.new A() where x is an instance of MyLevel1Class1).
		new MyLevel1Class1().new MyLevel2InstanceClass1().mqqc();
		new MyLevel2StaticClass2().mqqc();
		//new MyLevel2InstanceClass2().mqqc();//compile error//No enclosing instance of type Exe001 is accessible. Must qualify the allocation with an enclosing instance of type Exe001 (e.g. x.new A() where x is an instance of Exe001).
	}

	public void im1(String[] args) {
		System.out.println("Exe001.im1()");
		new MyLevel1Class1.MyLevel2StaticClass1().mqqc();
		//new MyLevel1Class1.MyLevel2InstanceClass1().mqqc();//compile error//No enclosing instance of type MyLevel1Class1 is accessible. Must qualify the allocation with an enclosing instance of type MyLevel1Class1 (e.g. x.new A() where x is an instance of MyLevel1Class1).
		new MyLevel1Class1().new MyLevel2InstanceClass1().mqqc();
		new MyLevel2StaticClass2().mqqc();
		new MyLevel2InstanceClass2().mqqc();
	}

}

/*

*/
