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

		Supplier<List<String[]>> fornecePessoas = () -> {
			List<String[]> pessoas = new ArrayList<>();
			pessoas.add("Adriana Fatima Dos Santos Goncalves De Souza;F;15".split(";"));
			pessoas.add("Brenda Cruz Ribeiro;F;18".split(";"));
			pessoas.add("Cristiane Barros;F;21".split(";"));
			pessoas.add("Karla Gomes Alvares Dias;F;17".split(";"));
			pessoas.add("Laianny Carvalho Varao;F;31".split(";"));
			pessoas.add("Manuella Castro;F;18".split(";"));
			pessoas.add("David Ferreira;M;14".split(";"));
			pessoas.add("Eduardo Garcia;M;21".split(";"));
			pessoas.add("Reinaldo Reis;M;40".split(";"));
			pessoas.add("Wander Rodrigues;M;19".split(";"));
			return pessoas;
		};

		Consumer<String[]> printNames = pessoa -> {
			System.out.println('\t'+pessoa[0]);
		};

		System.out.println("\nListagem completa:");
		fornecePessoas.get().forEach(printNames);

		Supplier<List<String[]>> forneceMulheres = () -> {
			Predicate<String[]> predicateMasculino = pessoa -> pessoa[1].equals("M");
			List<String[]> pessoas = fornecePessoas.get();
			pessoas.removeIf(predicateMasculino);
			return pessoas;
		};

		System.out.println("\nSomente sexo feminino:");
		forneceMulheres.get().forEach(printNames);

	}

}

/*

*/
