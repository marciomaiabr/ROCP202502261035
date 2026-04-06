package pkgs.pkgExes;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Exe001 {



	public static void main(String[] args) {

		new Exe001().go();

	}

	public void go() {

		Stream<Integer> stream = null;

		System.out.println('\n'+"retorna um Optional");
		stream = Arrays.asList(1,2,3,4,5,6,7,8,9).stream();
		System.out.println("[stream.reduce((a,b)->a+b)="+(stream.reduce((a,b)->a+b))+"]");

		System.out.println('\n'+"retorna um valor do tipo generico utilizado");
		stream = Arrays.asList(1,2,3,4,5,6,7,8,9).stream();
		System.out.println("[stream.reduce((a,b)->a+b)="+(stream.reduce(0, (a,b)->a+b))+"]");
		stream = Arrays.asList(1,2,3,4,5,6,7,8,9).stream();
		System.out.println("[stream.reduce(0, (a,b)->a*b)="+(stream.reduce(0, (a,b)->a*b))+"]");
		stream = Arrays.asList(1,2,3,4,5,6,7,8,9).stream();
		System.out.println("[stream.reduce(1, (a,b)->a*b)="+(stream.reduce(1, (a,b)->a*b))+"]");
		stream = Arrays.asList(1,2,3,4,5,6,7,8,9).parallelStream();
		System.out.println("[stream.reduce(1, (a,b)->a*b)="+(stream.reduce(1, (a,b)->a*b, (a,b)->{System.out.println("[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"[BinaryOperator<U> combiner]"+"[a="+(a)+"]"+"[b="+(b)+"]"+"[a*b="+(a*b)+"]"); return a*b;}))+"]");

	}

	public void go1() {

		System.out.println("Exemplo de ligar/desligar paralelismo na stream");

		//System.out.println(Stream.iterate(1, n->n+1).limit(100).count());
		//Stream.iterate(1, n->n+1).limit(100).parallel().reduce((a,b)->{System.out.println(Thread.currentThread().getName()); return a+b;});
		//Stream.iterate(1, n->n+1).limit(100).parallel().sequential().reduce((a,b)->{System.out.println(Thread.currentThread().getName()); return a+b;});

	}



}
