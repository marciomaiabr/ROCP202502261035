package pkgs.pkgExes;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class Exe001 {



	public static void main(String[] args) {

		try {
			InputStream is = null;
			is = new ByteArrayInputStream("AEIOU".getBytes());
			System.out.println(is);
			System.out.println((char)is.read());
			is = new ByteArrayInputStream("AEIOU".getBytes());
			System.out.println(is);
			System.out.println(is.skip(10));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}



}
