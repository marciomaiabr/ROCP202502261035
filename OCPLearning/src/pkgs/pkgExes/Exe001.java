package pkgs.pkgExes;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Exe001 {

	public boolean findHome() {
		Path pathA = Paths.get("/home/java/d1/d2/d3/./.././");
		Path pathB = Paths.get("/home/java/country/d1/d2/./.././Swift.mp3");
		Path pathC = pathA.relativize(pathB);
		System.out.println(pathC);
		pathA = Paths.get("/home/java/");
		pathB = Paths.get("/home/java/country/Swift.mp3");
		pathC = pathA.relativize(pathB);
		System.out.println(pathC);
		pathA = Paths.get("/home/java/");
		pathB = Paths.get("home/java/country/Swift.mp3");
		//System.out.println(pathA.relativize(pathB));//IllegalArgumentException: 'other' is different type of Path
		pathA = Paths.get("home/java/");
		pathB = Paths.get("home/java/country/Swift.mp3");
		pathC = pathA.relativize(pathB);
		System.out.println(pathC);
		pathA = Paths.get("home1/java2/");
		pathB = Paths.get("home3/java4/country/Swift.mp3");
		pathC = pathA.relativize(pathB);
		System.out.println(pathC);
		System.out.println("\n");
		Path oftenTraveled = Paths.get("/highway/street/spot.txt");
		Path lessTraveled = null;
		lessTraveled = Paths.get("/highway/street/house/.");
		System.out.println(lessTraveled);
		lessTraveled = lessTraveled.normalize();
		System.out.println(lessTraveled);
		lessTraveled = Paths.get("/highway/street/house/../.");
		System.out.println(lessTraveled);
		lessTraveled = lessTraveled.resolve("spot.txt");
		System.out.println(lessTraveled);
		lessTraveled = lessTraveled.normalize();
		System.out.println(lessTraveled);
		return oftenTraveled.equals(lessTraveled);
	}

	public static void main(String[] args) {

		System.out.print("AM I HOME? " +(new Exe001().findHome() ? "yes" : " no"));

	}

}
