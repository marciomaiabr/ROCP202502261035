package pkgs.pkgExes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exe001 {

	public static void main(String[] args) {
		System.out.println("<>");
		m1(args);
		System.out.println("</>");
	}

	public static void m1(String[] args) {
		System.out.println("Exe001.m1()");
		try {
			File file = new File("C:\\temp\\202503280725.txt");
			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter
				.append(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss_n"))+"\n")
				.append(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss_n"))+"\n");
			bufferedWriter.close();
			fileWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*
C:\temp\202503280725.txt
20250328072710_432000000
20250328072710_438000000
*/

/*
<>
Exe001.m1()
</>
*/

/*

*/
