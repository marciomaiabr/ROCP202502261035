package pkgs.pkgExes;

import java.util.Locale;
import java.util.ResourceBundle;

public class Exe001 {



	public static void main(String[] args) {

		{
			Locale.setDefault(new Locale("en", "UK"));
			ResourceBundle rb = ResourceBundle.getBundle("Train", new Locale("en", "UK"));
			System.out.println(rb.getString("ride") + " " + rb.getString("train"));
		}

		{
			Locale.setDefault(new Locale("en", "US"));
			ResourceBundle rb = ResourceBundle.getBundle("Train", new Locale("en", "US"));
			System.out.println(rb.getString("ride") + " " + rb.getString("train"));
		}

	}

}
