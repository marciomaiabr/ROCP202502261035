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

	public void im1(String[] args) {
		System.out.println("Exe001.im1()");

		ExecutorService executorService = null;

		executorService = Executors.newCachedThreadPool();
		System.out.println("[Exe001][im1][1][Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"[executorService="+(executorService)+"]");

		executorService.execute(()->{
			System.out.println("[ExecutorService][executorService][Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]");
		});

		System.out.println("[Exe001][im1][2][Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"[executorService="+(executorService)+"]");

		try {
			Thread.sleep(60*1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("[Exe001][im1][3][Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"[executorService="+(executorService)+"]");

	}

}

/*

*/
