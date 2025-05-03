package pkgs.pkgExes;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
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
		} else if (this == obj) {
			System.out.println("[(this == obj)="+(true)+"]");
			isEquals = true;
		} else if (obj instanceof Pessoa) {
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

	static {
		System.out.println(LocalDateTime.now());
	}

	public static void main(String[] args) {
		System.out.println("<>");
		m1(args);
		System.out.println("</>");
	}

	public static void m1(String[] args) {
		System.out.println("Exe001.m1()");
		Pessoa pessoa1E = new Pessoa(1, "PessoaE");
		Pessoa pessoa2D = new Pessoa(2, "PessoaD");
		Pessoa pessoa3C = new Pessoa(3, "PessoaC");
		Pessoa pessoa4B = new Pessoa(4, "PessoaB");
		Pessoa pessoa5A = new Pessoa(5, "PessoaA");
		ArrayList<Pessoa> list = new ArrayList<>();
		System.out.println("\nadd(pessoa4B)");
		System.out.println(list.add(pessoa4B));
		System.out.println("\nadd(pessoa2D)");
		System.out.println(list.add(pessoa2D));
		System.out.println("\nadd(pessoa3C)");
		System.out.println(list.add(pessoa3C));
		System.out.println("\nadd(pessoa5A)");
		System.out.println(list.add(pessoa5A));
		System.out.println("\nadd(pessoa1E)");
		System.out.println(list.add(pessoa1E));
		System.out.println();
		System.out.println("[ñ ordenado="+(list)+"]");
		System.out.println("\nCollections.sort(list, (Pessoa pessoa1, Pessoa pessoa2) -> new Long(pessoa1.getCodigo()).compareTo(pessoa2.getCodigo()))");
		System.out.println();
		Collections.sort(list, (Pessoa pessoa1, Pessoa pessoa2) -> new Long(pessoa1.getCodigo()).compareTo(pessoa2.getCodigo()));
		System.out.println();
		System.out.println(list);
		System.out.println("\nCollections.sort(list, (Pessoa pessoa1, Pessoa pessoa2) -> pessoa1.getNome().compareTo(pessoa2.getNome()))");
		System.out.println();
		Collections.sort(list, (Pessoa pessoa1, Pessoa pessoa2) -> pessoa1.getNome().compareTo(pessoa2.getNome()));
		System.out.println();
		System.out.println(list);
	}

}

/*

*/
