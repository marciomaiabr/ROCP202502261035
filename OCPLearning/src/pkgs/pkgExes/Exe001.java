package pkgs.pkgExes;

import java.time.LocalDateTime;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class SumTask extends RecursiveTask<Long> {
	private static final long serialVersionUID = 1L;
	private static final int THRESHOLD = 1000;
    private final int[] array;
    private final int start, end;
    private final String creatorThreadName; // Thread que criou a tarefa

    public SumTask(int[] array, int start, int end, String creatorThreadName) {
        this.array = array;
        this.start = start;
        this.end = end;
        this.creatorThreadName = creatorThreadName;
    }

    @Override
    protected Long compute() {
        String currentThread = Thread.currentThread().getName();

        if (end - start <= THRESHOLD) {
            long sum = 0;
            for (int i = start; i < end; i++) {
                sum += array[i];
            }

            // Detecta roubo de tarefa
            if (!currentThread.equals(creatorThreadName)) {
                System.out.printf(">>> [ROUBO] Tarefa criada por '%s' foi executada por '%s' (%d - %d)%n",
                        creatorThreadName, currentThread, start, end);
            } else {
                System.out.printf("    [OK] Tarefa executada pela thread criadora '%s' (%d - %d)%n",
                        currentThread, start, end);
            }

            return sum;
        } else {
            int mid = (start + end) / 2;

            // Passa o nome da thread atual como criadora
            SumTask left = new SumTask(array, start, mid, currentThread);
            SumTask right = new SumTask(array, mid, end, currentThread);

            left.fork(); // envia a tarefa para o pool (pode ser roubada!)
            long rightResult = right.compute(); // executa diretamente
            long leftResult = left.join(); // espera o resultado da esquerda

            return leftResult + rightResult;
        }
    }
}

public class Exe001 {

	static {
		System.out.println(LocalDateTime.now());
	}

	public static void main(String[] args) {
        int[] array = new int[10_000_000];

        for (int i = 0; i < array.length; i++) {
            array[i] = 1;
        }

        // Use um pool com mais threads para facilitar o roubo
        ForkJoinPool pool = new ForkJoinPool(4);

        SumTask mainTask = new SumTask(array, 0, array.length, Thread.currentThread().getName());

        long startTime = System.currentTimeMillis();
        long result = pool.invoke(mainTask);
        long endTime = System.currentTimeMillis();

        System.out.printf("%nResultado final: %d, Tempo: %d ms%n", result, (endTime - startTime));
	}

}

/*

*/
