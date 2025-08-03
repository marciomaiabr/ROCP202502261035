package pkgs.pkgExes;

import java.time.LocalDateTime;

class ThreadMM extends Thread{
	@Override
	public void run() {
		System.out.println("[ThreadMM][run()][aki][1]");
		try {
			System.out.println("[ThreadMM][run()][aki][2]");
			Thread.sleep(5*1000);
			System.out.println("[ThreadMM][run()][aki][3]");
			synchronized(this) {
				System.out.println("[ThreadMM][run()][aki][3][1]");
				notify();
				System.out.println("[ThreadMM][run()][aki][3][2]");
			}
			System.out.println("[ThreadMM][run()][aki][4]");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("[ThreadMM][run()][aki][5]");
	}
}

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
		try {
			System.out.println("[Exe001][im1(String[] args)][aki][1]");
			ThreadMM threadMM = new ThreadMM();
			System.out.println("[Exe001][im1(String[] args)][aki][2]");
			threadMM.start();
			System.out.println("[Exe001][im1(String[] args)][aki][3]");
			synchronized(threadMM) {
				System.out.println("[Exe001][im1(String[] args)][aki][4]");
				threadMM.wait();
				System.out.println("[Exe001][im1(String[] args)][aki][5]");
			}
			System.out.println("[Exe001][im1(String[] args)][aki][6]");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*

*/
