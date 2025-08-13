package pkgs.pkgExes;

import java.time.LocalDateTime;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ClassA {
	Lock lockA = new ReentrantLock();
	Lock lockB = new ReentrantLock();

    public void metodo1() {
    	lockA.tryLock();
        try {
        	Thread.sleep(1*1000);
            metodoComLockB();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lockA.unlock();
        }
    }

    public void metodo2() {
        lockB.tryLock();
        try {
        	Thread.sleep(1*1000);
            metodoComLockA();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lockB.unlock();
        }
    }

    private void metodoComLockA() {
        lockA.tryLock();
        try {
        } finally {
            lockA.unlock();
        }
    }

    private void metodoComLockB() {
        lockB.tryLock();
        try {
        } finally {
            lockB.unlock();
        }
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

		ClassA classA = new ClassA();

        Thread t1 = new Thread(() -> classA.metodo1(),"t1");
        Thread t2 = new Thread(() -> classA.metodo2(),"t2");

        t1.start();
        t2.start();
	}

}

/*

*/
