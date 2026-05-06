package pkgs.pkgExes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.List;
import java.util.stream.Stream;

public class Exe001 {



	public static void main(String[] args) {

		new Exe001().go();

	}

	private void go() {
		Path p = null;
		System.out.println();
		p = Paths.get("d1/d12/d123/d1234/d12345/d123456/d1234567");
		System.out.println("["+p+"="+(p)+"]"+"[p.getNameCount()="+(p.getNameCount())+"]"+"");
		//System.out.println("["+p+"="+(p.subpath(0, 0))+"]"+"");//IllegalArgumentException
		//System.out.println("["+p+"="+(p.subpath(1, 1))+"]"+"");//IllegalArgumentException
		System.out.println("["+p+".subpath(0, 1)="+(p.subpath(0, 1))+"]"+"");
		System.out.println("["+p+".subpath(2, 5)="+(p.subpath(2, 5))+"]"+"");
		System.out.println("["+p+".getName(0)="+(p.getName(0))+"]"+"");
		System.out.println("["+p+".getName(1)="+(p.getName(1))+"]"+"");
		System.out.println("["+p+".getName(2)="+(p.getName(2))+"]"+"");
		System.out.println("["+p+".getName(3)="+(p.getName(3))+"]"+"");
		System.out.println();
		p = Paths.get("/d1/d12/d123/d1234/d12345/d123456/d1234567");
		System.out.println("["+p+"="+(p)+"]"+"[p.getNameCount()="+(p.getNameCount())+"]"+"");
		System.out.println("["+p+".subpath(0, 1)="+(p.subpath(0, 1))+"]"+"");
		System.out.println("["+p+".subpath(2, 5)="+(p.subpath(2, 5))+"]"+"");
		System.out.println("["+p+".getName(0)="+(p.getName(0))+"]"+"");
		System.out.println("["+p+".getName(1)="+(p.getName(1))+"]"+"");
		System.out.println("["+p+".getName(2)="+(p.getName(2))+"]"+"");
		System.out.println("["+p+".getName(3)="+(p.getName(3))+"]"+"");
		System.out.println();
		p = Paths.get("d1/./d12/../d123/./d1234/../d12345/./d123456/../d1234567");
		System.out.println("["+p+"="+(p)+"]"+"[p.getNameCount()="+(p.getNameCount())+"]"+"");
		System.out.println("["+p+".subpath(0, 1)="+(p.subpath(0, 1))+"]"+"");
		System.out.println("["+p+".subpath(2, 5)="+(p.subpath(2, 5))+"]"+"");
		System.out.println("["+p+".subpath(2, 8)="+(p.subpath(2, 8))+"]"+"");
		System.out.println("["+p+".getName(0)="+(p.getName(0))+"]"+"");
		System.out.println("["+p+".getName(1)="+(p.getName(1))+"]"+"");
		System.out.println("["+p+".getName(2)="+(p.getName(2))+"]"+"");
		System.out.println("["+p+".getName(3)="+(p.getName(3))+"]"+"");
		System.out.println();
		p = Paths.get("/d1/./d12/../d123/./d1234/../d12345/./d123456/../d1234567");
		System.out.println("["+p+"="+(p)+"]"+"[p.getNameCount()="+(p.getNameCount())+"]"+"");
		System.out.println("["+p+".subpath(0, 1)="+(p.subpath(0, 1))+"]"+"");
		System.out.println("["+p+".subpath(2, 5)="+(p.subpath(2, 5))+"]"+"");
		System.out.println("["+p+".subpath(2, 8)="+(p.subpath(2, 8))+"]"+"");
		System.out.println("["+p+".getName(0)="+(p.getName(0))+"]"+"");
		System.out.println("["+p+".getName(1)="+(p.getName(1))+"]"+"");
		System.out.println("["+p+".getName(2)="+(p.getName(2))+"]"+"");
		System.out.println("["+p+".getName(3)="+(p.getName(3))+"]"+"");
	}

	private void go4() {
		try {
			System.out.println(Files.isSameFile(Paths.get("C:\\temp\\d1\\f202605061054.txt"), Paths.get("C:\\temp\\d1\\d12\\d123\\..\\..\\f202605061054.txt")));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void go3() {
		System.out.println(Paths.get("C:\\temp\\qqc").toAbsolutePath());
		System.out.println(Paths.get("temp\\qqc").toAbsolutePath());
		try {
			System.out.println(Paths.get("C:\\temp\\qqc").toRealPath());
			System.out.println(Paths.get("temp\\qqc").toRealPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void go2() {
		System.out.println(Paths.get("/sing"));
		System.out.println(Paths.get("/sing").getParent());
		System.out.println(Paths.get("/sing").getParent().getRoot());
		System.out.println(Paths.get("/sing").getParent().getRoot().getParent());
		System.out.println(Paths.get("/sing").getParent().getRoot().getRoot().getRoot());
		System.out.println(Paths.get("/sing").getParent().getRoot().getParent().getRoot());
	}

	private void go1() {
		Path oftenTraveled = Paths.get("/highway/street/spot.txt");
		Path lessTraveled = Paths.get("/highway/street/house/../.");
		lessTraveled.resolve("spot.txt");
		System.out.println("[oftenTraveled.equals(lessTraveled)="+(oftenTraveled.equals(lessTraveled))+"]"+"");
		System.out.println("[oftenTraveled.equals(lessTraveled)="+(oftenTraveled.equals(lessTraveled.resolve("spot.txt")))+"]"+"");
		System.out.println("[oftenTraveled.equals(lessTraveled)="+(oftenTraveled.equals(lessTraveled.resolve("spot.txt").normalize()))+"]"+"");
	}



}
