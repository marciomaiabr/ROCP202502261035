package pkgs.pkgExes;

import java.time.LocalDateTime;
import java.util.concurrent.CyclicBarrier;

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

		System.out.println("[Exe001][im1][Thread.currentThread().getName()="+(Thread.currentThread().getName())+"][1]");

		CyclicBarrier barrier = new CyclicBarrier(3, () -> {
            System.out.println("[CyclicBarrier][Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]");
        });

		System.out.println("[Exe001][im1][Thread.currentThread().getName()="+(Thread.currentThread().getName())+"][2]");

		Runnable runnable = ()->{
			System.out.println("[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"][1]");
			try {
				Thread.sleep(1*1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"][2]");
			try {
				barrier.await();
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"][3]");
		};

		System.out.println("[Exe001][im1][Thread.currentThread().getName()="+(Thread.currentThread().getName())+"][3]");

		new Thread(runnable,"t1").start();
		new Thread(runnable,"t2").start();
		new Thread(runnable,"t3").start();

		System.out.println("[Exe001][im1][Thread.currentThread().getName()="+(Thread.currentThread().getName())+"][4]");
	}

}

/*

*/
