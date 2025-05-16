package pkgs.pkgExes;

import java.time.LocalDateTime;
import java.util.*;

import pkgs.pkg0.*;

public class Exe001 {

	static {
		System.out.println(LocalDateTime.now());
	}

	public static void main(String[] args) {
		System.out.println("<>");
		m1(args);
		System.out.println("</>");
	}

	public static void m1(String[] args) {
		System.out.println("Exe001.m1()");
		{
			List list = new ArrayList<>();
			list.add(new Object());
			list.add("qqc");
			list.add(10l);
			mqqc1(list);
			mqqc2(list);
			mqqc3(list);
		}
		{
			List<Long> list = new ArrayList<>();
			//list.add(new Object());//compile error=The method add(Long) in the type List<Long> is not applicable for the arguments (Object)
			//list.add("qqc");//compile error=The method add(Long) in the type List<Long> is not applicable for the arguments (String)
			list.add(10l);
			mqqc1(list);
			mqqc2(list);
			//mqqc3(list);//compile error=The method mqqc3(List<String>) in the type Exe001 is not applicable for the arguments (List<Long>)
		}
		{
			List<String> list = new ArrayList<>();
			//list.add(new Object());//compile error=The method add(String) in the type List<String> is not applicable for the arguments (Object)
			list.add("qqc");
			//list.add(10l);//compile error=The method add(String) in the type List<String> is not applicable for the arguments (long)
			mqqc1(list);
			//mqqc2(list);//compile error=The method mqqc2(List<Long>) in the type Exe001 is not applicable for the arguments (List<String>)
			mqqc3(list);
		}
	}

	public static void mqqc1(List pList) {
		System.out.println("Exe001.mqqc1()");
		System.out.println("[pList="+(pList)+"]");
		Object o = pList.get(0);
		String s = (String) pList.get(1);
		long l = (long) pList.get(2);
		System.out.println("[o="+(o)+"]"+"[s="+(s)+"]"+"[l="+(l)+"]");
	}

	public static void mqqc2(List<Long> pList) {
		System.out.println("Exe001.mqqc2()");
		Object o = pList.get(0);
		String s = null;//(String) pList.get(1);//compile error=Cannot cast from Long to String
		long l = (long) pList.get(2);
		System.out.println("[o="+(o)+"]"+"[s="+(s)+"]"+"[l="+(l)+"]");
		System.out.println("[pList="+(pList)+"]");
	}

	public static void mqqc3(List<String> pList) {
		System.out.println("Exe001.mqqc3()");
		Object o = pList.get(0);
		String s = (String) pList.get(1);
		long l = 0;//(long) pList.get(2);;//compile error=Cannot cast from String to long
		System.out.println("[o="+(o)+"]"+"[s="+(s)+"]"+"[l="+(l)+"]");
		System.out.println("[pList="+(pList)+"]");
	}

}

/*

*/
