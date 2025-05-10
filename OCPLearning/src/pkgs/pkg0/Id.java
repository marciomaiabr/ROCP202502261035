package pkgs.pkg0;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Id {
	private Long codigo;
	private boolean isAutoGenerate;
	public boolean isAutoGenerate() {
		return this.isAutoGenerate;
	}
	public Id() { super(); }
	public Id(Long codigo) { super(); this.codigo = codigo; }
	public Id(boolean autoGenerate) {
		super();
		this.isAutoGenerate = autoGenerate;
		codigo = autoGenerate ? generate() : codigo;
	}
	private static Long generate() {
		try { Thread.sleep(2000); } catch (Exception e) {}
		return new Long(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")));
	}
	public Long getCodigo() {return codigo;}
	public void setCodigo(Long codigo) {this.codigo = codigo;}
	@Override
	public String toString() {
		return "["+"[class="+(this.getClass().getSimpleName())+"]"+"[codigo="+(codigo)+"]"+"]";
	}
	@Override
	public int hashCode() {
		System.out.println("Id.hashCode()");
		int hashCode = 0;
		hashCode = Objects.hashCode(codigo);
		System.out.println("[hashCode="+(hashCode)+"]");
		return hashCode;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Id.equals()[this="+(this)+"][obj="+(obj)+"]");
		boolean isEquals = false;
		if (obj == null) {
			System.out.println("[(obj == null)="+(true)+"]");
			isEquals = false;
		} else if (this == obj) {
			System.out.println("[(this == obj)="+(true)+"]");
			isEquals = true;
		} else if (obj instanceof Id) {
			System.out.println("[(obj instanceof Id)="+(true)+"]");
			if (((Id) obj).getCodigo().equals(this.getCodigo())) {
				System.out.println("[(((Id) obj).getCodigo() == this.getCodigo())="+(true)+"]");
				isEquals = true;
			}
		}
		System.out.println("[isEquals="+(isEquals)+"]");
		return isEquals;
	}
}

/*

*/
