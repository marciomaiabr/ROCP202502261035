package pkgs.pkgExes;

import java.lang.management.ManagementFactory;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Exe001 {

	static {
		System.out.println(LocalDateTime.now());
	}

	static {
		try {
			Files.list(Paths.get("C:\\Users\\Administrador\\git\\ROCP202502261035\\OCPLearning\\logs\\")).forEach(p->{
				try {
					if(!p.endsWith("logMM.txt"))
						Files.deleteIfExists(p);
				} catch (Exception e) {
					e.printStackTrace();
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static {
		try {
			Runtime.getRuntime().exec("cmd /c \"C:\\Users\\Administrador\\git\\ROCP202502261035\\OCPLearning\\bats\\DirBarraSOnlyClassAndJavaExtensions.bat\"");
		} catch (Exception e) {
			e.printStackTrace();
		}
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
			ExecutorService executorService = Executors.newFixedThreadPool(10);
			System.out.println("[executorService="+(executorService)+"]");
			Future<String> future = executorService.submit(() -> { Thread.sleep(5*1000); return "[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"[hello world]"; });
			Thread.sleep(1*1000);
			executorService.submit(() -> {
				try {
					while(!future.isDone()) {
						Runtime.getRuntime().exec("cmd /c \"jstack "+(ManagementFactory.getRuntimeMXBean().getName().split("@")[0])+" >> C:\\Users\\Administrador\\git\\ROCP202502261035\\OCPLearning\\logs\\jstack_log.txt\"");
						Thread.sleep((long)0.1*1000);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			});
			System.out.println("[executorService="+(executorService)+"]");
			Thread.sleep(1*1000);
			executorService.submit(() -> {
				try {
					System.out.println("[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"[future="+(future)+"]"+"[future.get()="+(future.get())+"]");
				} catch (Exception e) {
					e.printStackTrace();
				}
			});
			System.out.println("[executorService="+(executorService)+"]");
			Thread.sleep(1*1000);
			System.out.println("[executorService="+(executorService)+"]");
			executorService.shutdown();
			System.out.println("[executorService="+(executorService)+"]");
			Thread.sleep(3*1000);
			System.out.println("[executorService="+(executorService)+"]");
		} catch (Exception e) {
			e.printStackTrace();
		}
 	}

}

/*

*/
