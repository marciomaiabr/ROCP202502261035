package pkgs.pkgExes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exe001 {

	public static void main(String[] args) {
		System.out.println("<>");
		m1(args);
		System.out.println("</>");
	}

	public static void m1(String[] args) {
		System.out.println("Exe001.m1()");
		List<String> list = new ArrayList<String>();
		list.add("dNomeComecandoComD");
		list.add("bNomeComecandoComB");
		list.add("eNomeComecandoComE");
		list.add("aNomeComecandoComA");
		list.add("cNomeComecandoComC");
		System.out.println("[ñ ordenado="+(list)+"]");
		Collections.sort(list);
		System.out.println("[ordenado="+(list)+"]");
	}

}

/*
<>
Exe001.m1()
[ñ ordenado=[dNomeComecandoComD, bNomeComecandoComB, eNomeComecandoComE, aNomeComecandoComA, cNomeComecandoComC]]
[ordenado=[aNomeComecandoComA, bNomeComecandoComB, cNomeComecandoComC, dNomeComecandoComD, eNomeComecandoComE]]
</>
*/

/*

*/

/*

*/
