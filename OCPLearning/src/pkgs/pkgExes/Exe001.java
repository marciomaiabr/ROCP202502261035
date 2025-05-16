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

		//String [] arr = { ">ff<" , "> f<" , ">f <" , null , "> <" , "><" , ">FF<" , };
		String ff = "ff";
		String espacof = " f";
		String fespaco = "f ";
		String nullo = null;
		String espaco = " ";
		String espacoespaco = "  ";
		String vazio = "";
		String FF = "FF";
		String [] arr = { ff , espacof , fespaco , nullo , espacoespaco , espaco , vazio , FF , };
		PriorityQueue<String> pq = new PriorityQueue<>();

		System.out.println("\npq.offer(s)");
		for (String s : arr) {
			System.out.println("pq.offer("+"\""+s+"\""+")");
			try {
				pq.offer(s);
			} catch (Exception e) {
				System.out.println("catch (Exception e)");
				System.out.println("[e="+(e)+"]"+"[e.getMessage()="+(e.getMessage())+"]");
			}
		}

		System.out.println("\npq");
		System.out.println(pq);

		System.out.println("\npq.poll()");
		while(!pq.isEmpty())
			System.out.println("[pq.poll()="+(pq.poll())+"]");


		System.out.println("[FF.compareTo(fespaco)="+(FF.compareTo(fespaco))+"]");
		System.out.println("[(int)FF.charAt(0)="+((int)FF.charAt(0))+"]"+"[(int)fespaco.charAt(0)="+((int)fespaco.charAt(0))+"]"+"[(((int)FF.charAt(0))-((int)fespaco.charAt(0)))="+(((int)FF.charAt(0))-((int)fespaco.charAt(0)))+"]");

	}

}

/*

*/
