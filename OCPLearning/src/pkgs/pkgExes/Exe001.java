package pkgs.pkgExes;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class SomaTask extends RecursiveTask<Integer> {

	private int[] array;
	private int inicio, fim;
	private static final int LIMITE = 3;

	SomaTask(int[] array, int inicio, int fim) {
		this.array = array;
		this.inicio = inicio;
		this.fim = fim;
	}

	@Override
	protected Integer compute() {
		if (fim - inicio <= LIMITE) {
			int soma = 0;
			for (int i = inicio; i < fim; i++) {
				soma += array[i];
			}
			return soma;
		} else {
			int meio = (inicio + fim) / 2;

			SomaTask esquerda = new SomaTask(array, inicio, meio);
			SomaTask direita = new SomaTask(array, meio, fim);

			esquerda.fork();// executa em paralelo
			int resultadoDireita = direita.compute(); 
			int resultadoEsquerda = esquerda.join();

			return resultadoEsquerda + resultadoDireita;
		}
	}
}

public class Exe001 {



	public static void main(String[] args) {

		int [] array = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(new ForkJoinPool().invoke(new SomaTask(array, 0, array.length)));;

	}



}
