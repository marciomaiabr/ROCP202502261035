package pkgs.pkgExes;

import java.lang.management.ManagementFactory;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class SomaArray extends RecursiveTask<Integer> {

	private static Integer tempo = 100;
	private static Integer getTempo() {
		synchronized (tempo) {
			tempo = tempo-10;
		}
		return tempo;
	}

	private static final long serialVersionUID = 1L;

	private int[] array;
    private int inicio, fim;

    public SomaArray(int[] array, int inicio, int fim) {
    	System.out.println("[SomaArray]"+"[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"[this="+(this)+"]"+"[SomaArray(int[] array, int inicio, int fim)]"+"[array="+(array)+"]"+"[inicio="+(inicio)+"]"+"[fim="+(fim)+"]");
        this.array = array;
        this.inicio = inicio;
        this.fim = fim;
    }

    @Override
    protected Integer compute() {
    	Integer r = null;
    	System.out.println("[SomaArray]"+"[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"[this="+(this)+"]"+"[compute()]"+"[array="+(array)+"]"+"[inicio="+(inicio)+"]"+"[fim="+(fim)+"]");
        if (fim - inicio <= 2) {
        	System.out.println("[SomaArray][processando]"+"[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"[this="+(this)+"]");
            int soma = 0;
            for (int i = inicio; i < fim; i++) {
                soma += array[i];
            }
            r = soma;
        } else {
        	System.out.println("[SomaArray][dividindo]"+"[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"[this="+(this)+"]");
            int meio = (inicio + fim) / 2;
            SomaArray tarefa1 = new SomaArray(array, inicio, meio);
            SomaArray tarefa2 = new SomaArray(array, meio, fim);

            tarefa1.fork();
            int resultado2 = tarefa2.compute();
            int resultado1 = tarefa1.join();

            r = resultado1 + resultado2;
        }

        System.out.println("[SomaArray][descansando]"+"[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"[this="+(this)+"]");

    	try {
			Thread.sleep(getTempo()*1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

        System.out.println("[SomaArray][retornando]"+"[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"[this="+(this)+"]");

        return r;
    }

	@Override
	public boolean cancel(boolean mayInterruptIfRunning) {
    	System.out.println("[SomaArray][cancel(boolean mayInterruptIfRunning)]");
		return super.cancel(mayInterruptIfRunning);
	}

	@Override
	public void completeExceptionally(Throwable ex) {
    	System.out.println("[SomaArray][completeExceptionally(Throwable ex)]");
		super.completeExceptionally(ex);
	}

	@Override
	public void complete(Integer value) {
    	System.out.println("[SomaArray][complete(Integer value)]");
		super.complete(value);
	}

	@Override
	public void reinitialize() {
    	System.out.println("[SomaArray][reinitialize()]");
		super.reinitialize();
	}

	@Override
	public boolean tryUnfork() {
    	System.out.println("[SomaArray][tryUnfork()]");
		return super.tryUnfork();
	}

}

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

	boolean podeFinalizarLog = false;

	public void im1(String[] args) {
		System.out.println("Exe001.im1()");

		new Thread(()->{
			while(!podeFinalizarLog) {
		        try {
		        	Runtime.getRuntime().exec("cmd /c \"jstack "+(ManagementFactory.getRuntimeMXBean().getName().split("@")[0])+" >> C:\\Users\\Administrador\\git\\ROCP202502261035\\OCPLearning\\logs\\jstack_log.txt\"");
					Thread.sleep(3*1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}).start();

		int[] array = {1, 2, 3, 4, 5, 6};

        ForkJoinPool pool = new ForkJoinPool();
        System.out.println("[pool="+(pool)+"]"+"[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"");

        SomaArray tarefa = new SomaArray(array, 0, array.length);
        System.out.println("[tarefa="+(tarefa)+"]"+"[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"");

        try {
			Thread.sleep(1*1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

        System.out.println("[pool="+(pool)+"]"+"[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"");
        System.out.println("[tarefa="+(tarefa)+"]"+"[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"");

        System.out.println(""+"[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"[LocalDateTime.now()="+(LocalDateTime.now())+"]"+"[pool.invoke(tarefa)="+(pool.invoke(tarefa))+"]"+"[LocalDateTime.now()="+(LocalDateTime.now())+"]"+"[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]");

        try {
			Thread.sleep(1*1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

        System.out.println("[pool="+(pool)+"]"+"[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"");
        System.out.println("[tarefa="+(tarefa)+"]"+"[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"");

        try {
			Thread.sleep(5*1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

        System.out.println("[pool="+(pool)+"]"+"[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"");
        System.out.println("[tarefa="+(tarefa)+"]"+"[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"");

        podeFinalizarLog = true;
	}

}

/*

*/
