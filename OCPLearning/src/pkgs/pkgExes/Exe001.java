package pkgs.pkgExes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Exe001 {

	public static void main(String[] args) {

		List<String> strings = Arrays.asList("2025-01-01","2025-02-02","2025-03-03");
		strings.forEach(System.out::println);
		System.out.println();
		List<LocalDate> dates = strings.stream().map(v->LocalDate.parse(v)).collect(Collectors.toList());
		dates.forEach(v->System.out.println(v.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
	}

}
