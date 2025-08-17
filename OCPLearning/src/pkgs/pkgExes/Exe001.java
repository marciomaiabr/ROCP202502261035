package pkgs.pkgExes;

import java.time.LocalDateTime;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Exe001 extends Thread {

	static {
		System.out.println(LocalDateTime.now());
	}

	private String label;

	public Exe001(String label) { this.label = label; }
	@Override
	public String toString() { return ("[Exe001][toString()]"+"[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"[label="+(label)+"]"+"[super.toString()="+(super.toString())+"]"); }

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

	private static final int N = 3;
	public static final CyclicBarrier barrier = new CyclicBarrier(N, () -> {
		System.out.println("[CyclicBarrier][1]"+"[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]");
    });

	public void im1(String[] args) {
		System.out.println("Exe001.im1()");

		System.out.println("[Exe001][im1][1]"+"[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]");

		new Exe001("exe001_1").start();
		new Exe001("exe001_2").start();
		new Exe001("exe001_3").start();

		System.out.println("[Exe001][im1][2]"+"[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]");

	}

	@Override
	public void run() {
		System.out.println("[Exe001][run][1]"+"[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]");
		sleep();
		System.out.println("[Exe001][run][2]"+"[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]");
		try {
			Exe001.barrier.await();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("[Exe001][run][3]"+"[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]");
	}

	public static void sleep() {
		sleep(null);
	}

	public static void sleep(Integer i) {
		try {
			Thread.sleep((i == null ? 1 : i)*1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*

*/
