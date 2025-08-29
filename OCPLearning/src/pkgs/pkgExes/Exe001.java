package pkgs.pkgExes;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class SomaArray extends RecursiveTask<Integer> {

	private static final long serialVersionUID = 1L;

	private int[] array;
    private int inicio, fim;

    public SomaArray(int[] array, int inicio, int fim) {
    	System.out.println("[SomaArray][SomaArray(int[] array, int inicio, int fim)]"+"[inicio="+(inicio)+"]"+"[fim="+(fim)+"]");
        this.array = array;
        this.inicio = inicio;
        this.fim = fim;
    }

    @Override
    protected Integer compute() {
    	System.out.println("[SomaArray][compute()]"+"[array="+(array)+"]"+"[inicio="+(inicio)+"]"+"[fim="+(fim)+"]");
        int soma = 0;
        for (int i = inicio; i < fim; i++) {
            soma += array[i];
        }
        return soma;
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

	public void im1(String[] args) {
		System.out.println("Exe001.im1()");
        int[] array = {1, 2, 3, 4, 5, 6};

        ForkJoinPool pool = new ForkJoinPool();
        SomaArray tarefa = new SomaArray(array, 0, array.length);

		System.out.println("[pool.invoke(tarefa)="+(pool.invoke(tarefa))+"]"+"");
 	}

}

/*

*/
