package pkgs.pkgExes;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.ResourceBundle;

public class Exe001 {

	public static void main(String[] args) {

		try {
			Properties props = new Properties();
			props.load(new FileInputStream("C:\\Users\\Administrador\\git\\ROCP202502261035\\OCPLearning\\lib\\qqc.properties"));
			System.out.print(props.getProperty("mystery"));
			System.out.print(" ");
			System.out.print(props.getProperty("more"));
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println();

		try {
			ResourceBundle rb = ResourceBundle.getBundle("qqc");
			System.out.println(rb);
			System.out.println(rb.getObject("mystery"));
			//System.out.println(rb.getObject("more"));//MissingResourceException: Can't find resource for bundle java.util.PropertyResourceBundle, key more
			//System.out.println(rb.getString("more"));//MissingResourceException: Can't find resource for bundle java.util.PropertyResourceBundle, key more
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
