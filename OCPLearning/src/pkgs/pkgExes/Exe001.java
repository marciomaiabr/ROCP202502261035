package pkgs.pkgExes;

import java.util.Comparator;
import java.util.stream.Stream;

class Pessoa {
	private String nome;
	private int idade;
	private String uf;
	public Pessoa(String nome, int idade, String uf) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.uf = uf;
	}
	@Override public String toString() { return "Pessoa [nome=" + nome + ", idade=" + idade + ", uf=" + uf + "]"; }
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public String getUf() {
		return uf;
	}
}

public class Exe001 {



	public static void main(String[] args) {

		Pessoa [] pessoas = {
				new Pessoa("Ana", 37, "SP"),
				new Pessoa("Lay", 18, "MT"),
				new Pessoa("Carla", 25, "SC"),
				new Pessoa("Julia", 21, "MG"),
				new Pessoa("Bia", 30, "RJ")
		};

		System.out.println();
		Stream.of(pessoas).forEach(System.out::println);
		System.out.println();
		Stream.of(pessoas).sorted((v1,v2)->v1.getNome().compareTo(v2.getNome())).forEach(System.out::println);
		System.out.println();
		//Stream.of(pessoas).sorted(Comparator.comparing(((v1,v2)->v1.getUf().compareTo(v2.getUf())))).forEach(System.out::println);//Lambda expression's signature does not match the signature of the functional interface method apply(T)
		Stream.of(pessoas).sorted(Comparator.comparing((v)->v.getUf())).forEach(System.out::println);
		System.out.println();
		Comparator<Pessoa> comparator = Comparator.comparing(Pessoa::getIdade);
		System.out.println("[comparator="+(comparator)+"]");
		System.out.println();
		Stream.of(pessoas).sorted(Comparator.comparing(Pessoa::getIdade)).forEach(System.out::println);

	}



}
