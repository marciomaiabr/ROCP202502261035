package pkgs.pkgExes;

import java.time.LocalDateTime;

enum Animais {
	Cachorro, Gato, Galinha;
	String som;
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
		Animais animais = null;
		System.out.println("[="+(animais)+"]"+"");
		//animais = new Animais();//Cannot instantiate the type Animais
		animais = Animais.Cachorro;
		System.out.println("[="+(animais)+"]"+"");
 	}

}

/*

*/
