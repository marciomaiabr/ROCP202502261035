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
			Path folderAB = Paths.get("c:", "temp", "folderA", "folderAB");
			/*try {
				Files.createDirectories(root.resolve(Paths.get("folderA","folderAA","folderAAA")));
				Files.createDirectories(root.resolve(Paths.get("folderA","folderAB","folderABA")));
				Files.createDirectories(root.resolve(Paths.get("folderA","folderAC","folderACA")));
			} catch(Exception e) {}*/
			SimpleFileVisitor<Path> simpleFileVisitor = new SimpleFileVisitor<Path>() {
				@Override
				public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
					System.out.println("TestSimpleFileVisitor.preVisitDirectory()"+"[dir="+(dir)+"]");
					FileVisitResult r = null;
					if(dir!= null && dir.equals(folderAB))
						r = FileVisitResult.CONTINUE;
					else
						r = FileVisitResult.CONTINUE;
					System.out.println(r);
					return r;
				}
				@Override
				public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
					System.out.println("TestSimpleFileVisitor.visitFile()"+"[file="+(file)+"]");
					FileVisitResult r = null;
					r = FileVisitResult.CONTINUE;
					System.out.println(r);
					return r;
				}
				@Override
				public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
					System.out.println("TestSimpleFileVisitor.visitFileFailed()"+"[file="+(file)+"]"+"[exc="+(exc)+"]");
					FileVisitResult r = null;
					r = FileVisitResult.CONTINUE;
					System.out.println(r);
					return r;
				}
				@Override
				public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
					System.out.println("TestSimpleFileVisitor.postVisitDirectory()"+"[dir="+(dir)+"]"+"[exc="+(exc)+"]");
					FileVisitResult r = null;
					if(dir!= null && dir.equals(folderAB))
						r = FileVisitResult.TERMINATE;
					else
						r = FileVisitResult.CONTINUE;
					System.out.println(r);
					return r;
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

16/04/2025  10:35    <DIR>          .
16/04/2025  10:35    <DIR>          ..
16/04/2025  10:35    <DIR>          folderA
               0 arquivo(s)              0 bytes

 Pasta de C:\temp\folderA

16/04/2025  10:35    <DIR>          .
16/04/2025  10:35    <DIR>          ..
16/04/2025  10:35    <DIR>          folderAA
16/04/2025  10:35    <DIR>          folderAB
16/04/2025  10:35    <DIR>          folderAC
               0 arquivo(s)              0 bytes

 Pasta de C:\temp\folderA\folderAA

16/04/2025  10:35    <DIR>          .
16/04/2025  10:35    <DIR>          ..
16/04/2025  10:35    <DIR>          folderAAA
               0 arquivo(s)              0 bytes

 Pasta de C:\temp\folderA\folderAA\folderAAA

16/04/2025  10:35    <DIR>          .
16/04/2025  10:35    <DIR>          ..
               0 arquivo(s)              0 bytes

 Pasta de C:\temp\folderA\folderAB

16/04/2025  10:35    <DIR>          .
16/04/2025  10:35    <DIR>          ..
16/04/2025  10:35    <DIR>          folderABA
               0 arquivo(s)              0 bytes

 Pasta de C:\temp\folderA\folderAB\folderABA

16/04/2025  10:35    <DIR>          .
16/04/2025  10:35    <DIR>          ..
               0 arquivo(s)              0 bytes

 Pasta de C:\temp\folderA\folderAC

16/04/2025  10:35    <DIR>          .
16/04/2025  10:35    <DIR>          ..
16/04/2025  10:35    <DIR>          folderACA
               0 arquivo(s)              0 bytes

 Pasta de C:\temp\folderA\folderAC\folderACA

16/04/2025  10:35    <DIR>          .
16/04/2025  10:35    <DIR>          ..
               0 arquivo(s)              0 bytes

     Total de Arquivos na Lista:
               0 arquivo(s)              0 bytes
              23 pasta(s)   76.609.794.048 bytes disponíveis
*/

