package pkgs.pkgExes;

public class Exe001 {

	public static void main(String[] args) {

		Integer o1 = null;
		System.out.println(o1 instanceof Integer);

		Integer o11 = null;
		System.out.println(o11 == o1);

		String o111 = null;
		//System.out.println(o111 == o1);//compilation problem:Incompatible operand types String and Integer
		System.out.println(((Object)o111) == ((Object)o1));

		Integer o2 = 7;
		System.out.println(o2 instanceof Integer);

	}

}
