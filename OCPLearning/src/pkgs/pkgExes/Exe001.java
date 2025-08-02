package pkgs.pkgExes;

import java.time.LocalDateTime;

class InstancePrinter{
	private String instanceName;
	InstancePrinter(String instanceName){
		this.instanceName = instanceName;
	}
	public synchronized void print() {
		System.out.println("[InstancePrinter][instanceName="+(instanceName)+"][start]");
		try {
			Thread.sleep(5*1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("[InstancePrinter][instanceName="+(instanceName)+"][end]");
	}
}

class StaticPrinter{
	public synchronized static void print() {
		System.out.println("[StaticPrinter][start]");
		try {
			Thread.sleep(5*1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("[StaticPrinter][end]");
	}
}

class ThreadMM extends Thread {
	private InstancePrinter instancePrinter;
	private String name;
	public ThreadMM(String name, InstancePrinter instancePrinter) {
		super(name);
		this.name = name;
		this.instancePrinter = instancePrinter;
	}
	@Override
	public void run() {
		System.out.println("["+(name)+"][run][start]");
		if(instancePrinter == null){
			StaticPrinter.print();
		}else{
			instancePrinter.print();
		}
		System.out.println("["+(name)+"][run][end]");
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
		/*testar com instancias diferente de impressoras e mesma Thread
		testar com instancias diferente de impressoras e instancias diferente de Thread
		testar com mesma instancias de impressoras e diferente Thread*/
		InstancePrinter ip = new InstancePrinter("ip");
		Thread t = new Thread(()->{
			ip.print();
		}, "t");
	}

}

/*

*/
