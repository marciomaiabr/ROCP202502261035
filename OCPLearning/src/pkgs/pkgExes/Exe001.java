package pkgs.pkgExes;

import java.time.LocalDateTime;

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

    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

	public void im1(String[] args) {
		System.out.println("Exe001.im1()");

		Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1: Segurando lock1...");

                try { Thread.sleep(100); } catch (InterruptedException e) {}

                System.out.println("Thread 1: Esperando lock2...");
                synchronized (lock2) {
                    System.out.println("Thread 1: Segurando lock1 e lock2.");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2: Segurando lock2...");

                try { Thread.sleep(100); } catch (InterruptedException e) {}

                System.out.println("Thread 2: Esperando lock1...");
                synchronized (lock1) {
                    System.out.println("Thread 2: Segurando lock2 e lock1.");
                }
            }
        });

        thread1.start();
        thread2.start();
	}

	public static void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*

*/
