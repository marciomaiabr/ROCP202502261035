package pkgs.pkgExes;

import java.time.LocalDateTime;
import java.util.*;

class Rental {
	private List rentalPool;
	private int maxNum;
	public Rental(int maxNum, List rentalPool) {
		this.maxNum = maxNum;
		this.rentalPool = rentalPool;
	}
	public Object getRental() {
		return rentalPool.get(0);
	}
	public void returnRental(Object o) {
		rentalPool.add(o);
	}
}

class Car {
}

class CarRental extends Rental {

	public CarRental(int maxNum, List<Car> rentalPool) {
		super(maxNum, rentalPool);
	}
	public Car getRental() {
		return (Car) super.getRental();
	}
	public void returnRental(Car car) {
		super.returnRental(car);
	}
	public void returnRental(Object o) {
		if(o instanceof Car) {
			super.returnRental(o);
		} else {
			throw new RuntimeException("MM RuntimeException Cannot add a non-Car");
		}
	}
}

public class Exe001 {

	static {
		System.out.println(LocalDateTime.now());
	}

	public static void main(String[] args) {

		try {
			System.out.println("<>");
			m1(args);
			System.out.println("</>");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			Runtime.getRuntime().exec("cmd.exe /c C:\\Users\\Administrador\\git\\ROCP202502261035\\OCPLearning\\logs\\logMM.txt");
		} catch (Exception e) {}

	}

	public static void m1(String[] args) {
		System.out.println("Exe001.m1()");
		CarRental carRental = null;
		System.out.println("[="+(carRental)+"]");
	}

}

/*

*/
