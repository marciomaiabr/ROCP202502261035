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
			/*try {
				Files.createDirectories(root.resolve(Paths.get("folderA","folderAA","folderAAA")));
				Files.createDirectories(root.resolve(Paths.get("folderB","folderBB","folderBBB")));
				Files.createDirectories(root.resolve(Paths.get("folderC","folderCC","folderCCC")));
				Files.createFile(root.resolve(Paths.get("folderB","folderBB","fz.txt")));
				Files.createFile(root.resolve(Paths.get("folderB","folderBB","fa.txt")));
			} catch(Exception e) {}*/
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
C:\temp>dir /s
 O volume na unidade C não tem nome.
 O Número de Série do Volume é AE6E-CC14

 Pasta de C:\temp

14/04/2025  08:52    <DIR>          .
14/04/2025  08:52    <DIR>          ..
14/04/2025  08:52    <DIR>          PastaDoAdm2
               0 arquivo(s)              0 bytes

     Total de Arquivos na Lista:
               0 arquivo(s)              0 bytes
               3 pasta(s)   71.401.869.312 bytes disponíveis
*/

/*
<>
Exe001.m1()
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp]
TestSimpleFileVisitor.visitFileFailed()[file=c:\temp\PastaDoAdm2][exc=java.nio.file.AccessDeniedException: c:\temp\PastaDoAdm2]
TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp][exc=null]
</>
*/

/*

*/
