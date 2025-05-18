package pkgs.pkgExes;

import java.time.LocalDateTime;
import java.util.*;

abstract class Animal { public abstract void checkup(); }

class Dog extends Animal { public void checkup() { System.out.println("Dog checkup"); }; }
class Cat extends Animal { public void checkup() { System.out.println("Cat checkup"); }; }
class Bird extends Animal { public void checkup() { System.out.println("Bird checkup"); }; }

class AnimalDoctorWithArray {
	public void checkAnimals(Animal [] animals) { System.out.println("AnimalDoctorWithArray.checkAnimals()"); for(Animal animal : animals) animal.checkup(); }
	public void addCat(Animal [] animals) { System.out.println("AnimalDoctorWithArray.addCat()"); animals[0] = new Cat(); }
}

class AnimalDoctorWithGeneric {
	public void checkAnimals(ArrayList<Animal> animals) { System.out.println("AnimalDoctorWithGeneric.checkAnimals()"); for(Animal animal : animals) animal.checkup(); }
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

		{
			System.out.println("testing with array...");
			Dog [] dogs = new Dog[5];

			AnimalDoctorWithArray animalDoctor = new AnimalDoctorWithArray();
			animalDoctor.addCat(dogs);
		}

		/*{
			System.out.println("testing with generic...");
			ArrayList<Animal> dogs = new ArrayList<Animal>();
			dogs.add(new Dog());
			dogs.add(new Dog());
			ArrayList<Animal> cats = new ArrayList<Animal>();
			cats.add(new Cat());
			cats.add(new Cat());
			ArrayList<Animal> birds = new ArrayList<Animal>();
			birds.add(new Bird());

			AnimalDoctorWithGeneric animalDoctor = new AnimalDoctorWithGeneric();
			animalDoctor.checkAnimals(dogs);
			animalDoctor.checkAnimals(cats);
			animalDoctor.checkAnimals(birds);
		}*/

	}

}

/*

*/
