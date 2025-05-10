package pkgs.pkg0;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Key {
	private Long codigo;
	private boolean isAutoGenerateKey;
	public boolean isAutoGenerateKey() {
		return this.isAutoGenerateKey;
	}
	public Key() { super(); }
	public Key(Long codigo) { super(); this.codigo = codigo; }
	public Key(boolean autoGenerateKey) {
		super();
		this.isAutoGenerateKey = autoGenerateKey;
		codigo = autoGenerateKey ? generateKey() : codigo;
	}
	private static Long generateKey() {
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
		System.out.println("Key.hashCode()");
		int hashCode = 0;
		hashCode = Objects.hashCode(codigo);
		System.out.println("[hashCode="+(hashCode)+"]");
		return hashCode;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Key.equals()[this="+(this)+"][obj="+(obj)+"]");
		boolean isEquals = false;
		if (obj == null) {
			System.out.println("[(obj == null)="+(true)+"]");
			isEquals = false;
		} else if (this == obj) {
			System.out.println("[(this == obj)="+(true)+"]");
			isEquals = true;
		} else if (obj instanceof Key) {
			System.out.println("[(obj instanceof Key)="+(true)+"]");
			if (((Key) obj).getCodigo().equals(this.getCodigo())) {
				System.out.println("[(((Key) obj).getCodigo() == this.getCodigo())="+(true)+"]");
				isEquals = true;
			}
		}
		System.out.println("[isEquals="+(isEquals)+"]");
		return isEquals;
	}
}

/*

*/
