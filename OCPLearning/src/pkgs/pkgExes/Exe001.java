package pkgs.pkgExes;

import java.util.Locale;
import java.util.ResourceBundle;

public class Exe001 {



	public static void main(String[] args) {

		try{
			System.out.println("[Locale.getDefault()="+(Locale.getDefault())+"]");
			ResourceBundle rb = ResourceBundle.getBundle("R1");
			System.out.println("[rb="+(rb)+"]"+"[rb.getLocale()="+(rb.getLocale())+"]");
			System.out.println(rb.getString("A1"));
		}catch(Exception e){
			e.printStackTrace();
		}

		System.out.println();

		//Locale.setDefault(new Locale(null));//NullPointerException
		//Locale.setDefault(null);//NullPointerException: Can't set default locale to NULL
		//Locale.setDefault(new Locale("", null));//NullPointerException
		//Locale.setDefault(new Locale(null, ""));//NullPointerException
		//Locale.setDefault(new Locale(null, null));//NullPointerException
		Locale.setDefault(new Locale("", ""));
		System.out.println("[Locale.getDefault()="+(Locale.getDefault())+"]");

		try{
			ResourceBundle rb = ResourceBundle.getBundle("R1");
			System.out.println("[rb="+(rb)+"]"+"[rb="+(rb.getLocale())+"]");
			System.out.println(rb.getString("A1"));
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
