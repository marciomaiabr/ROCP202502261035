package pkgs.pkgExes;

import java.time.LocalDateTime;

enum Animais {

	CACHORRO("latir","auau"){
		public void movimentacao1() {System.out.println("correndo");}
		public void movimentacao2() {System.out.println("correndo");}
	}, GATO{
		public void movimentacao2() {System.out.println("pula");}
	}, GALINHA{
		public void movimentacao2() {System.out.println("voa");}
	};

	private String nomeSom;
	String som;

	Animais() {
		System.out.println("Animais.Animais()");
	}

	Animais(String nomeSom, String som) {
		System.out.println("Animais.Animais(String nomeSom, String som)");
		this.nomeSom = nomeSom;
		this.som = som;
	}

	public String getNomeSom() {
		return nomeSom;
	}

	public void setNomeSom(String nomeSom) {
		this.nomeSom = nomeSom;
	}

	public abstract void movimentacao2();

}

public class Exe001 {

	static {
		System.out.println(LocalDateTime.now());
	}

	public static void main(String[] args) {
		sm1(args);
		new Exe001().im1(args);
	}

	public static void sm1(String[] args) {
		System.out.println("Exe001.sm1()");
		//System.out.println("[="+()+"]"+"");
	}

	public void im1(String[] args) {
		System.out.println("Exe001.im1()");
		Animais animal = null;
		System.out.println("[="+(animal)+"]"+"");
		//animal = new Animais();//Cannot instantiate the type Animais
		animal = Animais.CACHORRO;
		System.out.println("[="+(animal)+"]"+"");
		System.out.println("[="+(animal.som)+"]"+"");
		animal.som="muuuuu...";
		System.out.println("[="+(animal.som)+"]"+"");
		System.out.println("[="+(animal.getNomeSom())+"]"+"");
		Animais.CACHORRO.setNomeSom("latindo");
		System.out.println("[="+(animal.getNomeSom())+"]"+"");
		//Animais.CACHORRO.movimentacao1();//The method movimentacao1() is undefined for the type Animais
		Animais.CACHORRO.movimentacao2();
		System.out.println("[="+(Animais.GATO)+"]"+"");
 	}

}

/*

*/
