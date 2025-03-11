package pkgs.pkg1;

public class Cavalo extends Animal {
	static {System.out.println("Cavalo.sb1");}
	{System.out.println("Cavalo.ib1");}
	static {System.out.println("Cavalo.sb2");}
	{System.out.println("Cavalo.ib2");}
	public static final int Y = 2;
	public Cavalo() {this(5); System.out.println("Cavalo()");}
	static {System.out.println("Cavalo.sb3");}
	{System.out.println("Cavalo.ib3");}
	public Cavalo(int i) {System.out.println("Cavalo(int i)");}
	public static void sm() {System.out.println("Cavalo.sm()");}
	public static void smCavalo() {System.out.println("Cavalo.smCavalo()");}
	public void im() {System.out.println("Cavalo.im()");}
	public void imCavalo() {System.out.println("Cavalo.imCavalo()");}
}
