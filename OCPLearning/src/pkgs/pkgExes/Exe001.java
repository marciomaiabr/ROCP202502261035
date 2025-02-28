package pkgs.pkgExes;

public class Exe001 {

	public static void main(String[] args) {
		m3();
	}

	private static void m1() {
		int [] arr = new int [10];
		System.out.println(arr[5]);
		int [] arr2 = new int [] {1,2,3,4,5,6,7,8,9,10};
		System.out.println(arr2[5]);
	}

	private static void m2() {
		Integer [] arr = new Integer [10];
		System.out.println(arr[5]);
		Integer [] arr2 = new Integer [] {1,2,3,4,5,6,7,8,9,10};
		System.out.println(arr2[5]);
	}

	private static void m3() {
		Integer [] arr = new Integer [] {1,2,3,4,5,6,7,8,9,10};
		for(int i : arr) {
			System.out.println(i);
		}
	}

}
