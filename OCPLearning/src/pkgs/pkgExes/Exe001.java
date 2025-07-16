package pkgs.pkgExes;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Dog {
    private String name;
    private int age;
    private int weight;

    public Dog(String name, int weight, int age) {
        this.name = name; this.weight = weight; this.age = age;
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String toString() {
        return this.name + " is " + this.age + " years old and weighs "
            + this.weight + " pounds";
    }
}


public class Exe001 {

	static {
		System.out.println(LocalDateTime.now());
	}

	public static void main(String[] args) {

		try {
			System.out.println("<>");
			sm1(args);
			new Exe001().im1(args);
			System.out.println("</>");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			Runtime.getRuntime().exec("cmd.exe /c C:\\Users\\Administrador\\git\\ROCP202502261035\\OCPLearning\\logs\\logMM.txt");
		} catch (Exception e) {}

	}

	public static void sm1(String[] args) {
		System.out.println("Exe001.sm1()");
	}

	public void im1(String[] args) {
		System.out.println("Exe001.im1()");
		Integer [] arr = new Integer [100];
		System.out.println(Stream.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15).filter(v -> {System.out.println("[filter1][v="+(v)+"]"); return v >=3;}).filter(v -> {System.out.println("[filter2][v="+(v)+"]"); return v >=7;}).anyMatch(v -> {System.out.println("[anyMatch][v="+(v)+"]"); return v >=10;}));
	}

}

/*
Interessantemente Stream não "espera" uma etapa ser concluida para executar a outra,
a medida que os elemento está apto a passar por aquela etapa já vai para a seguinte
Interessantemente anyMatch quando "OK" já finaliza o fluxo, mesmo todos os elementos ainda não terem sido processados
*/
