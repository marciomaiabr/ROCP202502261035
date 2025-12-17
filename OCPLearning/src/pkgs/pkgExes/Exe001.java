package pkgs.pkgExes;

import java.io.FileOutputStream;

public class Exe001 {

	public static void main(String[] args) {

		try {
			FileOutputStream o = new FileOutputStream("C:\\temp\\f202512170746.txt");
			o.write("c202512170746".getBytes());
			o.flush();
			o.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
