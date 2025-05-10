package pkgs.pkg0;

import java.util.*;

public class KeyPessoa {
	private Long codigo;
	public KeyPessoa() { super(); }
	public KeyPessoa(Long codigo) { super(); this.codigo = codigo; }
	public Long getCodigo() {return codigo;}
	public void setCodigo(Long codigo) {this.codigo = codigo;}
	@Override
	public String toString() {
		return "["+"[class="+(this.getClass().getSimpleName())+"]"+"[codigo="+(codigo)+"]"+"]";
	}
	@Override
	public int hashCode() {
		System.out.println("KeyPessoa.hashCode()");
		int hashCode = 0;
		hashCode = Objects.hashCode(codigo);
		System.out.println("[hashCode="+(hashCode)+"]");
		return hashCode;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("KeyPessoa.equals()[this="+(this)+"][obj="+(obj)+"]");
		boolean isEquals = false;
		if (obj == null) {
			System.out.println("[(obj == null)="+(true)+"]");
			isEquals = false;
		} else if (this == obj) {
			System.out.println("[(this == obj)="+(true)+"]");
			isEquals = true;
		} else if (obj instanceof KeyPessoa) {
			System.out.println("[(obj instanceof KeyPessoa)="+(true)+"]");
			if (((KeyPessoa) obj).getCodigo().equals(this.getCodigo())) {
				System.out.println("[(((KeyPessoa) obj).getCodigo() == this.getCodigo())="+(true)+"]");
				isEquals = true;
			}
		}
		System.out.println("[isEquals="+(isEquals)+"]");
		return isEquals;
	}
}

/*

*/
