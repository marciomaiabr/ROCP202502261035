package pkgs.pkg1;

public class Animal {
	static {System.out.println("Animal.sb1");}
	{System.out.println("Animal.ib1");}
	static {System.out.println("Animal.sb2");}
	{System.out.println("Animal.ib2");}
	public static final int X = 3;
	public Animal() {this(5);System.out.println("Animal()");}
	static {System.out.println("Animal.sb3");}
	{System.out.println("Animal.ib3");}
	public Animal(int i) {System.out.println("Animal(int i)");}
	public void sm() {System.out.println("Animal.sm()");}
	public static void im() {System.out.println("Animal.im()");}
}
