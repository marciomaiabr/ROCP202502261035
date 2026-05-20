package pkgs.pkgExes;

import java.io.ByteArrayInputStream;
import java.io.Console;
import java.io.File;
import java.io.InputStream;
import java.time.LocalDate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.function.*;
import java.util.stream.*;

/*class Bottle {
	//public static class Ship {
	public class Ship {
		private enum Sail { // w1
			TALL {
				protected int getHeight() {
					return 100;
				}
			},
			SHORT {
				protected int getHeight() {
					return 2;
				}
			};

			protected abstract int getHeight();
		}

		public Sail getSail() {
			return Sail.TALL;
		}
	}

	public static void main(String[] stars) {
		Bottle bottle = new Bottle();
		Ship q = bottle.new Ship(); // w2
		//Ship q = new Ship(); // w2
		System.out.print(q.getSail());
	}
}*/


class ClassA {
	private Integer id;
	private String nome;
	public ClassA(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	@Override public String toString() { return "ClassA [id=" + id + ", nome=" + nome + "]"; }
}

public class Exe001 {



	public static void main(String[] args) {

		new Exe001().go();

	}

	private void go() {

		Locale.setDefault(new Locale("QQC"));
		System.out.println(Locale.getDefault());

	}

	private void go11() {

		class ClassA {}
		class ClassAA extends ClassA {}
		class ClassAAA extends ClassAA {}

		class ClassB<T>{}

		class ClassC{
			public void pedeSuper(ClassB<? super ClassAA> classB) {}
			public void pedeExtends(ClassB<? extends ClassAA> classB) {}
		}

		new ClassC().pedeSuper(new ClassB<ClassA>());
		new ClassC().pedeSuper(new ClassB<ClassAA>());
		//new ClassC().pedeSuper(new ClassB<ClassAAA>());

		//new ClassC().pedeExtends(new ClassB<ClassA>());
		new ClassC().pedeExtends(new ClassB<ClassAA>());
		new ClassC().pedeExtends(new ClassB<ClassAAA>());

	}

	private void go10() {

		class Wash<T> {
			T item;

			public void clean(T item) {
				System.out.println("Clean " + item);
			}
		}

		Wash wash = new Wash<String>();
		wash.clean("socks");
		wash.clean(new Integer(5));

	}

	private void go9() {

		Comparable<ClassA> comparable = new Comparable<ClassA>() {
			@Override
			public int compareTo(ClassA o) {
				return 0;
			}};

		Comparator<ClassA> comparator = new Comparator<ClassA>() {
			@Override
			public int compare(ClassA o1, ClassA o2) {
				return 0;
			}
		};

	}

	private void go8() {
		ArrayDeque<ClassA> ad1 = null;

		ad1 = new ArrayDeque<ClassA>();
		ad1.add(new ClassA(2,"Maria"));
		ad1.add(new ClassA(1,"Ana"));
		ad1.add(new ClassA(3,"Paula"));
		System.out.println("[ad1="+(ad1)+"]");

		ad1 = new ArrayDeque<ClassA>();
		ad1.offer(new ClassA(2,"Maria"));
		ad1.offer(new ClassA(1,"Ana"));
		ad1.offer(new ClassA(3,"Paula"));
		System.out.println("[ad1="+(ad1)+"]");
	}

	private void go7() {
		int i1;
		if(LocalDate.now().getYear()==2026)
			i1=7;
		else
			i1=8;
		//i1=5;
		IntConsumer ic = i2 -> System.out.println(i1);
	}

	private void go6() {
		class Qqc {
			class E1 extends Exception{}
			class E12 extends E1{}
			class E123 extends E12{}
			class E1234 extends E123{}
			class E12345 extends E1234{}
			class E123456 extends E12345{}
			class E1234567 extends E123456{}
			class E12345678 extends E1234567{}
			class E123456789 extends E12345678{}
			class E12345678910 extends E123456789{}
			public void m1() {
				/*try {
					throw new E123456();
				}catch (E12345678 | E12345678910 e) {}*/
			}
		}
	}

	private void go5() {
		byte[] data = new byte[] {1,2,3,4,5,6,7};
		try (InputStream is = new ByteArrayInputStream(data)) {
			is.read(new byte[2]);
			is.mark(1);
			is.read();is.read();
			is.skip(3);
			is.reset();
			System.out.println(is.read());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private void go4() {
		String [] aString = new String [] {"a","b","c"};
		System.out.println("[aString="+(aString)+"]");
		System.out.println("[Stream.of(aString)="+(Stream.of(aString))+"]");
		System.out.println("[Stream.of(aString).count()="+(Stream.of(aString).count())+"]");
		Stream.of(aString).forEach(System.out::println);
		Integer [] aInteger = new Integer [] {1,2,3};
		System.out.println("[aInteger="+(aInteger)+"]");
		System.out.println("[Stream.of(aInteger)="+(Stream.of(aInteger))+"]");
		System.out.println("[Stream.of(aInteger).count()="+(Stream.of(aInteger).count())+"]");
		Stream.of(aInteger).forEach(System.out::println);
		System.out.println("[Stream.of(aString, aInteger)="+(Stream.of(aString, aInteger))+"]");
		System.out.println("[Stream.of(aString, aInteger).count()="+(Stream.of(aString, aInteger).count())+"]");
		Stream.of(aString, aInteger).forEach(System.out::println);

		List<String> listString = new ArrayList<>();
		listString.add("a");
		listString.add("b");
		listString.add("c");
		System.out.println("[listString="+(listString)+"]");
		System.out.println("[Stream.of(listString)="+(Stream.of(listString))+"]");
		System.out.println("[Stream.of(listString).count()="+(Stream.of(listString).count())+"]");
		Stream.of(listString).forEach(System.out::println);
		List<Integer> listInteger = new ArrayList<>();
		listInteger.add(1);
		listInteger.add(2);
		listInteger.add(3);
		System.out.println("[listInteger="+(listInteger)+"]");
		System.out.println("[Stream.of(listInteger)="+(Stream.of(listInteger))+"]");
		System.out.println("[Stream.of(listInteger).count()="+(Stream.of(listInteger).count())+"]");
		Stream.of(listInteger).forEach(System.out::println);
		System.out.println("[Stream.of(listString, listInteger)="+(Stream.of(listString, listInteger))+"]");
		System.out.println("[Stream.of(listString, listInteger).count()="+(Stream.of(listString, listInteger).count())+"]");
		Stream.of(listString, listInteger).forEach(System.out::println);
	}

	private void go3() {
		Stream<Boolean> bools = Stream.iterate(true, b -> !b);
		Map<Boolean, List<Boolean>> map = bools.limit(1).collect(Collectors.partitioningBy(b -> b));
		System.out.println(map);
	}

	private void go2() {
		Arrays.asList( new ClassA(2,"Maria"), new ClassA(1,"Ana"), new ClassA(4,"Carla"), new ClassA(3,"Paula") ).stream().forEach(System.out::println);
	}

	private void go1() {
		Arrays.asList(2,1,4,3).stream().forEach(System.out::println);
	}



}
