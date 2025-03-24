package pkgs.pkgExes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

public class Exe001 {

	public static void main(String[] args) {
		System.out.println("<>");
		m1(args);
		System.out.println("</>");
	}

	public static void m1(String[] args) {
		System.out.println("Exe001.m1()");
		System.out.println("[Locale.getDefault()="+(Locale.getDefault())+"]");
		String args0 = args.length > 0 ? args[0] : null;
		System.out.println("[args0="+(args0)+"]");
		Locale locale = args0 != null ? new Locale(args0) : Locale.getDefault();
		System.out.println("[locale="+(locale)+"]");
		ResourceBundle resourceBundle = ResourceBundle.getBundle("pkgs.pkg9.MmProperties", locale);
		System.out.println("[resourceBundle.getString(mmProperty)="+(resourceBundle.getString("mmProperty"))+"]");
		System.out.println("[resourceBundle.getObject(mmProperty)="+(resourceBundle.getObject("mmProperty"))+"]");
	}

}

/*
<>
Exe001.m1()
[Locale.getDefault()=pt_BR]
[args0=null]
[locale=pt_BR]
[resourceBundle.getString(mmProperty)=mmPropertyValue do MmProperties_pt_BR.java]
[resourceBundle.getObject(mmProperty)=mmPropertyValue do MmProperties_pt_BR.java]
</>
*/

/*
quando trabalhar com ListResourceBundle no ResourceBundle.getBundle deve-se especificar o nome COMPLETO
*/
