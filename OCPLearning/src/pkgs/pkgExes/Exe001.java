package pkgs.pkgExes;

import java.time.LocalDateTime;
import java.util.*;

class Pessoa implements Comparable<Pessoa> {
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
	@Override
	public int compareTo(Pessoa pessoa) {
		System.out.println("Pessoa.compareTo(Pessoa pessoa)"+"[this="+(this)+"]"+"[pessoa="+(pessoa)+"]");
		int retornoCompareTo = new Long(this.getCodigo()).compareTo(pessoa.getCodigo());
		System.out.println("[retornoCompareTo="+(retornoCompareTo)+"]");
		return retornoCompareTo;
	}
}

public class Exe001 {

	static {
		System.out.println(LocalDateTime.now());
	}

	public static void main(String[] args) {
		try {
			System.out.println("<>");
			m1(args);
			System.out.println("</>");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			Runtime.getRuntime().exec("cmd.exe /c C:\\Users\\Administrador\\git\\ROCP202502261035\\OCPLearning\\logs\\logMM.txt");
		} catch (Exception e) {}
	}

	public static void m1(String[] args) {
		System.out.println("Exe001.m1()");
		Pessoa pessoa1A = new Pessoa(1, "PessoaA");
		Pessoa pessoa2B = new Pessoa(2, "PessoaB");
		Pessoa pessoa1C = new Pessoa(1, "PessoaC");
		Pessoa pessoa4D = new Pessoa(4, "PessoaD");
		Pessoa pessoa2E = new Pessoa(2, "PessoaE");
		Pessoa pessoa6F = new Pessoa(6, "PessoaF");
		Pessoa pessoa7G = new Pessoa(7, "PessoaG");
		System.out.println();

		Collection<Pessoa> collection = new TreeSet<>();

		System.out.println("\ncollection.add(pessoa1A)");
		System.out.println(collection.add(pessoa1A));
		System.out.println("\ncollection.add(pessoa6F)");
		System.out.println(collection.add(pessoa6F));
		System.out.println("\ncollection.add(pessoa2B)");
		System.out.println(collection.add(pessoa2B));
		System.out.println("\ncollection.add(pessoa1C)");
		System.out.println(collection.add(pessoa1C));
		System.out.println("\ncollection.add(pessoa4D)");
		System.out.println(collection.add(pessoa4D));
		System.out.println("\ncollection.add(pessoa2E)");
		System.out.println(collection.add(pessoa2E));
		System.out.println("\ncollection.add(pessoa7G)");
		System.out.println(collection.add(pessoa7G));
		System.out.println();
		collection.forEach(System.out::println);
		System.out.println();
		System.out.println("collection.contains(new Pessoa(4, \"PessoaD\"))");
		System.out.println(collection.contains(new Pessoa(4, "PessoaD")));
	}

}

/*

*/
