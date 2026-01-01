package pkgs.pkgExes;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.Writer;

public class Exe001 {



	public static void main(String[] args) {

		try (OutputStream os = new FileOutputStream("C:\\temp\\f202601010955.txt");) {
			os.write("c202601010955".getBytes());
		} catch (Exception e) {
			e.printStackTrace();
		}

		try (Writer w = new FileWriter("C:\\temp\\f202601010959.txt");) {
			w.write("c202601010959");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
