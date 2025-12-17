package pkgs.pkgExes;

import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Exe001 {

	public static void main(String[] args) {

		try {
			PrintWriter o = new PrintWriter("C:\\temp\\f202512170754.txt");
			o.write("c202512170754");
			o.flush();
			o.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			PrintWriter o = new PrintWriter(new FileOutputStream("C:\\temp\\f202512170755.txt"));
			o.write("cf202512170755");
			o.flush();
			o.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
