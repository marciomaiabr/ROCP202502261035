package pkgs.pkgExes;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

abstract class Animal { public abstract void checkup(); }

class Dog extends Animal { public void checkup() { System.out.println("Dog checkup"); }; }
class Cat extends Animal { public void checkup() { System.out.println("Cat checkup"); }; }
class Bird extends Animal { public void checkup() { System.out.println("Bird checkup"); }; }

class AnimalDoctor { public void checkAnimals(ArrayList<Animal> animals) { for(Animal animal : animals) animal.checkup(); } }

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
		List<Animal> dogs = new ArrayList<Animal>();
		dogs.add(new Dog());
		dogs.add(new Dog());
		List<Animal> cats = new ArrayList<Animal>();
		cats.add(new Cat());
		cats.add(new Cat());
		List<Animal> birds = new ArrayList<Animal>();
		birds.add(new Bird());

		AnimalDoctor animalDoctor = new AnimalDoctor();
		animalDoctor.checkAnimals((ArrayList) dogs);
		animalDoctor.checkAnimals((ArrayList) cats); 
		animalDoctor.checkAnimals((ArrayList) birds); 
	}

}

/*

*/
