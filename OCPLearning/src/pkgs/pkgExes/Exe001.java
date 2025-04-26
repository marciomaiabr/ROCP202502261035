package pkgs.pkgExes;

import java.util.HashSet;
import java.util.Objects;

class Pessoa {
	private int codigo;
	private String nome;
	public Pessoa() {
		super();
	}
	public Pessoa(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}
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
		HashSet<Pessoa> hashSet = new HashSet<Pessoa>();
		hashSet.add(new Pessoa(1, "Marcio"));
		System.out.println();
		System.out.println("[=" + (hashSet.contains(new Pessoa(1, "Marcio"))) + "]");
	}

}

/*
<>
Exe001.m1()
Pessoa.hashCode()

Pessoa.hashCode()
Pessoa.equals()
[=true]
</>
*/

/*

*/

/*

*/
