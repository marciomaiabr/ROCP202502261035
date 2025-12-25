package pkgs.pkgExes;

import java.util.ArrayDeque;
import java.util.Queue;

public class Exe001 {

	public static void main(String[] args) {

		Queue<Integer> d = new ArrayDeque<>();
		d.offer(18);
		d.offer(5);
		System.out.println(d);
		//d.push(13);//The method push(int) is undefined for the type Queue<Integer>
		d.add(10);
		d.add(10);
		System.out.println(d);
		while(!d.isEmpty())
			System.out.println(d.poll());

	}

}
