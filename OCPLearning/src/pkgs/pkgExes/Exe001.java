package pkgs.pkgExes;

import java.util.Objects;
import java.util.PriorityQueue;

class Pessoa implements Comparable<Pessoa> {
	private long id;
	private String nome;
	private Integer idade;
	public Pessoa(long id, String nome, Integer idade) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
	}
	@Override public String toString() { return "Pessoa [id=" + id + ", nome=" + nome + ", idade=" + idade + "]"; }
	@Override public int compareTo(Pessoa pessoa) { int intCompareTo = this.idade.compareTo(pessoa.idade); System.out.println("[intCompareTo="+(intCompareTo)+"]"); return intCompareTo; }
	@Override public int hashCode() { int intHashCode = Objects.hash(id); System.out.println("[intHashCode="+(intHashCode)+"]"); return intHashCode; }
	@Override
	public boolean equals(Object obj) {
		System.out.println("Pessoa.equals()");
		if (obj == null) return false;
		if ( !(obj instanceof Pessoa) ) return false;
		if (this == obj) return true;
		return (new Long(id).equals(((Pessoa)obj).id));
	}
}

public class Exe001 {

	public static void main(String[] args) {

		Pessoa pessoa1lPessoaA17 = new Pessoa(1l, "PessoaA", 17);
		Pessoa pessoa2lPessoaB21 = new Pessoa(2l, "PessoaB", 21);
		Pessoa pessoa3lPessoaC19 = new Pessoa(3l, "PessoaC", 19);
		Pessoa pessoa4lPessoaD40 = new Pessoa(4l, "PessoaD", 40);

		PriorityQueue<Pessoa> pq = new PriorityQueue<Pessoa>();

		System.out.println("pq.add(pessoa1lPessoaA17)");
		System.out.println(pq.add(pessoa1lPessoaA17));
		System.out.println("pq.add(pessoa2lPessoaB21)");
		System.out.println(pq.add(pessoa2lPessoaB21));
		System.out.println("pq");
		System.out.println(pq);
		System.out.println();
		System.out.println("pq.peek()");
		System.out.println(pq.peek());
		System.out.println("pq");
		System.out.println(pq);
		System.out.println();
		System.out.println("pq.offer(pessoa3lPessoaC19)");
		System.out.println(pq.offer(pessoa3lPessoaC19));
		System.out.println("pq");
		System.out.println(pq);
		System.out.println();
		System.out.println("pq.add(pessoa4lPessoaD40)");
		System.out.println(pq.add(pessoa4lPessoaD40));
		System.out.println("pq");
		System.out.println(pq);
		System.out.println();
		System.out.println("pq.add(pessoa2lPessoaB21)");
		System.out.println(pq.add(pessoa2lPessoaB21));
		System.out.println("pq");
		System.out.println(pq);
		System.out.println();
		System.out.println("pq.remove(pessoa3lPessoaC19)");
		System.out.println(pq.remove(pessoa3lPessoaC19));
		System.out.println("pq");
		System.out.println(pq);
		System.out.println();
		System.out.println("pq.remove()");
		System.out.println(pq.remove());
		System.out.println("pq");
		System.out.println(pq);
		System.out.println();
		System.out.println("pq.poll()");
		System.out.println(pq.poll());
		System.out.println("pq");
		System.out.println(pq);
		System.out.println();

	}

}
