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
		String args0 = args[0];
		System.out.println("[args0="+(args0)+"]");
		Locale locale = new Locale(args0);
		System.out.println("[locale="+(locale)+"]");
		ResourceBundle resourceBundle = ResourceBundle.getBundle("mmProperties", locale);
		String sMmProperty = resourceBundle.getString("mmProperty");
		System.out.println("[sMmProperty="+(sMmProperty)+"]");
	}

}

/*
<>
Exe001.m1()
[args0=qqc]
[locale=qqc]
[sMmProperty=mmPropertyValue do mmProperties_pt_BR.properties]
</>
*/

/*
quando é um Locale que não existe ele assume o Default
*/
