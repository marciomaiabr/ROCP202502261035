package pkgs.pkgExes;



public class Exe001 {



	public static void main(String[] args) {

		new Exe001().go();

	}

	void go() {

		Object obj = new Object();

		System.out.println("[aki][1]");
		new Thread(()->{
			System.out.println("[aki][2]");
			synchronized (obj) {
				System.out.println("[aki][3]");
				try {
					Thread.sleep(3000);
				} catch (Exception e) {}
				System.out.println("[aki][3.1]");
				try {
					obj.wait();
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("[aki][3.2]");
				try {
					Thread.sleep(3000);
				} catch (Exception e) {}
				System.out.println("[aki][4]");
			}
		}).start();
		System.out.println("[aki][5]");

		System.out.println("[aki][6]");
		new Thread(()->{
			System.out.println("[aki][7]");
			synchronized (obj) {
				System.out.println("[aki][8]");
				try {
					obj.notify();
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("[aki][9]");
			}
		}).start();
		System.out.println("[aki][10]");

	}

}
