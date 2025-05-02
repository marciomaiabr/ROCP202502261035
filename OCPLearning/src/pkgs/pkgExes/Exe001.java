package pkgs.pkgExes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

class Pessoa {
	private long codigo;
	private String nome;
	public Pessoa() { super(); }
	public Pessoa(long codigo, String nome) { super(); this.codigo = codigo; this.nome = nome; }
	public Pessoa(long codigo) { super(); this.codigo = codigo; }
	public long getCodigo() {return codigo;}
	public void setCodigo(long codigo) {this.codigo = codigo;}
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
	@Override
	public String toString() {
		return "[[class="+(this.getClass().getSimpleName())+"]"+"[codigo="+(codigo)+"]"+"[nome="+(nome)+"]]";
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
		Pessoa pessoa1A = new Pessoa(1, "PessoaA");
		Pessoa pessoa2B = new Pessoa(2, "PessoaB");
		Pessoa pessoa3C = new Pessoa(3, "PessoaC");
		Pessoa pessoa4D = new Pessoa(4, "PessoaD");
		Pessoa pessoa5E = new Pessoa(5, "PessoaE");
		ArrayList<Pessoa> list = new ArrayList<>();
		System.out.println("\nadd(pessoa4D)");
		System.out.println(list.add(pessoa4D));
		System.out.println("\nadd(pessoa2B)");
		System.out.println(list.add(pessoa2B));
		System.out.println("\nadd(pessoa3C)");
		System.out.println(list.add(pessoa3C));
		System.out.println("\nadd(pessoa5E)");
		System.out.println(list.add(pessoa5E));
		System.out.println("\nadd(pessoa1A)");
		System.out.println(list.add(pessoa1A));
		System.out.println();
		System.out.println("[ñ ordenado="+(list)+"]");
		Collections.sort(list);
		System.out.println("[ordenado="+(list)+"]");
	}

}

/*
<>
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The method sort(List<T>) in the type Collections is not applicable for the arguments (ArrayList<Pessoa>)

	at pkgs.pkgExes.Exe001.m1(Exe001.java:82)
	at pkgs.pkgExes.Exe001.main(Exe001.java:58)
*/

/*

*/

/*

*/
