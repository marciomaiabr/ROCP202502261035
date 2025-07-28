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

	public void im1(String[] args) {
		System.out.println("Exe001.im1()");
		Runnable runnable = () -> {
			for (int x = 1; x <= 3; x++) {
				System.out.println("[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"[x="+(x)+"]");
			}
		};
		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(runnable);
		Thread thread3 = new Thread(runnable);
		thread1.setName("Jalinrabei");
		thread2.setName("Volinraba");
		thread3.setName("Tolinrabano");
		thread1.start();
		thread2.start();
		thread3.start();
	}

}

/*

*/
