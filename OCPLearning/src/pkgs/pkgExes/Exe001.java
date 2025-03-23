package pkgs.pkgExes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class Exe001 {

	public static void main(String[] args) {
		System.out.println("<>");
		m1();
		System.out.println("</>");
	}

	public static void m1() {
		System.out.println("Exe001.m1()");
		try {
			Properties p = new Properties();
			p.setProperty("pmm", "vmm");
			FileOutputStream fos = new FileOutputStream("C:\\temp\\myProps1.props");
			p.store(fos, "test-comment");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			Properties p = new Properties();
			FileInputStream fis = new FileInputStream("C:\\temp\\myProps1.props");
			p.load(fis);
			System.out.println(p.getProperty("pmm"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*
<>
Exe001.m1()
null
vmm
</>
*/

/*
System.getProperties() não persiste values
*/
