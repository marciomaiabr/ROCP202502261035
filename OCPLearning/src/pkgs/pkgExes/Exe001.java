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
		return "Pessoa [codigo=" + codigo + ", nome=" + nome + "]";
	}
	@Override
	public int hashCode() {
		System.out.println("Pessoa.hashCode()");
		int hashCode = Objects.hashCode(codigo);
		System.out.println("[hashCode="+(hashCode)+"]");
		return hashCode;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Pessoa.equals()[this="+(this)+"][obj="+(obj)+"]");
		boolean isEquals = false;
		if (obj == null) {
			System.out.println("[(obj == null)="+(true)+"]");
			isEquals = false;
		}
		if (this == obj) {
			System.out.println("[(this == obj)="+(true)+"]");
			isEquals = true;
		}
		if (obj instanceof Pessoa) {
			System.out.println("[(obj instanceof Pessoa)="+(true)+"]");
			if (((Pessoa) obj).getCodigo() == this.getCodigo()) {
				System.out.println("[(((Pessoa) obj).getCodigo() == this.getCodigo())="+(true)+"]");
				isEquals = true;
			}
		}
		System.out.println("[isEquals="+(isEquals)+"]");
		return isEquals;
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
		Pessoa pessoa2D = new Pessoa(2, "PessoaD");
		Pessoa pessoa3E = new Pessoa(3, "PessoaE");
		System.out.println("\nadd(pessoa1A)");
		collection.add(pessoa1A);
		System.out.println("\nadd(pessoa2B)");
		collection.add(pessoa2B);
		System.out.println("\nadd(pessoa1C)");
		collection.add(pessoa1C);
		System.out.println("\nadd(pessoa2D)");
		collection.add(pessoa2D);
		System.out.println("\nadd(pessoa3E)");
		collection.add(pessoa3E);
		Set impl = ((Set)collection);
		System.out.println("\ncontains");
		System.out.println("[=" + (impl.contains(new Pessoa(2))) + "]");
		System.out.println("\nforEach");
		impl.forEach(System.out::println);
	}

}

/*
<>
Exe001.m1()

add(pessoa1A)
Pessoa.hashCode()
[hashCode=1]

add(pessoa2B)
Pessoa.hashCode()
[hashCode=2]

add(pessoa1C)
Pessoa.hashCode()
[hashCode=1]
Pessoa.equals()[this=Pessoa [codigo=1, nome=PessoaC]][obj=Pessoa [codigo=1, nome=PessoaA]]
[(obj instanceof Pessoa)=true]
[(((Pessoa) obj).getCodigo() == this.getCodigo())=true]
[isEquals=true]

add(pessoa2D)
Pessoa.hashCode()
[hashCode=2]
Pessoa.equals()[this=Pessoa [codigo=2, nome=PessoaD]][obj=Pessoa [codigo=2, nome=PessoaB]]
[(obj instanceof Pessoa)=true]
[(((Pessoa) obj).getCodigo() == this.getCodigo())=true]
[isEquals=true]

add(pessoa3E)
Pessoa.hashCode()
[hashCode=3]

contains
Pessoa.hashCode()
[hashCode=2]
Pessoa.equals()[this=Pessoa [codigo=2, nome=null]][obj=Pessoa [codigo=2, nome=PessoaB]]
[(obj instanceof Pessoa)=true]
[(((Pessoa) obj).getCodigo() == this.getCodigo())=true]
[isEquals=true]
[=true]

forEach
Pessoa [codigo=1, nome=PessoaA]
Pessoa [codigo=2, nome=PessoaB]
Pessoa [codigo=3, nome=PessoaE]
</>
*/

/*

*/

/*

*/
