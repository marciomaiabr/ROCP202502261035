package pkgs.pkgExes;

class Pessoa {
	private int codigo;
	private String nome;
	public int getCodigo() {
		return codigo;
	}
	public Pessoa() {
		super();
	}
	public Pessoa(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		System.out.println("Pessoa.toString()");
		return "Pessoa [codigo=" + codigo + ", nome=" + nome + "]";
	}
	public boolean equals(Object obj) {
		System.out.println("Pessoa.equals()");
		System.out.println("[obj="+(obj)+"]");
		boolean retorno = false;
		if(obj == this) {
			System.out.println("[ == ="+(true)+"]");
			retorno = true;
		}else if(obj instanceof Pessoa) {
			System.out.println("[ == ="+(false)+"]");
			System.out.println("[instanceof="+(true)+"]");
			Pessoa pessoa = (Pessoa) obj;
			System.out.println("[pessoa="+(pessoa)+"]");
			if(pessoa.getCodigo() == this.getCodigo()) {
				retorno = true;
			}
		}else {
			System.out.println("[instanceof="+(false)+"]");
		}
		return retorno;
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
		Pessoa pessoa1 = null;
		System.out.println("[="+(pessoa1.equals(null))+"]");
	}

}

/*
<>
Exe001.m1()
Exception in thread "main" java.lang.NullPointerException
	at pkgs.pkgExes.Exe001.m1(Exe001.java:65)
	at pkgs.pkgExes.Exe001.main(Exe001.java:58)
*/

/*

*/

/*

*/
