package pkgs.pkgExes;

import java.util.stream.Stream;

public class Exe001 {



	public static void main(String[] args) {

		Stream.of("Ana","Bia","Carla").findFirst().ifPresent(System.out::println);

	}



}
