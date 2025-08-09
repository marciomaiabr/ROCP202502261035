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
		Object object3 = new Object();
		Object object4 = new Object();

		new Thread(()->{
			log(1);
			sleep(1000);
	        synchronized (object1) {
	        	log(2);
				sleep(1000);
	            synchronized (object2) {
	            	log(3);
	    			sleep(1000);
		            synchronized (object3) {
		            	log(4);
		    			sleep(1000);
			            synchronized (object4) {
			            	log(5);
			    			sleep(1000);
			            }
		            }
	            }
	        }
	    }).start();

		new Thread(()->{
			log(1);
			sleep(1000);
	        synchronized (object4) {
	        	log(2);
				sleep(1000);
	            synchronized (object3) {
	            	log(3);
	    			sleep(1000);
		            synchronized (object2) {
		            	log(4);
		    			sleep(1000);
			            synchronized (object1) {
			            	log(5);
			    			sleep(1000);
			            }
		            }
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
"Thread-1" #15 prio=5 os_prio=0 tid=0x0000026ebf6be800 nid=0x1948 waiting for monitor entry [0x00000087672ff000]
   java.lang.Thread.State: BLOCKED (on object monitor)
        at pkgs.pkgExes.Exe001.lambda$1(Exe001.java:78)
        - waiting to lock <0x00000000e08d32c8> (a java.lang.Object)
        - locked <0x00000000e08d32d8> (a java.lang.Object)
        - locked <0x00000000e08d32e8> (a java.lang.Object)
        at pkgs.pkgExes.Exe001$$Lambda$5/1864350231.run(Unknown Source)
        at java.lang.Thread.run(Thread.java:750)

"Thread-0" #14 prio=5 os_prio=0 tid=0x0000026ebf6be000 nid=0x1868 waiting for monitor entry [0x00000087671ff000]
   java.lang.Thread.State: BLOCKED (on object monitor)
        at pkgs.pkgExes.Exe001.lambda$0(Exe001.java:57)
        - waiting to lock <0x00000000e08d32d8> (a java.lang.Object)
        - locked <0x00000000e08d32c8> (a java.lang.Object)
        - locked <0x00000000e08d32b8> (a java.lang.Object)
        at pkgs.pkgExes.Exe001$$Lambda$4/1050349584.run(Unknown Source)
        at java.lang.Thread.run(Thread.java:750)
*/
