package pkgs.pkgExes;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Exe001 {



	public static void main(String[] args) {

		new Exe001().go();

	}

	private void go() {
		System.out.println();
		String stringCaminho = "/bag/of/tricks/.././disappear.txt";
		System.out.println("[stringCaminho="+(stringCaminho)+"]"+"");
		System.out.print(doTrick(Paths.get(stringCaminho)));
	}

	public String doTrick(Path path) {
		System.out.println();
		System.out.println("[path="+(path)+"]"+"");
		System.out.println();
		System.out.println("[path.getName(0)="+(path.getName(0))+"]"+"");
		System.out.println();
		System.out.println("[path.subpath(0,1)="+(path.subpath(0,1))+"]"+"");
		System.out.println("[path.subpath(0,3)="+(path.subpath(0,3))+"]"+"");
		System.out.println("[path.subpath(1,3)="+(path.subpath(1,3))+"]"+"");
		System.out.println("[path.subpath(2,3)="+(path.subpath(2,3))+"]"+"");
		//System.out.println("[path.subpath(2,2)="+(path.subpath(2,2))+"]"+"");
		//System.out.println("[path.subpath(3,3)="+(path.subpath(3,3))+"]"+"");
		System.out.println("[path.subpath(3,4)="+(path.subpath(3,4))+"]"+"");
		System.out.println("[path.subpath(3,5)="+(path.subpath(3,5))+"]"+"");
		System.out.println();
		System.out.println("[path.subpath(2,3).getName(0)="+(path.subpath(2,3).getName(0))+"]"+"");
		System.out.println("[path.subpath(3,5).getName(1)="+(path.subpath(3,5).getName(1))+"]"+"");
		System.out.println("[path.subpath(3,4).getName(1)="+(path.subpath(3,4).getName(1))+"]"+"");
		System.out.println("[path.subpath(2,3).getName(1)="+(path.subpath(2,3).getName(1))+"]"+"");
		System.out.println();
		return path.subpath(2,3).getName(1).toAbsolutePath().toString();
	}

}
