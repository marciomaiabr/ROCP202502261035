package pkgs.pkgExes;

import java.time.LocalDateTime;

class RecursoA {
	public synchronized void mA1(RecursoB b) {
		try {
			Thread.sleep(1*1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		b.mB1();
	}
	public synchronized void mA2() {}
}

class RecursoB {
	public synchronized void mB1() {
		try {
			Thread.sleep(1*1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public synchronized void mB2(RecursoA a) {
		try {
			Thread.sleep(1*1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		a.mA2();
	}
}

public class Exe001 {

	static {
		System.out.println(LocalDateTime.now());
	}

	private String label;

	public Exe001(String label) { this.label = label; }
	@Override
	public String toString() { return ("[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"[label="+(label)+"]"+"[super.toString()="+(super.toString())+"]"); }

	public static void main(String[] args) {

		try {
			System.out.println("<>");
			sm1(args);
			Exe001 exe001 = new Exe001("exe001");
			exe001.im1(args);
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
        /*RecursoA recursoA = new RecursoA();
        RecursoB recursoB = new RecursoB();*/

        /*new Thread(() -> {
        	recursoA.mA1(recursoB);
        }).start();
        new Thread(() -> {
        	recursoB.mB2(recursoA);
        }).start();*/

        /*new Thread(() -> {
        	synchronized (recursoA) {
        		try { Thread.sleep(1*1000); } catch (Exception e) {}
        			synchronized (recursoB) {}
        	}
        }).start();

        new Thread(() -> {
        	synchronized (recursoB) {
        		try { Thread.sleep(1*1000); } catch (Exception e) {}
        			synchronized (recursoA) {}
        	}
        }).start();*/

        new Thread(() -> {
        	synchronized (RecursoA.class) {
        		try { Thread.sleep(1*1000); } catch (Exception e) {}
        			synchronized (RecursoB.class) {}
        	}
        }).start();

        new Thread(() -> {
        	synchronized (RecursoB.class) {
        		try { Thread.sleep(1*1000); } catch (Exception e) {}
        			synchronized (RecursoA.class) {}
        	}
        }).start();

	}

}

/*

*/
