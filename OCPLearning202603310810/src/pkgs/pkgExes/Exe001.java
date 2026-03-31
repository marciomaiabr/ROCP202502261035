package pkgs.pkgExes;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;

public class Exe001 {



	public static void main(String[] args) {

		new Exe001().go();

	}

	private void go() {

		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\temp\\alphabetical.txt"));
			br.skip(1);
			br.read();
			br.skip(1);
			br.read();
			br.mark(4);
			br.skip(1);
			br.reset();
			br.reset();
			br.reset();
			br.read();
			br.skip(1);
			br.mark(1);
			br.read();
			br.skip(1);
			br.reset();
			System.out.println("[(char)br.read()="+((char)br.read())+"]");
			//br.mark(-5);//IllegalArgumentException: Read-ahead limit < 0
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			InputStream is = new FileInputStream("C:\\temp\\alphabetical.txt");
			is.skip(1);
			is.read();
			is.skip(1);
			is.read();
			is.mark(4);
			is.skip(1);
			is.reset();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}



}
