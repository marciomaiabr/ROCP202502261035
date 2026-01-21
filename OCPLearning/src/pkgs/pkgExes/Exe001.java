package pkgs.pkgExes;



public class Exe001 {



	public static void main(String[] args) {

		new Exe001().go();

	}

	void go() {

		Object o = new Object();
		//o.notify();//IllegalMonitorStateException
		try {
			//o.wait();//IllegalMonitorStateException
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(o);

	}

}
