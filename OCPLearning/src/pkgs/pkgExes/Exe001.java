package pkgs.pkgExes;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Exe001 {



	public static void main(String[] args) {

		ArrayBlockingQueue<Integer> abq = new ArrayBlockingQueue<>(3);
		System.out.println(abq.add(1));
		System.out.println(abq.add(1));
		System.out.println(abq.offer(1));
		System.out.println(abq.size());
		//System.out.println(abq.add(2));//IllegalStateException: Queue full
		System.out.println(abq.offer(2));
		try {
			System.out.println(abq.offer(2, 3, TimeUnit.SECONDS));
		} catch (Exception e) {
			e.printStackTrace();
		}
		new Thread(()->{
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
			abq.clear();
		}).start();
		try {
			abq.put(2);//espera por espaço na fila/colecao
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(abq.size());

	}



}
