package pkgs.pkgExes;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exe001 {

	static {
		System.out.println(LocalDateTime.now());
	}

	public static void main(String[] args) {

		try {
			System.out.println("<>");
			sm1(args);
			new Exe001().im1(args);
			System.out.println("</>");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			Runtime.getRuntime().exec("cmd.exe /c C:\\Users\\Administrador\\git\\ROCP202502261035\\OCPLearning\\logs\\logMM.txt");
		} catch (Exception e) {}

	}

	public static void sm1(String[] args) {
		System.out.println("Exe001.sm1()");
	}

	public void im1(String[] args) {
		System.out.println("Exe001.im1()");

		System.out.println("\nexemplo com map()\n");
		try (Stream<String> input = Files.lines(Paths.get(getClass().getResource("/txts/filePessoas.txt").toURI()))) {
			Stream<String[]> inputStream = input.map(line -> line.split(" "));
			inputStream.map(array -> {System.out.println("[array="+(array)+"]"); return Arrays.stream(array);}).forEach(v->System.out.println("[v="+(v)+"]"));
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("\nexemplo com flatMap()\n");
		try (Stream<String> input = Files.lines(Paths.get(getClass().getResource("/txts/filePessoas.txt").toURI()))) {
			Stream<String[]> inputStream = input.map(line -> line.split(" "));
			inputStream.flatMap(array -> {System.out.println("[array="+(array)+"]"); return Arrays.stream(array);}).forEach(v->System.out.println("[v="+(v)+"]"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*

*/
