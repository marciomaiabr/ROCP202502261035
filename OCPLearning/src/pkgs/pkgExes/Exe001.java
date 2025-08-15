package pkgs.pkgExes;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class MaxValueCollection {
	private List<Integer> list = new ArrayList<>();
	private ReentrantReadWriteLock rrwl = new ReentrantReadWriteLock();
	public MaxValueCollection() {
		list.add(0);list.add(1);list.add(5);list.add(10);
	}
	public void add(int i) {
		Lock lock = rrwl.writeLock();
		System.out.println("[1][MaxValueCollection][add(int i)][Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"[lock="+(lock)+"]"+"["+(LocalDateTime.now())+"]");
		lock.lock();
		System.out.println("[2][MaxValueCollection][add(int i)][Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"[lock="+(lock)+"]"+"["+(LocalDateTime.now())+"]");
		try {
			list.add(i);
        	try {
				Thread.sleep(1*1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} finally {
			lock.unlock();
			System.out.println("[3][MaxValueCollection][add(int i)][Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"[lock="+(lock)+"]"+"["+(LocalDateTime.now())+"]");
		}
	}
	public int findMax() {
		Lock lock = rrwl.readLock();
		System.out.println("[1][MaxValueCollection][findMax()][Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"[lock="+(lock)+"]"+"["+(LocalDateTime.now())+"]");
		lock.lock();
		System.out.println("[2][MaxValueCollection][findMax()][Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"[lock="+(lock)+"]"+"["+(LocalDateTime.now())+"]");
		try {
			int i = Collections.max(list);
        	try {
				Thread.sleep(1*1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return i;
		} finally {
			lock.unlock();
			System.out.println("[3][MaxValueCollection][findMax()][Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"[lock="+(lock)+"]"+"["+(LocalDateTime.now())+"]");
		}
	}
}

public class Exe001 {

	static {
		System.out.println(LocalDateTime.now());
	}

	private String label;

	public Exe001(String label) { this.label = label; }
	@Override
	public String toString() { return ("[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"[label="+(label)+"]"+"[super.toString()="+(super.toString())+"]"); }

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

		MaxValueCollection mvc = new MaxValueCollection();

		new Thread(new Runnable() {
            @Override
            public void run() {
            	mvc.add(11);
            }
        }).start();

		new Thread(new Runnable() {
            @Override
            public void run() {
            	mvc.add(12);
            }
        }).start();

		new Thread(new Runnable() {
            @Override
            public void run() {
            	mvc.add(13);
            }
        }).start();

		new Thread(new Runnable() {
            @Override
            public void run() {
            	System.out.println(mvc.findMax());
            }
        }).start();

		new Thread(new Runnable() {
            @Override
            public void run() {
            	System.out.println(mvc.findMax());
            }
        }).start();

		new Thread(new Runnable() {
            @Override
            public void run() {
            	System.out.println(mvc.findMax());
            }
        }).start();

	}

}

/*

*/
