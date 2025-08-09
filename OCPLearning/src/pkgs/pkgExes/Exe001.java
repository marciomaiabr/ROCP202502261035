package pkgs.pkgExes;

import java.time.LocalDateTime;

public class Exe001 {

	static {
		System.out.println(LocalDateTime.now());
	}

	private String label;

	public Exe001(String label) { this.label = label; }
	@Override
	public String toString() { return ("[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"[label="+(label)+"]"); }

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

		Object object1 = new Object();
		Object object2 = new Object();

		new Thread(()->{
			log(1);
			sleep(1000);
	        synchronized (object1) {
	        	log(2);
				sleep(1000);
	            synchronized (object2) {
	            	log(3);
	    			sleep(1000);
	            }
	        }
	    }).start();

		new Thread(()->{
			log(1);
			sleep(1000);
	        synchronized (object2) {
	        	log(2);
				sleep(1000);
	            synchronized (object1) {
	            	log(3);
	    			sleep(1000);
	            }
	        }
	    }).start();

	}

	private void log(int point) {
		System.out.println("[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"[point="+(point)+"]");
	}
	public static void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (Exception e) {
			throw new RuntimeException("falha no sleep", e);
		}
	}

}

/*
jps
https://docs.oracle.com/javase/8/docs/technotes/tools/unix/jps.html
jconsole
https://docs.oracle.com/javase/8/docs/technotes/guides/management/jconsole.html
jstack
https://docs.oracle.com/javase/8/docs/technotes/tools/unix/jstack.html
*/

/*
https://docs.oracle.com/javase/8/docs/technotes/tools/unix/jstack.html
https://www.baeldung.com/java-thread-dump
https://docs.oracle.com/en/java/javase/11/tools/jps.html
https://docs.oracle.com/javacomponents/jmc-5-5/jmc-user-guide/intro.htm#JMCCI109
https://docs.oracle.com/javase/8/docs/technotes/tools/unix/jvisualvm.html
https://docs.oracle.com/en/java/javase/11/tools/jcmd.html
https://docs.oracle.com/en/java/javase/11/management/using-jconsole.html#GUID-BC433FB0-51AD-4DF9-9BAF-FF6449509245
https://docs.oracle.com/en/java/javase/11/docs/api/java.management/java/lang/management/LockInfo.html
https://www.baeldung.com/java-management-extensions
https://atitudereflexiva.wordpress.com/2016/02/10/extracao-do-stack-trace-de-processos-java-com-jstack/
*/
