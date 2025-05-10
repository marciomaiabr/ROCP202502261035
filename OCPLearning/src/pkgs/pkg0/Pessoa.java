package pkgs.pkg0;

import java.util.*;

public class Pessoa {
	private Id id;
	private String nome;
	public Pessoa() { super(); }
	public Pessoa(Id id, String nome) { super(); this.id = id; this.nome = id.isAutoGenerate() ? nome.concat(id.getCodigo().toString()): nome; }
	public Pessoa(Id id) { super(); this.id = id; this.nome = id.isAutoGenerate() ? "Pessoa".concat(id.getCodigo().toString()): this.nome; }
	public Pessoa(String nome) { super(); this.nome = nome; }
	public Id getId() {return id;}
	public void setId(Id id) {this.id = id;}
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
	@Override
	public String toString() {
		return "["+"[class="+(this.getClass().getSimpleName())+"]"+"[id="+(id)+"]"+"[nome="+(nome)+"]"+"]";
	}
	@Override
	public int hashCode() {
		System.out.println("Pessoa.hashCode()");
		int hashCode = 0;
		hashCode = Objects.hashCode(id.getCodigo());
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
			if (((Pessoa) obj).getId().getCodigo().equals(this.getId().getCodigo())) {
				System.out.println("((Pessoa) obj).getId().getCodigo().equals(this.getId().getCodigo())="+(true)+"]");
				isEquals = true;
			}
		}
		System.out.println("[isEquals="+(isEquals)+"]");
		return isEquals;
	}
}

/*

*/
