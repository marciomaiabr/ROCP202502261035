package pkgs.pkg1.pkg11;

public class Ponei extends pkgs.pkg1.Cavalo {
	static {System.out.println("Ponei.sb1");}
	{System.out.println("Ponei.ib1");}
	static {System.out.println("Ponei.sb2");}
	{System.out.println("Ponei.ib2");}
	public static final int Z = 1;
	public Ponei() {this(5);System.out.println("Ponei()");}
	static {System.out.println("Ponei.sb3");}
	{System.out.println("Ponei.ib3");}
	public Ponei(int i) {System.out.println("Ponei(int i)");}
	public static void sm() {System.out.println("Ponei.sm()");}
	public static void im() {System.out.println("Ponei.im()");}
}
