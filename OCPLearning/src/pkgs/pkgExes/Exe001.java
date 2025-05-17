package pkgs.pkgExes;

import java.time.LocalDateTime;

abstract class Animal { public abstract void checkup(); }

class Dog extends Animal { public void checkup() { System.out.println("Dog checkup"); }; }
class Cat extends Animal { public void checkup() { System.out.println("Cat checkup"); }; }
class Bird extends Animal { public void checkup() { System.out.println("Bird checkup"); }; }

class AnimalDoctor { public void checkAnimals(Animal [] animals) { for(Animal animal : animals) animal.checkup(); } }

public class Exe001 {

	static {
		System.out.println(LocalDateTime.now());
	}

	public static void main(String[] args) {
		System.out.println("<>");
		m1(args);
		System.out.println("</>");
	}

	public static void m1(String[] args) {
		System.out.println("Exe001.m1()");
		Dog [] dogs = { new Dog() , new Dog() };
		Cat [] cats = { new Cat() , new Cat() , new Cat() };
		Bird [] birds = { new Bird() };

		AnimalDoctor animalDoctor = new AnimalDoctor();
		animalDoctor.checkAnimals(dogs);
		animalDoctor.checkAnimals(cats);
		animalDoctor.checkAnimals(birds);
	}

}

/*

*/
