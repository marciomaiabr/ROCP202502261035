package pkgs.pkgExes;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exe001 {

	static {
		System.out.println(LocalDateTime.now());
	}

	public static void main(String[] args) {

		try {
			System.out.println("<>");
			sm1(args);
			new Exe001().im1(args);
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
		Stream.of(9,0,8,1,7,2,6,3,5,4).sorted((v1,v2)->{System.out.println("[sorted][v1="+(v1)+"]"+"[v2="+(v2)+"]"); return v1.compareTo(v2);}).forEach(v->System.out.println("[forEach][v="+(v)+"]"));
		System.out.println();
		Stream.of(9,0,8,1,7,2,6,3,5,4).sorted((v1,v2)->{System.out.println("[sorted][v1="+(v1)+"]"+"[v2="+(v2)+"]"); return v1.compareTo(v2);}).peek(v->System.out.println("[peek][v="+(v)+"]")).forEach(v->System.out.println("[forEach][v="+(v)+"]"));
		System.out.println();
		Stream.of(9,0,8,1,7,2,6,3,5,4).sorted((v1,v2)->{System.out.println("[sorted][v1="+(v1)+"]"+"[v2="+(v2)+"]"); return v1.compareTo(v2);}).peek(v->System.out.println("[peek][v="+(v)+"]")).forEach(v->{System.out.println("[forEach][v="+(v)+"]");try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }});
	}

}

/*

*/
