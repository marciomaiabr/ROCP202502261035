package pkgs.pkgExes;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
		System.out.println("no sorted");
		Stream.of(9,0,8,1,7,2,6,3,5,4).forEach(System.out::println);
		System.out.println("\nsorted");
		Stream.of(9,0,8,1,7,2,6,3,5,4).sorted().forEach(System.out::println);

		class Pessoa {
			private String nome;
			private Integer idade;
			public Pessoa(String nome, Integer idade) { super(); this.nome = nome; this.idade = idade; }
			@Override
			public String toString() { return "Pessoa [idade=" + idade + ", nome=" + nome + "]"; }
		}
		/*Stream.of(
				new Pessoa("Aline Sharlon Ramos",39), new Pessoa("Brenda Cruz Ribeiro",15), new Pessoa("Cristiane Barros",18)
				).sorted().forEach(System.out::println);//java.lang.ClassCastException: pkgs.pkgExes.Exe001$1Pessoa cannot be cast to java.lang.Comparable*/

		class PessoaComparable implements Comparable<PessoaComparable> {
			private String nome;
			private Integer idade;
			public PessoaComparable(String nome, Integer idade) { super(); this.nome = nome; this.idade = idade; }
			@Override
			public String toString() { return "PessoaComparable [idade=" + idade + ", nome=" + nome + "]"; }
			@Override
			public int compareTo(PessoaComparable pessoaComparable) {
				return this.idade.compareTo(pessoaComparable.idade);
			}
		}
		Stream.of(new PessoaComparable("Aline Sharlon Ramos",39), new PessoaComparable("Brenda Cruz Ribeiro",15), new PessoaComparable("Cristiane Barros",18)).sorted().forEach(System.out::println);

		Stream.of(
				new Pessoa("Aline Sharlon Ramos",39), new Pessoa("Brenda Cruz Ribeiro",15), new Pessoa("Cristiane Barros",18)
				).sorted((Pessoa pessoa1, Pessoa pessoa2) -> pessoa1.idade.compareTo(pessoa2.idade)).forEach(System.out::println);

	}

}

/*

*/
