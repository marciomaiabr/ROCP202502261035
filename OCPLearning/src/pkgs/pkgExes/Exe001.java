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
}

public class Exe001 {

	public static void main(String[] args) {
		System.out.println("<>");
		m1(args);
		System.out.println("</>");
	}

	public static void m1(String[] args) {
		System.out.println("Exe001.m1()");
		Pessoa pessoa = new Pessoa(41, "Marcio");
		System.out.println("[="+(pessoa)+"]");
	}

}

/*
<>
Exe001.m1()
Pessoa.toString()
[=Pessoa [codigo=41, nome=Marcio]]
</>
*/

/*

*/

/*

*/
