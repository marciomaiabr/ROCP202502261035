package pkgs.pkgExes;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ClassA {
	Lock lockA = new ReentrantLock();
	Lock lockB = new ReentrantLock();

    public void metodo1() {
    	System.out.println("[1][ClassA][metodo1]"+"[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"[lockA="+(lockA)+"]"+"[lockB="+(lockB)+"]");
    	boolean locked = false;
		try {
			locked = lockA.tryLock(3, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	System.out.println("[2][ClassA][metodo1]"+"[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"[locked="+(locked)+"]"+"[lockA="+(lockA)+"]"+"[lockB="+(lockB)+"]");
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
    	System.out.println("[1][ClassA][metodo2]"+"[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"[lockA="+(lockA)+"]"+"[lockB="+(lockB)+"]");
    	boolean locked = false;
		try {
			locked = lockB.tryLock(3, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	System.out.println("[2][ClassA][metodo2]"+"[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"[locked="+(locked)+"]"+"[lockA="+(lockA)+"]"+"[lockB="+(lockB)+"]");
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
    	System.out.println("[1][ClassA][metodoComLockA]"+"[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"[lockA="+(lockA)+"]"+"[lockB="+(lockB)+"]");
    	boolean locked = false;
		try {
			locked = lockA.tryLock(3, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	System.out.println("[2][ClassA][metodoComLockA]"+"[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"[locked="+(locked)+"]"+"[lockA="+(lockA)+"]"+"[lockB="+(lockB)+"]");
        try {
        } finally {
            lockA.unlock();
        }
    }

    private void metodoComLockB() {
    	System.out.println("[1][ClassA][metodoComLockB]"+"[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"[lockA="+(lockA)+"]"+"[lockB="+(lockB)+"]");
    	boolean locked = false;
		try {
			locked = lockB.tryLock(3, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	System.out.println("[2][ClassA][metodoComLockB]"+"[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"[locked="+(locked)+"]"+"[lockA="+(lockA)+"]"+"[lockB="+(lockB)+"]");
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
