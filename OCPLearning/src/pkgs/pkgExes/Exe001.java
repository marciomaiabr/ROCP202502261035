package pkgs.pkgExes;

import java.util.Locale;
import java.util.ResourceBundle;

public class Exe001 {



	public static void main(String[] args) {

		try{
			//Locale.setDefault(new Locale("fr"));
			System.out.println("[Locale.getDefault()="+(Locale.getDefault())+"]");
			//ResourceBundle rb = ResourceBundle.getBundle("R1" , new Locale("it") );//MissingResourceException: Can't find bundle for base name R1, locale it
			ResourceBundle rb = ResourceBundle.getBundle("R1");
			System.out.println("[rb="+(rb)+"]"+"[rb="+(rb.getLocale())+"]");
			System.out.println(rb.getString("A1"));
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
