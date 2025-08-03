package pkgs.pkgExes;

import java.time.LocalDateTime;

class Calculator implements Runnable {
    int total;

	@Override
	public void run() {
		System.out.println("[Calculator]"+"["+(Thread.currentThread().getName())+"]"+"[run()][aki][1]");
        synchronized(this) {
    		System.out.println("[Calculator]"+"["+(Thread.currentThread().getName())+"]"+"[run()][aki][2]");
            for(int i = 0; i < 100; i++) {
                total += i;
            }
    		System.out.println("[Calculator]"+"["+(Thread.currentThread().getName())+"]"+"[run()][aki][3]");
            notify();
    		System.out.println("[Calculator]"+"["+(Thread.currentThread().getName())+"]"+"[run()][aki][4]");
        }
		System.out.println("[Calculator]"+"["+(Thread.currentThread().getName())+"]"+"[run()][aki][5]");
    }
}

class Reader extends Thread {
	Calculator calculator2;

    public Reader(Calculator pCalculator, String name) {
    	this.calculator2 = pCalculator;
    	setName(name);
    }

	@Override
	public void run() {
		System.out.println("[Reader]"+"["+(Thread.currentThread().getName())+"]"+"[run()][aki][1]");
        synchronized(calculator2) {
    		System.out.println("[Reader]"+"["+(Thread.currentThread().getName())+"]"+"[run()][aki][2]");
            try {
        		System.out.println("[Reader]"+"["+(Thread.currentThread().getName())+"]"+"[run()][aki][3]");
        		calculator2.wait();
        		System.out.println("[Reader]"+"["+(Thread.currentThread().getName())+"]"+"[run()][aki][4]");
            } catch (Exception e) {
            	e.printStackTrace();
            }
    		System.out.println("[Reader]"+"["+(Thread.currentThread().getName())+"]"+"[run()][aki][5]");
        }
    }

    public static void main(String [] args) {
		System.out.println("[Reader][main(String [] args)][aki][1]");
        Calculator calculator1 = new Calculator();
		System.out.println("[Reader][main(String [] args)][aki][2]");
        new Reader(calculator1, "R1").start();
		System.out.println("[Reader][main(String [] args)][aki][3]");
        new Reader(calculator1, "R2").start();
		System.out.println("[Reader][main(String [] args)][aki][4]");
        new Reader(calculator1, "R3").start();
		System.out.println("[Reader][main(String [] args)][aki][5]");
        new Thread(calculator1, "T3").start();
		System.out.println("[Reader][main(String [] args)][aki][6]");
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
		Reader.main(args);
	}

}

/*

*/
