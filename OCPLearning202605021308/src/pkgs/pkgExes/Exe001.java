package pkgs.pkgExes;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Exe001 {



	public static void main(String[] args) {

		new Exe001().go();

	}

	private void go() {
		Path pthis = null;
		Path pparam = null;

		//relativize=mostra como PathThis chegar ate PathParam, PathThis e PathParam tem de ser do mesmo tipo, absoluto ou relativo, ser forem diferentes IllegalArgumentException.

		pthis = Paths.get("/d1/d12");
		pparam = Paths.get("/d1/d12/d123/d1234");
		System.out.println("["+pthis+".relativize("+pparam+")="+(pthis.relativize(pparam))+"]"+"");

		pthis = Paths.get("/d1/d12/d123/d1234");
		pparam = Paths.get("/d1/d12");
		System.out.println("["+pthis+".relativize("+pparam+")="+(pthis.relativize(pparam))+"]"+"");

		pthis = Paths.get("/d1/d12");
		pparam = Paths.get("/d2/d22/d223/d2234");
		System.out.println("["+pthis+".relativize("+pparam+")="+(pthis.relativize(pparam))+"]"+"");

		pthis = Paths.get("/d2/d22/d223/d2234");
		pparam = Paths.get("/d1/d12");
		System.out.println("["+pthis+".relativize("+pparam+")="+(pthis.relativize(pparam))+"]"+"");

		System.out.println();

		pthis = Paths.get("d1/d12");
		pparam = Paths.get("/d1/d12/d123/d1234");
		//System.out.println("["+pthis+".relativize("+pparam+")="+(pthis.relativize(pparam))+"]"+"");

		pthis = Paths.get("d1/d12/d123/d1234");
		pparam = Paths.get("/d1/d12");
		//System.out.println("["+pthis+".relativize("+pparam+")="+(pthis.relativize(pparam))+"]"+"");

		pthis = Paths.get("d1/d12");
		pparam = Paths.get("/d2/d22/d223/d2234");
		//System.out.println("["+pthis+".relativize("+pparam+")="+(pthis.relativize(pparam))+"]"+"");

		pthis = Paths.get("d2/d22/d223/d2234");
		pparam = Paths.get("/d1/d12");
		//System.out.println("["+pthis+".relativize("+pparam+")="+(pthis.relativize(pparam))+"]"+"");

		System.out.println();

		pthis = Paths.get("/d1/d12");
		pparam = Paths.get("d1/d12/d123/d1234");
		//System.out.println("["+pthis+".relativize("+pparam+")="+(pthis.relativize(pparam))+"]"+"");

		pthis = Paths.get("/d1/d12/d123/d1234");
		pparam = Paths.get("d1/d12");
		//System.out.println("["+pthis+".relativize("+pparam+")="+(pthis.relativize(pparam))+"]"+"");

		pthis = Paths.get("/d1/d12");
		pparam = Paths.get("d2/d22/d223/d2234");
		//System.out.println("["+pthis+".relativize("+pparam+")="+(pthis.relativize(pparam))+"]"+"");

		pthis = Paths.get("/d2/d22/d223/d2234");
		pparam = Paths.get("d1/d12");
		//System.out.println("["+pthis+".relativize("+pparam+")="+(pthis.relativize(pparam))+"]"+"");

		System.out.println();

		pthis = Paths.get("d1/d12");
		pparam = Paths.get("d1/d12/d123/d1234");
		System.out.println("["+pthis+".relativize("+pparam+")="+(pthis.relativize(pparam))+"]"+"");

		pthis = Paths.get("d1/d12/d123/d1234");
		pparam = Paths.get("d1/d12");
		System.out.println("["+pthis+".relativize("+pparam+")="+(pthis.relativize(pparam))+"]"+"");

		pthis = Paths.get("d1/d12");
		pparam = Paths.get("d2/d22/d223/d2234");
		System.out.println("["+pthis+".relativize("+pparam+")="+(pthis.relativize(pparam))+"]"+"");

		pthis = Paths.get("d2/d22/d223/d2234");
		pparam = Paths.get("d1/d12");
		System.out.println("["+pthis+".relativize("+pparam+")="+(pthis.relativize(pparam))+"]"+"");

	}



}
