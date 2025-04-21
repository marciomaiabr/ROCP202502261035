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
		if(obj instanceof Pessoa) {
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
		Pessoa pessoa1 = new Pessoa(1, "Marcio");
		System.out.println("[="+(pessoa1.equals(new Pessoa(2, "Ana")))+"]");
	}

}

/*
<>
Exe001.m1()
Pessoa.equals()
Pessoa.toString()
[obj=Pessoa [codigo=2, nome=Ana]]
[instanceof=true]
Pessoa.toString()
[pessoa=Pessoa [codigo=2, nome=Ana]]
[=false]
</>
*/

/*

*/

/*

*/
