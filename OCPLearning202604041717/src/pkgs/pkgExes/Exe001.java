package pkgs.pkgExes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

class TimeLog {
	static final DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yyMMddHHmmss.n");
	static String printTime() {return LocalDateTime.now().format(DTF);};
}

class ClassA implements Runnable {
	private String tchutchuca;
	public ClassA(String tchutchuca) {
		this.tchutchuca = tchutchuca;
	}
	@Override
	public void run() {
		System.out.println("["+(TimeLog.printTime())+"]"+"[Thread.currentThread().getId()="+(Thread.currentThread().getId())+"]"+"[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"[this.tchutchuca="+(this.tchutchuca)+"]"+"[->iniciando]");
		try {
			Thread.sleep(70*1000);
		} catch (InterruptedException e) {}
		System.out.println("["+(TimeLog.printTime())+"]"+"[Thread.currentThread().getId()="+(Thread.currentThread().getId())+"]"+"[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"[this.tchutchuca="+(this.tchutchuca)+"]"+"[finalizando->]");
	}
}

public class Exe001 {



	public static void main(String[] args) {

		new Exe001().go();

	}

	private void go() {

		ExecutorService es = Executors.newCachedThreadPool();

		System.out.println('\n'+"["+(TimeLog.printTime())+"]"+"[Thread.currentThread().activeCount()="+(Thread.currentThread().activeCount())+"]");
		System.out.println("["+(TimeLog.printTime())+"]"+"[go()][Thread.currentThread().getId()="+(Thread.currentThread().getId())+"]"+"[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"[aki][1]"+'\n');

		sleep(7*1000);
		Future f1 = es.submit(new ClassA("Ana"));
		System.out.println("["+(TimeLog.printTime())+"]"+"[Thread.currentThread().activeCount()="+(Thread.currentThread().activeCount())+"]");
		sleep(7*1000);
		Future f2 = es.submit(new ClassA("Paula"));
		System.out.println("["+(TimeLog.printTime())+"]"+"[Thread.currentThread().activeCount()="+(Thread.currentThread().activeCount())+"]");
		sleep(7*1000);
		Future f3 = es.submit(new ClassA("Carla"));
		System.out.println("["+(TimeLog.printTime())+"]"+"[Thread.currentThread().activeCount()="+(Thread.currentThread().activeCount())+"]");
		sleep(7*1000);
		Future f4 = es.submit(new ClassA("Bruna"));
		System.out.println("["+(TimeLog.printTime())+"]"+"[Thread.currentThread().activeCount()="+(Thread.currentThread().activeCount())+"]");
		sleep(7*1000);
		Future f5 = es.submit(new ClassA("Bia"));
		System.out.println("["+(TimeLog.printTime())+"]"+"[Thread.currentThread().activeCount()="+(Thread.currentThread().activeCount())+"]");
		sleep(7*1000);
		System.out.println("["+(TimeLog.printTime())+"]"+"[Thread.currentThread().activeCount()="+(Thread.currentThread().activeCount())+"]");

		sleep(7*1000);
		System.out.println('\n'+"temos 5 Threads criadas e ativas");
		System.out.println("["+(TimeLog.printTime())+"]"+"[Thread.currentThread().activeCount()="+(Thread.currentThread().activeCount())+"]"+"[f1.isDone()="+(f1.isDone())+"]"+"[f2.isDone()="+(f2.isDone())+"]"+"[f3.isDone()="+(f3.isDone())+"]"+"[f4.isDone()="+(f4.isDone())+"]"+"[f5.isDone()="+(f5.isDone())+"]");

		sleep(9*7*1000);
		System.out.println('\n'+"temos 5 Threads criadas e nenhuma mais ativa");
		System.out.println("["+(TimeLog.printTime())+"]"+"[Thread.currentThread().activeCount()="+(Thread.currentThread().activeCount())+"]"+"[f1.isDone()="+(f1.isDone())+"]"+"[f2.isDone()="+(f2.isDone())+"]"+"[f3.isDone()="+(f3.isDone())+"]"+"[f4.isDone()="+(f4.isDone())+"]"+"[f5.isDone()="+(f5.isDone())+"]"+'\n');

		sleep(14*1000);
		System.out.println("["+(TimeLog.printTime())+"]"+"[go()][Thread.currentThread().getId()="+(Thread.currentThread().getId())+"]"+"[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"[aki][3]");

		sleep(7*1000);
		System.out.println("["+(TimeLog.printTime())+"]"+"[Thread.currentThread().activeCount()="+(Thread.currentThread().activeCount())+"]");
		sleep(7*1000);
		System.out.println("["+(TimeLog.printTime())+"]"+"[Thread.currentThread().activeCount()="+(Thread.currentThread().activeCount())+"]");
		sleep(7*1000);
		System.out.println("["+(TimeLog.printTime())+"]"+"[Thread.currentThread().activeCount()="+(Thread.currentThread().activeCount())+"]");
		sleep(7*1000);
		System.out.println("["+(TimeLog.printTime())+"]"+"[Thread.currentThread().activeCount()="+(Thread.currentThread().activeCount())+"]");
		sleep(7*1000);
		System.out.println("["+(TimeLog.printTime())+"]"+"[Thread.currentThread().activeCount()="+(Thread.currentThread().activeCount())+"]");
		sleep(7*1000);
		System.out.println("["+(TimeLog.printTime())+"]"+"[Thread.currentThread().activeCount()="+(Thread.currentThread().activeCount())+"]");

		System.out.println('\n'+"temos 1 Thread a "+(Thread.currentThread().getName())+"");
		System.out.println("["+(TimeLog.printTime())+"]"+"[Thread.currentThread().activeCount()="+(Thread.currentThread().activeCount())+"]");

		//es.shutdown();
	}

	static void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
