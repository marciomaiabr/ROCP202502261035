package pkgs.pkgExes;

public class Exe001 {

	public static void main(String[] args) {

		try {
			go8(args);
			//new Exe001().go6(args);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public synchronized static void go8(String[] args) throws InterruptedException {
	    /*Thread t = new Thread();
	    t.start();*/
	    System.out.print("X");
	    //t.wait(10000);
    	Exe001.class.wait(10000);
	    System.out.print("Y");
	}

	public static void go7(String[] args) throws InterruptedException {
	    /*Thread t = new Thread();
	    t.start();*/
	    System.out.print("X");
	    //t.wait(10000);
	    synchronized(Exe001.class) {
	    	Exe001.class.wait(10000);
	    }
	    System.out.print("Y");
	}

	public synchronized void go6(String[] args) throws InterruptedException {
	    /*Thread t = new Thread();
	    t.start();*/
	    System.out.print("X");
	    //t.wait(10000);
	    synchronized(this) {
	    	Thread.currentThread().wait(10000);
	    }
	    System.out.print("Y");
	}

	public void go5(String[] args) throws InterruptedException {
	    /*Thread t = new Thread();
	    t.start();*/
	    System.out.print("X");
	    //t.wait(10000);
	    synchronized(Thread.currentThread()) {
	    	Thread.currentThread().wait(10000);
	    }
	    System.out.print("Y");
	}

	public void go4(String[] args) throws InterruptedException {
	    /*Thread t = new Thread();
	    t.start();*/
	    System.out.print("X");
	    //t.wait(10000);
	    Thread.currentThread().wait(10000);
	    System.out.print("Y");
	}

	public synchronized void go3(String[] args) throws InterruptedException {
	    /*Thread t = new Thread();
	    t.start();*/
	    System.out.print("X");
	    //t.wait(10000);
	    Thread.currentThread().wait(10000);
	    System.out.print("Y");
	}

	public static synchronized void go2(String[] args) throws InterruptedException {
	    /*Thread t = new Thread();
	    t.start();*/
	    System.out.print("X");
	    //t.wait(10000);
	    Thread.currentThread().wait(10000);
	    System.out.print("Y");
	}

	public static synchronized void go(String[] args) throws InterruptedException {
	    Thread t = new Thread();
	    t.start();
	    System.out.print("X");
	    t.wait(10000);
	    System.out.print("Y");
	}

}
