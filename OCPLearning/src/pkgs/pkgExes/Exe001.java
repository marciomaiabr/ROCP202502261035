package pkgs.pkgExes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exe001 {

	public static void main(String[] args) {

		System.out.println(LocalDate.now().format(DateTimeFormatter.ISO_DATE));

		System.out.println(DateTimeFormatter.ISO_DATE.format(LocalDate.now()));

	}

}
