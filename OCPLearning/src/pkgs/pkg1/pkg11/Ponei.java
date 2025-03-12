package pkgs.pkg1.pkg11;

public class Ponei extends pkgs.pkg1.Cavalo {
	static {System.out.println("Ponei.sb1");}
	{System.out.println("Ponei.ib1");}
	static {System.out.println("Ponei.sb2");}
	{System.out.println("Ponei.ib2");}
	public static final int Z = 1;
	public static final int I1 = 10;
	public static int I2 = 19;
	public Ponei() {this(5);System.out.println("Ponei()");}
	static {System.out.println("Ponei.sb3");}
	{System.out.println("Ponei.ib3");}
	public Ponei(int i) {System.out.println("Ponei(int i)");}
	public static void sm() {System.out.println("Ponei.sm()");}
	public static void smPonei() {System.out.println("Ponei.smPonei()");}
	public static void sm2() {System.out.println("Ponei.sm2()");sm();}
	public static void sm4() {System.out.println("Ponei.sm4()");sm3();}
	public void im() {System.out.println("Ponei.im()");}
	public void imPonei() {System.out.println("Ponei.imPonei()");}
}
