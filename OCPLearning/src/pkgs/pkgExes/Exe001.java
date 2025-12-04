package pkgs.pkgExes;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Exe001 {

	public static void main(String[] args) {

		ConcurrentMap<Integer, String> cm = new ConcurrentHashMap<>();
		cm.put(1, "qwe");
		cm.put(2, "qwe");
		cm.put(3, "qwe");
		cm.put(4, "zaq");
		cm.put(5, "xsw");
		cm.put(6, "cde");
		System.out.println("[cm="+(cm)+"]");
		System.out.println("[cm="+(cm.remove(2))+"]");
		System.out.println("[cm="+(cm)+"]");
		System.out.println("[cm="+(cm.remove(3, "qwee"))+"]");
		System.out.println("[cm="+(cm)+"]");
		System.out.println("[cm="+(cm.remove(33, "qwe"))+"]");
		System.out.println("[cm="+(cm)+"]");
		System.out.println("[cm="+(cm.remove(55, "xsw"))+"]");
		System.out.println("[cm="+(cm)+"]");
		System.out.println("[cm="+(cm.remove(5, "xsww"))+"]");
		System.out.println("[cm="+(cm)+"]");
		System.out.println("[cm="+(cm.remove(3, "qwe"))+"]");
		System.out.println("[cm="+(cm)+"]");

	}

}
