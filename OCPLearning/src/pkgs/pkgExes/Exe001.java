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
		System.out.println("[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"[Thread.currentThread().getId()="+(Thread.currentThread().getId())+"]");
		new Thread(()->{
			System.out.println("[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"[Thread.currentThread().getId()="+(Thread.currentThread().getId())+"]");
			try {
				Thread.sleep(60*1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}).start();
	}

}

/*

*/
