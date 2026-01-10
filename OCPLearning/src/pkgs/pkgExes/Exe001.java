package pkgs.pkgExes;

import java.util.*;

public class Exe001 {



	public static void main(String[] args) {

		Map map = null;

		map = new HashMap<>();
		map.put("1", "1");
		map.put(2, 2);
		map.forEach((k,v)->System.out.println("[k="+(k)+"]"+"[v="+(v)+"]"));

		map = new TreeMap<>();
		map.put("1", "1");
		//map.put(2, 2);//ClassCastException: java.lang.String cannot be cast to java.lang.Integer
		map.forEach((k,v)->System.out.println("[k="+(k)+"]"+"[v="+(v)+"]"));

	}

}
