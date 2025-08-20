package pkgs.pkgExes;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exe001 {

	private String stringExe001Name;

	static {
		System.out.println(LocalDateTime.now());
	}

	public Exe001() {}

	public Exe001(String stringExe001Name) { this.stringExe001Name = stringExe001Name; }

	@Override
	public String toString() { return ("[Exe001][stringExe001Name="+(stringExe001Name)+"][toString()][Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"[super.toString()="+(super.toString())+"]"); }

	public static void main(String[] args) {

		try {
			System.out.println("<>");
			sm1(args);
			Exe001 exe001 = new Exe001();
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

    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

	public void im1(String[] args) {
		System.out.println("Exe001.im1()");

		ExecutorService executorService = null;

		executorService = Executors.newCachedThreadPool();
		System.out.println("[Exe001][im1][1][Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"[executorService="+(executorService)+"]");

		executorService.execute(()->{
            synchronized (lock1) {
                System.out.println("Thread 1: Segurando lock1...");

				try {
					Thread.sleep(1 * 1000);
				} catch (Exception e) {
					e.printStackTrace();
				}

                System.out.println("Thread 1: Esperando lock2...");
                synchronized (lock2) {
                    System.out.println("Thread 1: Segurando lock1 e lock2.");
                }
            }
		});

		System.out.println("[Exe001][im1][2][Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"[executorService="+(executorService)+"]");

		executorService.execute(()->{
            synchronized (lock2) {
                System.out.println("Thread 2: Segurando lock2...");

				try {
					Thread.sleep(1 * 1000);
				} catch (Exception e) {
					e.printStackTrace();
				}

                System.out.println("Thread 2: Esperando lock1...");
                synchronized (lock1) {
                    System.out.println("Thread 2: Segurando lock2 e lock1.");
                }
            }
		});

		System.out.println("[Exe001][im1][3][Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"[executorService="+(executorService)+"]");

		try {
			Thread.sleep(65 * 1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("[Exe001][im1][4][Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"[executorService="+(executorService)+"]");

	}

}

/*

*/
