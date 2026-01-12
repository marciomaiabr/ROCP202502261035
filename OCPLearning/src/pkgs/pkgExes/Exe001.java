package pkgs.pkgExes;



interface Hungry<E> { void munch(E x); }

interface Herbivore<E extends Plant> extends Hungry<E> {}
interface Carnivore<E extends Animal> extends Hungry<E> {}

abstract class Plant {}
abstract class Animal {}

class Grass extends Plant {}

class Sheep extends Animal implements Herbivore<Sheep> { public void munch(Sheep x) {} }
class Wolf extends Animal implements Carnivore<Sheep> { public void munch(Sheep x) {} }



/*
A. Change the Carnivore interface to
interface Carnivore<E extends Plant> extends Hungry<E> {}

B. Change the Herbivore interface to
interface Herbivore<E extends Animal> extends Hungry<E> {}

C. Change the Sheep class to
class Sheep extends Animal implements Herbivore<Plant> { public void munch(Grass x) {} }

D. Change the Sheep class to
class Sheep extends Plant implements Carnivore<Wolf> { public void munch(Wolf x) {} }

E. Change the wolf class to
class Wolf extends Animal implements Herbivore<Grass> { public void munch(Grass x) {} }

F. No changes are necessary
*/



public class Exe001 {



	public static void main(String[] args) {



	}

}
