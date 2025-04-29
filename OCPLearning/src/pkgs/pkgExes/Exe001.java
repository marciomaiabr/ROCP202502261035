package pkgs.pkgExes;

import java.util.*;

class Pessoa {
	private int codigo;
	private String nome;
	public Pessoa() { super(); }
	public Pessoa(int codigo, String nome) { super(); this.codigo = codigo; this.nome = nome; }
	public Pessoa(int codigo) { super(); this.codigo = codigo; }
	public int getCodigo() {return codigo;}
	public void setCodigo(int codigo) {this.codigo = codigo;}
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
	@Override
	public String toString() {
		System.out.println("Pessoa.toString()");
		return "Pessoa [codigo=" + codigo + ", nome=" + nome + "]";
	}
	@Override
	public int hashCode() {
		System.out.println("Pessoa.hashCode()");
		return codigo;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Pessoa.equals()");
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if ((obj instanceof Pessoa) && (((Pessoa) obj).getCodigo() == this.getCodigo()))
			return true;

		return false;
	}
}

public class Exe001 {

	public static void main(String[] args) {
		System.out.println("<>");
		m1(args);
		System.out.println("</>");
	}

	public static void m1(String[] args) {
		System.out.println("Exe001.m1()");
		Collection<Pessoa> collection = new HashSet<Pessoa>();
		Pessoa pessoa1A = new Pessoa(1, "PessoaA");
		Pessoa pessoa2B = new Pessoa(2, "PessoaB");
		Pessoa pessoa1C = new Pessoa(1, "PessoaC");
		collection.add(pessoa1A);
		collection.add(pessoa2B);
		System.out.println();
		collection.add(pessoa1C);
		System.out.println();
		Set impl = ((Set)collection);
		System.out.println("[=" + (impl.contains(new Pessoa(1))) + "]");
		System.out.println();
		impl.forEach(System.out::println);
	}

}

/*
<>
Exe001.m1()
Pessoa.hashCode()
Pessoa.hashCode()

Pessoa.hashCode()
Pessoa.equals()

Pessoa.hashCode()
Pessoa.equals()
[=true]

Pessoa.toString()
Pessoa [codigo=1, nome=PessoaA]
Pessoa.toString()
Pessoa [codigo=2, nome=PessoaB]
</>
*/

/*

*/

/*

*/
