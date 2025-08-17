package pkgs.pkgExes;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Exe001 {

	static {
		System.out.println(LocalDateTime.now());
	}

	private String label;

	public Exe001(String label) { this.label = label; }
	@Override
	public String toString() { return ("[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"[label="+(label)+"]"+"[super.toString()="+(super.toString())+"]"); }

	public static void main(String[] args) {

		try {
			System.out.println("<>");
			sm1(args);
			Exe001 exe001 = new Exe001("exe001");
			exe001.im1(args);
			System.out.println("</>");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			Runtime.getRuntime().exec("cmd.exe /c C:\\Users\\Administrador\\git\\ROCP202502261035\\OCPLearning\\logs\\logMM.txt");
		} catch (Exception e) {}

	}

	public static void sm1(String[] args) {
		System.out.println("Exe001.sm1()");
	}



	public void im1(String[] args) {
		System.out.println("Exe001.im1()");
		{
			List<String> strings = new ArrayList<>();
			strings.add("a");
			strings.add("e");
			strings.add("i");
			strings.add("o");
			strings.add("u");
			List<String> strings2 = strings;
			System.out.println("[strings="+(strings)+"]"+"[strings="+(strings)+"]"+"[strings2 == strings="+(strings2 == strings)+"]");
			strings.add("b");
			System.out.println("[strings="+(strings)+"]"+"[strings="+(strings)+"]"+"[strings2 == strings="+(strings2 == strings)+"]");
			Iterator<String> iterator = strings.iterator();
			strings.add("c");
			//while (iterator.hasNext()) System.out.print("[iterator.next()="+(iterator.next())+"]");//java.util.ConcurrentModificationException
			iterator = strings.iterator();
			System.out.println();
			while (iterator.hasNext()) System.out.print("[iterator.next()="+(iterator.next())+"]");
			System.out.println();
			iterator = strings.iterator();
			//iterator.next();
			//iterator.remove();//java.lang.IllegalStateException
			iterator.next();
			iterator.remove();
		}
		{
			CopyOnWriteArrayList<String> strings = new CopyOnWriteArrayList<>("a,e,i,o,u".split(","));
			CopyOnWriteArrayList<String> strings2 = strings;
			System.out.println("[strings="+(strings)+"]"+"[strings="+(strings)+"]"+"[strings2 == strings="+(strings2 == strings)+"]");
			strings.add("b");
			System.out.println("[strings="+(strings)+"]"+"[strings="+(strings)+"]"+"[strings2 == strings="+(strings2 == strings)+"]");
			Iterator<String> iterator = strings.iterator();
			strings.add("c");
			while (iterator.hasNext()) System.out.print("[iterator.next()="+(iterator.next())+"]");
			iterator = strings.iterator();
			System.out.println();
			while (iterator.hasNext()) System.out.print("[iterator.next()="+(iterator.next())+"]");
			System.out.println();
			iterator = strings.iterator();
			//iterator.remove();//java.lang.UnsupportedOperationException
		}
	}

}

/*

*/
