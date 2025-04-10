package pkgs.pkgExes;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

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
				Files.createFile(root.resolve("R.txt"));
				Files.createFile(root.resolve("K.txt"));
				Files.createFile(root.resolve("w.txt"));
				Files.createFile(root.resolve("Y.txt"));
				Files.createFile(root.resolve("z.txt"));
				Files.createDirectories(root.resolve(Paths.get("folderA","folderAA","folderAAA")));
				Files.createDirectories(root.resolve(Paths.get("folderB","folderBB","folderBBB")));
				Files.createDirectories(root.resolve(Paths.get("folderC","folderCC","folderCCC")));
				Files.createFile(root.resolve(Paths.get("folderB","folderBB","fz.txt")));
				Files.createFile(root.resolve(Paths.get("folderB","folderBB","fa.txt")));
			}
			SimpleFileVisitor<Path> simpleFileVisitor = new SimpleFileVisitor<Path>() {
				@Override
				public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
					System.out.println("TestSimpleFileVisitor.preVisitDirectory()"+"[dir="+(dir)+"]");
					return FileVisitResult.CONTINUE;
				}
				@Override
				public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
					System.out.println("TestSimpleFileVisitor.visitFile()"+"[file="+(file)+"]");
					return FileVisitResult.CONTINUE;
				}
				@Override
				public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
					System.out.println("TestSimpleFileVisitor.visitFileFailed()"+"[file="+(file)+"]"+"[exc="+(exc)+"]");
					return FileVisitResult.CONTINUE;
				}
				@Override
				public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
					System.out.println("TestSimpleFileVisitor.postVisitDirectory()"+"[dir="+(dir)+"]"+"[exc="+(exc)+"]");
					return FileVisitResult.CONTINUE;
				}
			};
			Files.walkFileTree(root, simpleFileVisitor);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*

*/

/*
<>
Exe001.m1()


TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp]


TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderA]
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderA\folderAA]
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderA\folderAA\folderAAA]

TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp\folderA\folderAA\folderAAA][exc=null]
TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp\folderA\folderAA][exc=null]
TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp\folderA][exc=null]


TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderB]
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderB\folderBB]

TestSimpleFileVisitor.visitFile()[file=c:\temp\folderB\folderBB\fa.txt]

TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderB\folderBB\folderBBB]

TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp\folderB\folderBB\folderBBB][exc=null]

TestSimpleFileVisitor.visitFile()[file=c:\temp\folderB\folderBB\fz.txt]

TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp\folderB\folderBB][exc=null]
TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp\folderB][exc=null]


TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderC]
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderC\folderCC]
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderC\folderCC\folderCCC]

TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp\folderC\folderCC\folderCCC][exc=null]
TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp\folderC\folderCC][exc=null]
TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp\folderC][exc=null]


TestSimpleFileVisitor.visitFile()[file=c:\temp\K.txt]
TestSimpleFileVisitor.visitFile()[file=c:\temp\R.txt]
TestSimpleFileVisitor.visitFile()[file=c:\temp\w.txt]
TestSimpleFileVisitor.visitFile()[file=c:\temp\Y.txt]
TestSimpleFileVisitor.visitFile()[file=c:\temp\z.txt]


TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp][exc=null]


</>
*/

/*

*/
