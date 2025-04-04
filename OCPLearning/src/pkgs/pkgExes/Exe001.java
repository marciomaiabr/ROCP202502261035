package pkgs.pkgExes;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exe001 {

	public static void main(String[] args) {
		System.out.println("<>");
		m1(args);
		System.out.println("</>");
	}

	public static void m1(String[] args) {
		System.out.println("Exe001.m1()");
		try {
			Path root = Paths.get("c:", "temp");
			if(Files.notExists(root.resolve(Paths.get("folderB","folderBB","202504040905.txt")))) {
				Files.createDirectories(root.resolve(Paths.get("folderA","folderAA","folderAAA")));
				Files.createDirectories(root.resolve(Paths.get("folderB","folderBB","folderBBB")));
				Files.createDirectories(root.resolve(Paths.get("folderC","folderCC","folderCCC")));
				Files.createFile(root.resolve(Paths.get("folderB","folderBB","202504040905.txt")));
			}
			try(DirectoryStream<Path> directoryStream = Files.newDirectoryStream(root)){
				for(Path path : directoryStream) {
					System.out.println(path);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*

*/

/*

*/

/*

*/
