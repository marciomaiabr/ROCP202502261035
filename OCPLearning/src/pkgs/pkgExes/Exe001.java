package pkgs.pkgExes;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

class Pessoa {
	private long codigo;
	private String nome;
	public Pessoa() { super(); }
	public Pessoa(long codigo, String nome) { super(); this.codigo = codigo; this.nome = nome; }
	public Pessoa(long codigo) { super(); this.codigo = codigo; }
	public Pessoa(String nome) { super(); this.nome = nome; }
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
		Pessoa [] arr = new Pessoa [] { pessoa1E , pessoa2D , pessoa3C , pessoa4B , pessoa5A } ;
		List<Pessoa> list = new ArrayList<>(Arrays.asList(arr));
		Object [] arr2 = (Object[]) list.toArray();

		for(Pessoa pessoa : arr) System.out.println(pessoa);
		System.out.println();
		list.forEach(System.out::println);
		System.out.println();
		for(Object object : arr2) System.out.println(object);
		System.out.println();

		arr[0] = null;
		list.remove(1);
		arr2[2] = null;

		for(Pessoa pessoa : arr) System.out.println(pessoa);
		System.out.println();
		list.forEach(System.out::println);
		System.out.println();
		for(Object object : arr2) System.out.println(object);
		System.out.println();

	}

}

/*

*/
