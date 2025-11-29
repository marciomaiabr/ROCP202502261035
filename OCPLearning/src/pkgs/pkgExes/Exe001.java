package pkgs.pkgExes;

import java.util.Locale;
import java.util.ResourceBundle;

public class Exe001 {

	public static void main(String[] args) {

		ResourceBundle frbA = ResourceBundle.getBundle("FBundleA", Locale.getDefault());
		frbA.keySet().forEach(System.out::println);
		System.out.println();
		/*System.out.println(frbA);
		//System.out.println(frbA.getObject("12"));//MissingResourceException: Can't find resource for bundle java.util.PropertyResourceBundle, key 12
		System.out.println(frbA.getObject("\"12\""));
		System.out.println(frbA.getString("\"56\""));*/

		ResourceBundle frbB = ResourceBundle.getBundle("FBundleB", Locale.getDefault());
		frbB.keySet().forEach(System.out::println);
		System.out.println();
		/*System.out.println(frbB);
		System.out.println(frbB.getObject("12"));
		System.out.println(frbB.getString("56"));*/

		ResourceBundle crbA = ResourceBundle.getBundle("pkgs.pkg1.CBundleA", Locale.getDefault());
		crbA.keySet().forEach(System.out::println);
		System.out.println();
		/*System.out.println(crbA.getObject("12"));*/
		//System.out.println(crbA.getString("12"));//ClassCastException: java.lang.Integer cannot be cast to java.lang.String

		ResourceBundle crbB = ResourceBundle.getBundle("pkgs.pkg1.CBundleB", Locale.getDefault());
		//crbB.keySet().forEach(System.out::println);//ClassCastException: java.lang.Integer cannot be cast to java.lang.String
		System.out.println();
		//System.out.println(crbB.getObject("12"));//ClassCastException: java.lang.Integer cannot be cast to java.lang.String
		//System.out.println(crbB.getString("12"));//ClassCastException: java.lang.Integer cannot be cast to java.lang.String
		//System.out.println(crbB.getString(12));//compilation problem: //The method getString(String) in the type ResourceBundle is not applicable for the arguments (int)
		//System.out.println(crbB.getObject(12));//compilation problem: //The method getObject(String) in the type ResourceBundle is not applicable for the arguments (int)

		ResourceBundle crbC = ResourceBundle.getBundle("pkgs.pkg1.CBundleC", Locale.getDefault());
		crbC.keySet().forEach(System.out::println);
		System.out.println();
		/*System.out.println(crbC.getObject("12"));
		System.out.println(crbC.getString("56"));*/

		ResourceBundle crbD = ResourceBundle.getBundle("pkgs.pkg1.CBundleD", Locale.getDefault());
		//crbD.keySet().forEach(System.out::println);//ClassCastException: java.lang.Integer cannot be cast to java.lang.String
		System.out.println();
		//System.out.println(crbD.getObject("12"));//ClassCastException: java.lang.Integer cannot be cast to java.lang.String
		//System.out.println(crbD.getString("56"));//ClassCastException: java.lang.Integer cannot be cast to java.lang.String

	}

}
