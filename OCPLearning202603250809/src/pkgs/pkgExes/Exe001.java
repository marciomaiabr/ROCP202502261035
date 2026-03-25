package pkgs.pkgExes;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Exe001 {



	public static void main(String[] args) {

		new Exe001().go();

	}

	private void go() {

		List<Double> prices = Arrays.asList(1.2, 6.5, 3.0);
		{
			Consumer<Double> scanner = p -> {
				String result = p<5 ? "Correct" : "Too high";
				System.out.println(result);
			};
			prices.forEach(scanner);
		}
		{
			DoubleConsumer scanner = p -> {
				String result = p<5 ? "Correct" : "Too high";
				System.out.println(result);
			};
			prices.forEach(scanner);
		}
	}



}
