package pkgs.pkgExes;



public class Exe001 {



	public static void main(String[] args) {

		try {
			Class.forName("qqc");//ClassNotFoundException: qqc
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
