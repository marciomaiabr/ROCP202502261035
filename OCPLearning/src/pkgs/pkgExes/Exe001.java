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
		ResourceBundle resourceBundle = ResourceBundle.getBundle("MmProperties");
		System.out.println("[resourceBundle.getString(mmProperty)="+(resourceBundle.getString("mmProperty"))+"]");
	}

}

/*
<>
Exe001.m1()
[Locale.getDefault()=pt_BR]
[resourceBundle.getString(mmProperty)=mmPropertyValue do MmProperties_pt_BR.java]
</>
*/

/*
usando o default
*/
