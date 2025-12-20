package pkgs.pkgExes;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Exe001 {

	public static void main(String[] args) {

		Path path = Paths.get("C:\\temp\\f202512201045.txt");
		System.out.println("[path="+(path)+"]");

		System.out.println();

		Path path0 = path.getName(0);
		System.out.println("[path0="+(path0)+"]"+"");
		System.out.println("[path0.toAbsolutePath()="+(path0.toAbsolutePath())+"]"+"");

		System.out.println();

		Path path1 = path.getName(1);
		System.out.println("[path1="+(path1)+"]"+"");
		System.out.println("[path1.toAbsolutePath()="+(path1.toAbsolutePath())+"]"+"");

	}

}
