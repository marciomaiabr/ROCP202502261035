package pkgs.pkg0;

import java.util.*;

public class Pessoa implements Comparable<Pessoa> {
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
		return "[[class="+(this.getClass().getSimpleName())+"]"+"[codigo="+(codigo)+"]"+"[nome="+(nome)+"]"+"[this.hashCode()="+(this.hashCode())+"]]";
	}
	@Override
	public int hashCode() {
		System.out.println("Pessoa.hashCode()");
		int hashCode = 0;
		//hashCode = this.getNome().substring(this.getNome().length()-1).toLowerCase().toCharArray()[0];
		String ultimaLetra = this.getNome().substring(this.getNome().length()-1).toLowerCase();
		hashCode = ("abc".indexOf(ultimaLetra) >= 0) ? 1 : ( ("def".indexOf(ultimaLetra) >= 0) ? 2 : 3) ;
		//hashCode = Objects.hashCode(codigo);
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

	public static void criaPessoas(Collection<Pessoa> collection) {
		System.out.println("\nExe001.criaPessoas()");
		String [] letras = new String[] { "B" , "K" , "D" , "C" , "E" , "G" , "F" , "A" , "H" };
		int [] numeros = new int[] { 6 , 8 , 7 , 9 , 5 , 1 , 3 , 2 , 4 };
		int totalTentadoCriar = 0;
		int j = 0;

		for(int i = 0; i <= 10; i++) {
			j = ( (j >= letras.length) || (j >= numeros.length) ) ? 0 : j ;
			String letra = letras[j];
			int numero = numeros[j];
			Pessoa pessoa = new Pessoa(numero, "Pessoa"+numero+""+letra);
			System.out.println("\ncollection.add("+(pessoa)+")");
			System.out.println(collection.add(pessoa));
			totalTentadoCriar++;
			j++;
		}

		System.out.println();
		System.out.println("[totalTentadoCriar="+(totalTentadoCriar)+"]");
		System.out.println("[totalCriado="+(collection.size())+"]");
		System.out.println();
	}

}

/*

*/
