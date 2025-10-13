package pkgs.pkgExes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exe001 {

	public static void main(String[] args) {
		System.out.println(LocalDateTime.of(2017,10,27,14,22,54,0).format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh-mm-ss")));
		System.out.println(LocalDateTime.of(2017,10,27,14,22,54,0).format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh-mm-ss a")));
		//System.out.println(LocalDateTime.of(2017,10,27,14,22,54,0).format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh-mm-ss z")));//DateTimeException: Unable to extract value: class java.time.LocalDateTime
	}

}
