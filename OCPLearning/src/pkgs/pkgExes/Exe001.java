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
		Locale.setDefault(new Locale("ja", "JP"));
		System.out.println("[Locale.getDefault()="+(Locale.getDefault())+"]");
		ResourceBundle resourceBundle = ResourceBundle.getBundle("MmProperties", new Locale("fr", "FR"));
		System.out.println("[resourceBundle.getString(mmProperty)="+(resourceBundle.getString("mmProperty"))+"]");
	}

}

/*
<>
Exe001.m1()
[Locale.getDefault()=pt_BR]
[Locale.getDefault()=ja_JP]
[resourceBundle.getString(mmProperty)=mmPropertyValue do mmProperties_fr_FR.properties]
</>
*/

/*

*/
