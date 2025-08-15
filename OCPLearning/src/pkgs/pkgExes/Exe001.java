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

    private static final Object obj = new Object();
    private static boolean b = true;

	public void im1(String[] args) {
		System.out.println("Exe001.im1()");

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 3; i++) {
                    synchronized (obj) {
                        while (!b) {
                            try {
                            	obj.wait();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        System.out.println("[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]");
                        b = false;
                        obj.notify();
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
            	for (int i = 1; i <= 3; i++) {
                    synchronized (obj) {
                        while (b) {
                            try {
                            	obj.wait();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        System.out.println("[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]");
                        b = true;
                        obj.notify();
                    }
                }
            }
        }).start();

	}

}

/*

*/