/*
<>
Exe001.m1()
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp]
CONTINUE
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderA]
CONTINUE
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderA\folderAA]
CONTINUE
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderA\folderAA\folderAAA]
CONTINUE
TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp\folderA\folderAA\folderAAA][exc=null]
CONTINUE
TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp\folderA\folderAA][exc=null]
CONTINUE
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderA\folderAB]
CONTINUE
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderA\folderAB\folderABA]
CONTINUE
TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp\folderA\folderAB\folderABA][exc=null]
CONTINUE
TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp\folderA\folderAB][exc=null]
CONTINUE
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderA\folderAC]
CONTINUE
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderA\folderAC\folderACA]
CONTINUE
TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp\folderA\folderAC\folderACA][exc=null]
CONTINUE
TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp\folderA\folderAC][exc=null]
CONTINUE
TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp\folderA][exc=null]
CONTINUE
TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp][exc=null]
CONTINUE
</>

<>
Exe001.m1()
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp]
CONTINUE
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderA]
CONTINUE
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderA\folderAA]
CONTINUE
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderA\folderAA\folderAAA]
CONTINUE
TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp\folderA\folderAA\folderAAA][exc=null]
CONTINUE
TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp\folderA\folderAA][exc=null]
CONTINUE
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderA\folderAB]
SKIP_SIBLINGS
TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp\folderA][exc=null]
CONTINUE
TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp][exc=null]
CONTINUE
</>

<>
Exe001.m1()
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp]
CONTINUE
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderA]
CONTINUE
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderA\folderAA]
CONTINUE
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderA\folderAA\folderAAA]
CONTINUE
TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp\folderA\folderAA\folderAAA][exc=null]
CONTINUE
TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp\folderA\folderAA][exc=null]
CONTINUE
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderA\folderAB]
SKIP_SUBTREE
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderA\folderAC]
CONTINUE
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderA\folderAC\folderACA]
CONTINUE
TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp\folderA\folderAC\folderACA][exc=null]
CONTINUE
TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp\folderA\folderAC][exc=null]
CONTINUE
TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp\folderA][exc=null]
CONTINUE
TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp][exc=null]
CONTINUE
</>

<>
Exe001.m1()
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp]
CONTINUE
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderA]
CONTINUE
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderA\folderAA]
CONTINUE
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderA\folderAA\folderAAA]
CONTINUE
TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp\folderA\folderAA\folderAAA][exc=null]
CONTINUE
TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp\folderA\folderAA][exc=null]
CONTINUE
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderA\folderAB]
TERMINATE
</>



<>
Exe001.m1()
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp]
CONTINUE
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderA]
CONTINUE
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderA\folderAA]
CONTINUE
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderA\folderAA\folderAAA]
CONTINUE
TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp\folderA\folderAA\folderAAA][exc=null]
CONTINUE
TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp\folderA\folderAA][exc=null]
CONTINUE
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderA\folderAB]
CONTINUE
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderA\folderAB\folderABA]
CONTINUE
TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp\folderA\folderAB\folderABA][exc=null]
CONTINUE
TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp\folderA\folderAB][exc=null]
SKIP_SIBLINGS
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderA\folderAC]
CONTINUE
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderA\folderAC\folderACA]
CONTINUE
TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp\folderA\folderAC\folderACA][exc=null]
CONTINUE
TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp\folderA\folderAC][exc=null]
CONTINUE
TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp\folderA][exc=null]
CONTINUE
TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp][exc=null]
CONTINUE
</>

<>
Exe001.m1()
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp]
CONTINUE
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderA]
CONTINUE
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderA\folderAA]
CONTINUE
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderA\folderAA\folderAAA]
CONTINUE
TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp\folderA\folderAA\folderAAA][exc=null]
CONTINUE
TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp\folderA\folderAA][exc=null]
CONTINUE
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderA\folderAB]
CONTINUE
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderA\folderAB\folderABA]
CONTINUE
TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp\folderA\folderAB\folderABA][exc=null]
CONTINUE
TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp\folderA\folderAB][exc=null]
SKIP_SUBTREE
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderA\folderAC]
CONTINUE
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderA\folderAC\folderACA]
CONTINUE
TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp\folderA\folderAC\folderACA][exc=null]
CONTINUE
TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp\folderA\folderAC][exc=null]
CONTINUE
TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp\folderA][exc=null]
CONTINUE
TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp][exc=null]
CONTINUE
</>

<>
Exe001.m1()
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp]
CONTINUE
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderA]
CONTINUE
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderA\folderAA]
CONTINUE
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderA\folderAA\folderAAA]
CONTINUE
TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp\folderA\folderAA\folderAAA][exc=null]
CONTINUE
TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp\folderA\folderAA][exc=null]
CONTINUE
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderA\folderAB]
CONTINUE
TestSimpleFileVisitor.preVisitDirectory()[dir=c:\temp\folderA\folderAB\folderABA]
CONTINUE
TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp\folderA\folderAB\folderABA][exc=null]
CONTINUE
TestSimpleFileVisitor.postVisitDirectory()[dir=c:\temp\folderA\folderAB][exc=null]
TERMINATE
</>

*/

/*

*/
