package pkgs.pkgExes;

interface InterfaceA {}

class ClassA {

}

//enum DIAS_SEMANAS extends ClassA {//Syntax error on token "extends", implements expected
enum DIAS_SEMANAS implements InterfaceA {
	SEG{
		@Override
		void m2() {}
	},  
	TER{
		@Override
		void m2() {}
	},
	QUAR{
		@Override
		void m2() {}
	};
	abstract void m2();
}

//class ClassAA extends DIAS_SEMANAS {}//The type DIAS_SEMANAS cannot be the superclass of ClassAA; a superclass must be a class
//class ClassAA extends DIAS_SEMANAS.TER {}//DIAS_SEMANAS.TER cannot be resolved to a type
//class ClassAA extends TER {}//TER cannot be resolved to a type

public class Exe001 {

	public static void main(String[] args) {



	}

}
