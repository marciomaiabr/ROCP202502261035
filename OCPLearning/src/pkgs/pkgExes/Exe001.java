package pkgs.pkgExes;

class ClassA {}
class ClassAA extends ClassA{}
class ClassAAA extends ClassAA{}
class ClassAB extends ClassA{}

class ClassB {}

interface Comic<G> {
	void draw(G p);
}

class ComicClass<G> implements Comic<G> {
	public void draw(G p) {
		System.out.println(p);
	}
}

class SnoopyClass implements Comic<ClassAA> {
	public void draw(ClassAA p) {
		System.out.println(p);
	}
}

class SnoopyClass2<ClassX> implements Comic<ClassAA> {
	public void draw(ClassAA p) {
		System.out.println(p);
	}
}

/*class SnoopyComic implements Comic<G> {//The type SnoopyComic must implement the inherited abstract method Comic<G>.draw(G)
	public void draw(G p) {//G cannot be resolved to a type
		System.out.println(p);
	}
}*/

public class Exe001 {

	public static void main(String[] args) {

		Comic<Exe001> c1 = c -> System.out.println(c);
		Comic<Exe001> c2 = new ComicClass<>();
		Comic<ClassAA> c3 = new SnoopyClass();
		//Comic<ClassA> c33 = new SnoopyClass();//Type mismatch: cannot convert from SnoopyClass to Comic<ClassA>
		//Comic<ClassAAA> c34 = new SnoopyClass();//Type mismatch: cannot convert from SnoopyClass to Comic<ClassAAA>
		//Comic<Exe001> c4 = new SnoopyComic();

	}

}
