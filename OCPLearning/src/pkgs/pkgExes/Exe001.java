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
			try {
				Files.createDirectories(root.resolve(Paths.get("folderA","folderAA","folderAAA")));
				Files.createDirectories(root.resolve(Paths.get("folderB","folderBB","folderBBB")));
				Files.createDirectories(root.resolve(Paths.get("folderC","folderCC","folderCCC")));
				Thread.sleep(1000*62);
				Files.createFile(root.resolve(Paths.get("folderB","folderBB","fz.txt")));
				Thread.sleep(1000*65);
				Files.createFile(root.resolve(Paths.get("folderB","folderBB","fa.txt")));
				Thread.sleep(1000*68);
			} catch(Exception e) {}
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

14/04/2025  07:51    <DIR>          .
14/04/2025  07:51    <DIR>          ..
14/04/2025  07:51    <DIR>          folderA
14/04/2025  07:51    <DIR>          folderB
14/04/2025  07:51    <DIR>          folderC
               0 arquivo(s)              0 bytes

 Pasta de C:\temp\folderA

14/04/2025  07:51    <DIR>          .
14/04/2025  07:51    <DIR>          ..
14/04/2025  07:51    <DIR>          folderAA
               0 arquivo(s)              0 bytes

 Pasta de C:\temp\folderA\folderAA

14/04/2025  07:51    <DIR>          .
14/04/2025  07:51    <DIR>          ..
14/04/2025  07:51    <DIR>          folderAAA
               0 arquivo(s)              0 bytes

 Pasta de C:\temp\folderA\folderAA\folderAAA

14/04/2025  07:51    <DIR>          .
14/04/2025  07:51    <DIR>          ..
               0 arquivo(s)              0 bytes

 Pasta de C:\temp\folderB

14/04/2025  07:51    <DIR>          .
14/04/2025  07:51    <DIR>          ..
14/04/2025  07:53    <DIR>          folderBB
               0 arquivo(s)              0 bytes

 Pasta de C:\temp\folderB\folderBB

14/04/2025  07:53    <DIR>          .
14/04/2025  07:53    <DIR>          ..
14/04/2025  07:53                 0 fa.txt
14/04/2025  07:51    <DIR>          folderBBB
14/04/2025  07:52                 0 fz.txt
               2 arquivo(s)              0 bytes

 Pasta de C:\temp\folderB\folderBB\folderBBB

14/04/2025  07:51    <DIR>          .
14/04/2025  07:51    <DIR>          ..
               0 arquivo(s)              0 bytes

 Pasta de C:\temp\folderC

14/04/2025  07:51    <DIR>          .
14/04/2025  07:51    <DIR>          ..
14/04/2025  07:51    <DIR>          folderCC
               0 arquivo(s)              0 bytes

 Pasta de C:\temp\folderC\folderCC

14/04/2025  07:51    <DIR>          .
14/04/2025  07:51    <DIR>          ..
14/04/2025  07:51    <DIR>          folderCCC
               0 arquivo(s)              0 bytes

 Pasta de C:\temp\folderC\folderCC\folderCCC

14/04/2025  07:51    <DIR>          .
14/04/2025  07:51    <DIR>          ..
               0 arquivo(s)              0 bytes

     Total de Arquivos na Lista:
               2 arquivo(s)              0 bytes
              29 pasta(s)   71.558.111.232 bytes disponíveis
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


TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp][exc=null]


</>
*/

/*
apesar de
14/04/2025  07:52                 0 fz.txt
14/04/2025  07:53                 0 fa.txt

a sequencia da listagem fica
TestSimpleFileVisitor.visitFile()[file=c:\temp\folderB\folderBB\fa.txt]
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderB\folderBB\folderBBB]
TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp\folderB\folderBB\folderBBB][exc=null]
TestSimpleFileVisitor.visitFile()[file=c:\temp\folderB\folderBB\fz.txt]

aparentemente ordem alfabetica

*/
