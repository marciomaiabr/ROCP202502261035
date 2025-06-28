package pkgs.pkgExes;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

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

		List<Integer> numeros = new ArrayList<>();
		for (int i = 0; i <= 15; i++)
			numeros.add(i);

		System.out.println("Listagem completa\n\t"+numeros);

		Predicate<Integer> predicateMenorIgualTres = numero -> numero <= 2;
		numeros.removeIf(predicateMenorIgualTres);
		System.out.println("Exemplo usando Predicate\n\t"+numeros);

		Predicate<Integer> predicateMenorIgualCinco = numero -> numero <= 5;
		Predicate<Integer> predicateMaiorQueDez = numero -> numero > 10;
		numeros.removeIf(predicateMenorIgualCinco.or(predicateMaiorQueDez));
		System.out.println("Exemplo usando Predicate com \"or\" \n\t"+numeros);

		Predicate<Integer> predicateMenorIgualNove = numero -> numero <= 9;
		Predicate<Integer> predicateMaiorQueSeis = numero -> numero > 6;
		numeros.removeIf(predicateMaiorQueSeis.and(predicateMenorIgualNove));
		System.out.println("Exemplo usando Predicate com \"and\" \n\t"+numeros);

		Predicate<Integer> predicateIgualDez = numero -> numero == 10;
		numeros.removeIf(predicateIgualDez.negate());
		System.out.println("Exemplo usando Predicate com \"negate\" \n\t"+numeros);

	}

}

/*

*/
