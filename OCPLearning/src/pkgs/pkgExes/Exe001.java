package pkgs.pkgExes;

import java.io.FileReader;

public class Exe001 {

	public static void main(String[] args) {

		try {
			FileReader o = new FileReader("C:\\temp\\f202512170748.txt");
			String s = "";
			int r = 0;
			while((r = o.read())>=0)
				s+=(char)r;
			System.out.println(s);
			o.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
