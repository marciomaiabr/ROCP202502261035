package pkgs.pkgExes;

import java.time.LocalDateTime;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Exe001 {

	static {
		System.out.println(LocalDateTime.now());
	}

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
		//System.out.println("[="+()+"]"+"");
	}

	public void im1(String[] args) {
		System.out.println("Exe001.im1()");
		try {
			ExecutorService executorService = Executors.newCachedThreadPool();
			System.out.println("[executorService="+(executorService)+"]");
			Callable<String> callable = new Callable<String>() {
				@Override
				public String call() throws Exception {
					return "hello world";
			}};
			Future<String> future = executorService.submit(callable);
			System.out.println("[future="+(future)+"]"+"[future.get()="+(future.get())+"]");
			executorService.shutdown();
			Thread.sleep(1*1000);
			System.out.println("[executorService="+(executorService)+"]");
		} catch (Exception e) {
			e.printStackTrace();
		}
 	}

}

/*

*/
