package pkgs.pkgExes;

import java.time.LocalDateTime;
import java.util.stream.DoubleStream;
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
		DoubleStream ds = DoubleStream.of(0,0.5,1,1.5,2);
		ds.forEach(System.out::println);
		Stream<Double> sd = Stream.of(new Double(0d),new Double(0.5),null,new Double(1),new Double(1.5),new Double(2));
		sd.forEach(System.out::println);
		//ds = sd;//compile error:Type mismatch: cannot convert from Stream<Double> to DoubleStream
	}

}

/*

*/
