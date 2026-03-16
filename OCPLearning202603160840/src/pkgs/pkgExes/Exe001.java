package pkgs.pkgExes;

import java.util.stream.LongStream;

public class Exe001 {



	public static void main(String[] args) {

		new Exe001().go();

	}

	private void go() {
		//System.out.println(LongStream.of(1,2,3,4,5,6,7,8,9,10).peek(o->System.out.println("[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"[o="+(o)+"]")).sum());
		//System.out.println(LongStream.of(1,2,3,4,5,6,7,8,9,10).parallel().peek(o->System.out.println("[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"[o="+(o)+"]")).sum());
		//System.out.println(LongStream.iterate(1, i->i+1).limit(100).peek(o->System.out.println("[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"[o="+(o)+"]")).sum());
		System.out.println(LongStream.iterate(1, i->i+1).limit(100).parallel().peek(o->System.out.println("[Thread.currentThread().getName()="+(Thread.currentThread().getName())+"]"+"[o="+(o)+"]")).sum());
	}



}
