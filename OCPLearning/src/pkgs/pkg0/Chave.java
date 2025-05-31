package pkgs.pkg0;

import java.util.*;

public class Chave implements Comparable<Chave> {
	private Long codigo;
	public Chave() { super(); }
	public Chave(Long codigo) { super(); this.codigo = codigo; }
	public Long getCodigo() {return codigo;}
	public void setCodigo(Long codigo) {this.codigo = codigo;}
	@Override
	public String toString() {
		return "["+"[class="+(this.getClass().getSimpleName())+"]"+"[codigo="+(codigo)+"]"+"]";
	}
	@Override
	public int hashCode() {
		System.out.println("Chave.hashCode()");
		int hashCode = 0;
		hashCode = Objects.hashCode(codigo);
		System.out.println("[hashCode="+(hashCode)+"]");
		return hashCode;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Chave.equals()[this="+(this)+"][obj="+(obj)+"]");
		boolean isEquals = false;
		if (obj == null) {
			System.out.println("[(obj == null)="+(true)+"]");
			isEquals = false;
		} else if (this == obj) {
			System.out.println("[(this == obj)="+(true)+"]");
			isEquals = true;
		} else if (obj instanceof Chave) {
			System.out.println("[(obj instanceof Chave)="+(true)+"]");
			if (((Chave) obj).getCodigo().equals(this.getCodigo())) {
				System.out.println("[(((Chave) obj).getCodigo() == this.getCodigo())="+(true)+"]");
				isEquals = true;
			}
		}
		System.out.println("[isEquals="+(isEquals)+"]");
		return isEquals;
	}
	@Override
	public int compareTo(Chave chave) {
		System.out.println("Chave.compareTo(Chave chave)[this="+(this)+"][chave="+(chave)+"]");
		int intCompareTo = Long.compare(this.getCodigo(), chave.getCodigo());
		System.out.println("[intCompareTo="+(intCompareTo)+"]");
		return intCompareTo;
	}
}

/*

*/
