package pkgs.pkgExes;

import java.util.Locale;

public class Exe001 {



	public static void main(String[] args) {

		Locale.setDefault(Locale.KOREAN);
		System.out.println(Locale.getDefault());
		Locale.setDefault(new Locale("en", "AU"));
		System.out.println(Locale.getDefault());
		Locale.setDefault(new Locale("EN"));
		System.out.println(Locale.getDefault());
		Locale.setDefault(new Locale("QQ"));
		System.out.println(Locale.getDefault());
		Locale.setDefault(new Locale("QQ", "q1"));
		System.out.println(Locale.getDefault());
		Locale.setDefault(Locale.FRANCE);
		System.out.println(Locale.getDefault());

	}



}
