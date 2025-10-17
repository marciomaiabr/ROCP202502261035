package pkgs.pkgExes;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Exe001 {

	public static void main(String[] args) {

		Path PATH_C_PASTA1_PASTA_A = Paths.get("c:/pasta1/pastaA");
		Path PATH_C_PASTA1_PASTA_B = Paths.get("c:/pasta1/pastaB");
		Path PATH_PASTA1_PASTA_A = Paths.get("pasta1/pastaA");
		Path PATH_PASTA1_PASTA_B = Paths.get("pasta1/pastaB");
		Path PATH_PASTA2_PASTA_C = Paths.get("pasta2/pastaC");
		Path PATH_PASTA_D = Paths.get("pastaD");
		Path PATH_DOT_DOT_PASTA_E = Paths.get("..\\pastaE");
		Path PATH_DOT_PASTA_F = Paths.get(".\\pastaF");
		Path PATH_DOT_DOT = Paths.get("..\\");
		Path PATH_DOT = Paths.get(".\\");

		System.out.println("\nrelativize\n");
		System.out.println("["+"\""+PATH_C_PASTA1_PASTA_A+"\""+".relativize("+"\""+PATH_C_PASTA1_PASTA_B+"\""+")="+PATH_C_PASTA1_PASTA_A.relativize(PATH_C_PASTA1_PASTA_B)+"]");
		System.out.println("["+"\""+PATH_C_PASTA1_PASTA_B+"\""+".relativize("+"\""+PATH_C_PASTA1_PASTA_A+"\""+")="+PATH_C_PASTA1_PASTA_B.relativize(PATH_C_PASTA1_PASTA_A)+"]");
		System.out.println("["+"\""+PATH_PASTA1_PASTA_A+"\""+".relativize("+"\""+PATH_PASTA1_PASTA_B+"\""+")="+PATH_PASTA1_PASTA_A.relativize(PATH_PASTA1_PASTA_B)+"]");
		System.out.println("["+"\""+PATH_PASTA1_PASTA_B+"\""+".relativize("+"\""+PATH_PASTA1_PASTA_A+"\""+")="+PATH_PASTA1_PASTA_B.relativize(PATH_PASTA1_PASTA_A)+"]");
		System.out.println("["+"\""+PATH_PASTA1_PASTA_A+"\""+".relativize("+"\""+PATH_PASTA2_PASTA_C+"\""+")="+PATH_PASTA1_PASTA_A.relativize(PATH_PASTA2_PASTA_C)+"]");
		System.out.println("["+"\""+PATH_PASTA2_PASTA_C+"\""+".relativize("+"\""+PATH_PASTA1_PASTA_A+"\""+")="+PATH_PASTA2_PASTA_C.relativize(PATH_PASTA1_PASTA_A)+"]");
		System.out.println("["+"\""+PATH_PASTA1_PASTA_A+"\""+".relativize("+"\""+PATH_PASTA_D+"\""+")="+PATH_PASTA1_PASTA_A.relativize(PATH_PASTA_D)+"]");
		System.out.println("["+"\""+PATH_PASTA_D+"\""+".relativize("+"\""+PATH_PASTA1_PASTA_A+"\""+")="+PATH_PASTA_D.relativize(PATH_PASTA1_PASTA_A)+"]");
		System.out.println("["+"\""+PATH_PASTA1_PASTA_A+"\""+".relativize("+"\""+PATH_DOT_DOT_PASTA_E+"\""+")="+PATH_PASTA1_PASTA_A.relativize(PATH_DOT_DOT_PASTA_E)+"]");
		System.out.println("["+"\""+PATH_DOT_DOT_PASTA_E+"\""+".relativize("+"\""+PATH_PASTA1_PASTA_A+"\""+")="+PATH_DOT_DOT_PASTA_E.relativize(PATH_PASTA1_PASTA_A)+"]");
		System.out.println("["+"\""+PATH_PASTA1_PASTA_A+"\""+".relativize("+"\""+PATH_DOT_PASTA_F+"\""+")="+PATH_PASTA1_PASTA_A.relativize(PATH_DOT_PASTA_F)+"]");
		System.out.println("["+"\""+PATH_DOT_PASTA_F+"\""+".relativize("+"\""+PATH_PASTA1_PASTA_A+"\""+")="+PATH_DOT_PASTA_F.relativize(PATH_PASTA1_PASTA_A)+"]");
		System.out.println("["+"\""+PATH_PASTA1_PASTA_A+"\""+".relativize("+"\""+PATH_DOT_DOT+"\""+")="+PATH_PASTA1_PASTA_A.relativize(PATH_DOT_DOT)+"]");
		System.out.println("["+"\""+PATH_DOT_DOT+"\""+".relativize("+"\""+PATH_PASTA1_PASTA_A+"\""+")="+PATH_DOT_DOT.relativize(PATH_PASTA1_PASTA_A)+"]");
		System.out.println("["+"\""+PATH_PASTA1_PASTA_A+"\""+".relativize("+"\""+PATH_DOT+"\""+")="+PATH_PASTA1_PASTA_A.relativize(PATH_DOT)+"]");
		System.out.println("["+"\""+PATH_DOT+"\""+".relativize("+"\""+PATH_PASTA1_PASTA_A+"\""+")="+PATH_DOT.relativize(PATH_PASTA1_PASTA_A)+"]");
		System.out.println("["+"\""+PATH_DOT_DOT+"\""+".relativize("+"\""+PATH_DOT+"\""+")="+PATH_DOT_DOT.relativize(PATH_DOT)+"]");
		System.out.println("["+"\""+PATH_DOT+"\""+".relativize("+"\""+PATH_DOT_DOT+"\""+")="+PATH_DOT.relativize(PATH_DOT_DOT)+"]");
		//System.out.println("["+"\""+PATH_C_PASTA1_PASTA_A+"\""+".relativize("+"\""+PATH_PASTA1_PASTA_B+"\""+")="+PATH_C_PASTA1_PASTA_A.relativize(PATH_PASTA1_PASTA_B)+"]");//IllegalArgumentException: 'other' is different type of Path
		//System.out.println("["+"\""+PATH_PASTA1_PASTA_B+"\""+".relativize("+"\""+PATH_C_PASTA1_PASTA_A+"\""+")="+PATH_PASTA1_PASTA_B.relativize(PATH_C_PASTA1_PASTA_A)+"]");//IllegalArgumentException: 'other' is different type of Path

		System.out.println("\nresolve\n");
		System.out.println("["+"\""+PATH_C_PASTA1_PASTA_A+"\""+".resolve("+"\""+PATH_C_PASTA1_PASTA_B+"\""+")="+PATH_C_PASTA1_PASTA_A.resolve(PATH_C_PASTA1_PASTA_B)+"]");
		System.out.println("["+"\""+PATH_C_PASTA1_PASTA_B+"\""+".resolve("+"\""+PATH_C_PASTA1_PASTA_A+"\""+")="+PATH_C_PASTA1_PASTA_B.resolve(PATH_C_PASTA1_PASTA_A)+"]");
		System.out.println("["+"\""+PATH_C_PASTA1_PASTA_A+"\""+".resolve("+"\""+PATH_PASTA1_PASTA_B+"\""+")="+PATH_C_PASTA1_PASTA_A.resolve(PATH_PASTA1_PASTA_B)+"]");
		System.out.println("["+"\""+PATH_PASTA1_PASTA_B+"\""+".resolve("+"\""+PATH_C_PASTA1_PASTA_A+"\""+")="+PATH_PASTA1_PASTA_B.resolve(PATH_C_PASTA1_PASTA_A)+"]");
		System.out.println("["+"\""+PATH_PASTA1_PASTA_A+"\""+".resolve("+"\""+PATH_PASTA1_PASTA_B+"\""+")="+PATH_PASTA1_PASTA_A.resolve(PATH_PASTA1_PASTA_B)+"]");
		System.out.println("["+"\""+PATH_PASTA1_PASTA_B+"\""+".resolve("+"\""+PATH_PASTA1_PASTA_A+"\""+")="+PATH_PASTA1_PASTA_B.resolve(PATH_PASTA1_PASTA_A)+"]");
		System.out.println("["+"\""+PATH_PASTA1_PASTA_A+"\""+".resolve("+"\""+PATH_PASTA2_PASTA_C+"\""+")="+PATH_PASTA1_PASTA_A.resolve(PATH_PASTA2_PASTA_C)+"]");
		System.out.println("["+"\""+PATH_PASTA2_PASTA_C+"\""+".resolve("+"\""+PATH_PASTA1_PASTA_A+"\""+")="+PATH_PASTA2_PASTA_C.resolve(PATH_PASTA1_PASTA_A)+"]");
		System.out.println("["+"\""+PATH_PASTA1_PASTA_A+"\""+".resolve("+"\""+PATH_PASTA_D+"\""+")="+PATH_PASTA1_PASTA_A.resolve(PATH_PASTA_D)+"]");
		System.out.println("["+"\""+PATH_PASTA_D+"\""+".resolve("+"\""+PATH_PASTA1_PASTA_A+"\""+")="+PATH_PASTA_D.resolve(PATH_PASTA1_PASTA_A)+"]");
		System.out.println("["+"\""+PATH_PASTA1_PASTA_A+"\""+".resolve("+"\""+PATH_DOT_DOT_PASTA_E+"\""+")="+PATH_PASTA1_PASTA_A.resolve(PATH_DOT_DOT_PASTA_E)+"]");
		System.out.println("["+"\""+PATH_DOT_DOT_PASTA_E+"\""+".resolve("+"\""+PATH_PASTA1_PASTA_A+"\""+")="+PATH_DOT_DOT_PASTA_E.resolve(PATH_PASTA1_PASTA_A)+"]");
		System.out.println("["+"\""+PATH_PASTA1_PASTA_A+"\""+".resolve("+"\""+PATH_DOT_PASTA_F+"\""+")="+PATH_PASTA1_PASTA_A.resolve(PATH_DOT_PASTA_F)+"]");
		System.out.println("["+"\""+PATH_DOT_PASTA_F+"\""+".resolve("+"\""+PATH_PASTA1_PASTA_A+"\""+")="+PATH_DOT_PASTA_F.resolve(PATH_PASTA1_PASTA_A)+"]");
		System.out.println("["+"\""+PATH_PASTA1_PASTA_A+"\""+".resolve("+"\""+PATH_DOT_DOT+"\""+")="+PATH_PASTA1_PASTA_A.resolve(PATH_DOT_DOT)+"]");
		System.out.println("["+"\""+PATH_DOT_DOT+"\""+".resolve("+"\""+PATH_PASTA1_PASTA_A+"\""+")="+PATH_DOT_DOT.resolve(PATH_PASTA1_PASTA_A)+"]");
		System.out.println("["+"\""+PATH_PASTA1_PASTA_A+"\""+".resolve("+"\""+PATH_DOT+"\""+")="+PATH_PASTA1_PASTA_A.resolve(PATH_DOT)+"]");
		System.out.println("["+"\""+PATH_DOT+"\""+".resolve("+"\""+PATH_PASTA1_PASTA_A+"\""+")="+PATH_DOT.resolve(PATH_PASTA1_PASTA_A)+"]");
		System.out.println("["+"\""+PATH_DOT_DOT+"\""+".resolve("+"\""+PATH_DOT+"\""+")="+PATH_DOT_DOT.resolve(PATH_DOT)+"]");
		System.out.println("["+"\""+PATH_DOT+"\""+".resolve("+"\""+PATH_DOT_DOT+"\""+")="+PATH_DOT.resolve(PATH_DOT_DOT)+"]");
	}

}
