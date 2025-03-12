package pkgs.pkg1;

public class Animal {
	static {System.out.println("Animal.sb1");}
	{System.out.println("Animal.ib1");}
	static {System.out.println("Animal.sb2");}
	{System.out.println("Animal.ib2");}
	public static final int X = 3;
	public static final int I1 = 30;
	public static int I2 = 39;
	public Animal() {this(5);System.out.println("Animal()");}
	static {System.out.println("Animal.sb3");}
	{System.out.println("Animal.ib3");}
	public Animal(int i) {System.out.println("Animal(int i)");}
	public static void sm() {System.out.println("Animal.sm()");}
	public static void smAnimal() {System.out.println("Animal.smAnimal()");}
	public static void sm2() {System.out.println("Animal.sm2()");sm();}
	public static void sm3() {System.out.println("Animal.sm3()[I1="+(I1)+"][I2="+(I2)+"]");}
	public static void sm4() {System.out.println("Animal.sm4()");sm3();}
	public void im() {System.out.println("Animal.im()");}
	public void imAnimal() {System.out.println("Animal.imAnimal()");}
}
