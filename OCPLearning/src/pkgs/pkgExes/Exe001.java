package pkgs.pkgExes;



/*
interface Hungry<E> { void munch(E x); }

interface Herbivore<E extends Plant> extends Hungry<E> {}
interface Carnivore<E extends Animal> extends Hungry<E> {}

abstract class Plant {}
abstract class Animal {}

class Grass extends Plant {}

class Sheep extends Animal implements Herbivore<Sheep> { public void munch(Sheep x) {} }
class Wolf extends Animal implements Carnivore<Sheep> { public void munch(Sheep x) {} }
*/

interface Hungry<E> { void munch(E x); }

interface Herbivore<E extends Animal> extends Hungry<E> {}
interface Carnivore<E extends Animal> extends Hungry<E> {}

abstract class Plant {}
abstract class Animal {}

class Grass extends Plant {}

class Sheep extends Animal implements Herbivore<Sheep> { public void munch(Sheep x) {} }
class Wolf extends Animal implements Carnivore<Sheep> { public void munch(Sheep x) {} }



public class Exe001 {



	public static void main(String[] args) {



	}



}
