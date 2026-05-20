package pkgs.pkgExes;

import java.util.Locale;
import java.util.ResourceBundle;

public class Exe001 {



	public static void main(String[] args) {

		new Exe001().go();

	}

	private void go() {
		Locale.setDefault(new Locale("it", "IT"));
		ResourceBundle rb1 = null;

		rb1 = ResourceBundle.getBundle("pkgFProperties.RecursoA");
		System.out.println();
		System.out.println("[rb1.getLocale()="+(rb1.getLocale())+"]");
		try {
			System.out.println("[Key0RecursoAproperties="+(rb1.getString("Key0RecursoAproperties"))+"]");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("[KeyRecursoAproperties="+(rb1.getString("KeyRecursoAproperties"))+"]");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("[KeyRecursoA_ja_JPproperties="+(rb1.getString("KeyRecursoA_ja_JPproperties"))+"]");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("[KeyRecursoA_ja_BRproperties="+(rb1.getString("KeyRecursoA_ja_BRproperties"))+"]");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("[KeyRecursoA_japroperties="+(rb1.getString("KeyRecursoA_japroperties"))+"]");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("[KeyRecursoA_it_ITproperties="+(rb1.getString("KeyRecursoA_it_ITproperties"))+"]");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("[KeyRecursoA_itproperties="+(rb1.getString("KeyRecursoA_it_ITproperties"))+"]");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

		rb1 = ResourceBundle.getBundle("pkgFProperties.RecursoA", new Locale("ja"));
		System.out.println();
		System.out.println("[rb1.getLocale()="+(rb1.getLocale())+"]");
		try {
			System.out.println("[Key0RecursoAproperties="+(rb1.getString("Key0RecursoAproperties"))+"]");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("[KeyRecursoAproperties="+(rb1.getString("KeyRecursoAproperties"))+"]");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("[KeyRecursoA_ja_JPproperties="+(rb1.getString("KeyRecursoA_ja_JPproperties"))+"]");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("[KeyRecursoA_ja_BRproperties="+(rb1.getString("KeyRecursoA_ja_BRproperties"))+"]");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("[KeyRecursoA_japroperties="+(rb1.getString("KeyRecursoA_japroperties"))+"]");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("[KeyRecursoA_it_ITproperties="+(rb1.getString("KeyRecursoA_it_ITproperties"))+"]");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("[KeyRecursoA_itproperties="+(rb1.getString("KeyRecursoA_it_ITproperties"))+"]");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

		rb1 = ResourceBundle.getBundle("pkgFProperties.RecursoA", new Locale("ja", "BR"));
		System.out.println();
		System.out.println("[rb1.getLocale()="+(rb1.getLocale())+"]");
		try {
			System.out.println("[Key0RecursoAproperties="+(rb1.getString("Key0RecursoAproperties"))+"]");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("[KeyRecursoAproperties="+(rb1.getString("KeyRecursoAproperties"))+"]");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("[KeyRecursoA_ja_JPproperties="+(rb1.getString("KeyRecursoA_ja_JPproperties"))+"]");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("[KeyRecursoA_ja_BRproperties="+(rb1.getString("KeyRecursoA_ja_BRproperties"))+"]");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("[KeyRecursoA_japroperties="+(rb1.getString("KeyRecursoA_japroperties"))+"]");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("[KeyRecursoA_it_ITproperties="+(rb1.getString("KeyRecursoA_it_ITproperties"))+"]");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("[KeyRecursoA_itproperties="+(rb1.getString("KeyRecursoA_it_ITproperties"))+"]");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

		rb1 = ResourceBundle.getBundle("pkgFProperties.RecursoA");
		System.out.println();
		System.out.println("[rb1.getLocale()="+(rb1.getLocale())+"]");
		try {
			System.out.println("[Key0RecursoAproperties="+(rb1.getString("Key0RecursoAproperties"))+"]");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("[KeyRecursoAproperties="+(rb1.getString("KeyRecursoAproperties"))+"]");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("[KeyRecursoA_ja_JPproperties="+(rb1.getString("KeyRecursoA_ja_JPproperties"))+"]");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("[KeyRecursoA_ja_BRproperties="+(rb1.getString("KeyRecursoA_ja_BRproperties"))+"]");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("[KeyRecursoA_japroperties="+(rb1.getString("KeyRecursoA_japroperties"))+"]");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("[KeyRecursoA_it_ITproperties="+(rb1.getString("KeyRecursoA_it_ITproperties"))+"]");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("[KeyRecursoA_itproperties="+(rb1.getString("KeyRecursoA_it_ITproperties"))+"]");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

		rb1 = ResourceBundle.getBundle("pkgFProperties.RecursoA", new Locale("ja", "JP"));
		System.out.println();
		System.out.println("[rb1.getLocale()="+(rb1.getLocale())+"]");
		try {
			System.out.println("[Key0RecursoAproperties="+(rb1.getString("Key0RecursoAproperties"))+"]");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("[KeyRecursoAproperties="+(rb1.getString("KeyRecursoAproperties"))+"]");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("[KeyRecursoA_ja_JPproperties="+(rb1.getString("KeyRecursoA_ja_JPproperties"))+"]");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("[KeyRecursoA_ja_BRproperties="+(rb1.getString("KeyRecursoA_ja_BRproperties"))+"]");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("[KeyRecursoA_japroperties="+(rb1.getString("KeyRecursoA_japroperties"))+"]");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("[KeyRecursoA_it_ITproperties="+(rb1.getString("KeyRecursoA_it_ITproperties"))+"]");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("[KeyRecursoA_itproperties="+(rb1.getString("KeyRecursoA_it_ITproperties"))+"]");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}



}
