package pkgs.pkgExes;

import java.time.LocalDateTime;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

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

		Lock lockA = new ReentrantLock();
		Lock lockB = new ReentrantLock();

        Thread t1 = new Thread(() -> {
        	lockA.lock();
            try {
            	Thread.sleep(1*1000);
                lockB.lock();
                try {
                } finally {
                    lockB.unlock();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lockA.unlock();
            }
        },"t1");

        Thread t2 = new Thread(() -> {
            lockB.lock();
            try {
            	Thread.sleep(1*1000);
                lockA.lock();
                try {
                } finally {
                    lockA.unlock();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lockB.unlock();
            }
        },"t2");

        t1.start();
        t2.start();
	}

}

/*

*/
