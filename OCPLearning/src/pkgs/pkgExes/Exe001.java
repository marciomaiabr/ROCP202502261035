package pkgs.pkgExes;

class ClassA {}
	class ClassAA extends ClassA {}
		class ClassAAA extends ClassAA {}
	class ClassAB extends ClassA {}
		class ClassABA extends ClassAA {}

class ClassB {}
	class ClassBA extends ClassB {}
		class ClassBAA extends ClassBA {}
	class ClassBB extends ClassB {}
		class ClassBBA extends ClassBA {}



interface InterfaceA<T> { void m1(T o); }
interface InterfaceA2<T extends Exception> { void m1(T o); }
//interface InterfaceA3<T super Exception> { void m1(T o); }//Syntax error on token "super", , expected
//interface InterfaceA4<T> { void m1(<T extends Exception> o); }//Syntax error on token(s), misplaced construct(s)
//interface InterfaceA4<T> { void m1(<T super Exception> o); }//Syntax error, insert "Identifier (" to complete MethodHeaderName	Exe001.java	/OCPLearning/src/pkgs/pkgExes	line 21	Java Problem//Syntax error on token "super", , expected//Syntax error on token(s), misplaced construct(s)
//interface InterfaceA5<?> { void m1(T o); }//Syntax error on token "?", Identifier expected//- T cannot be resolved to a type
//interface InterfaceA5<?> { void m1(? o); }//Syntax error on token "?", Identifier expected//- Syntax error on token "?", byte expected
//interface InterfaceA5<? extends ClassAA> { }//Syntax error on token "?", Identifier expected
//interface InterfaceA5<? super ClassAA> { }//Syntax error on tokens, delete these tokens
//interface InterfaceA5<T> { void m1(? o); }//Syntax error on token "?", byte expected
//interface InterfaceA5<T> { void m1(<? extends ClassAA> o); }//Syntax error on token "(", Type expected after this token
//interface InterfaceA5<T> { void m1(<? super ClassAA> o); }//Syntax error on token "(", Type expected after this token
interface InterfaceA5 { void m1(InterfaceA<? extends ClassAA> o); }
interface InterfaceA6 { void m1(InterfaceA<? super ClassAA> o); }





public class Exe001 {



	public static void main(String[] args) {

		mqqc1(((InterfaceA<Exception>)(new Object())));

		//mqqc2(((InterfaceA<ClassB>)(new Object())));//The method mqqc2(InterfaceA<? extends ClassA>) in the type Exe001 is not applicable for the arguments (InterfaceA<ClassB>)
		mqqc2(((InterfaceA<ClassA>)(new Object())));
		mqqc2(((InterfaceA<ClassAA>)(new Object())));

		//mqqc3(((InterfaceA<ClassB>)(new Object())));//The method mqqc3(InterfaceA<? extends ClassAA>) in the type Exe001 is not applicable for the arguments (InterfaceA<ClassB>)
		//mqqc3(((InterfaceA<ClassA>)(new Object())));//The method mqqc3(InterfaceA<? extends ClassAA>) in the type Exe001 is not applicable for the arguments (InterfaceA<ClassA>)
		mqqc3(((InterfaceA<ClassAA>)(new Object())));
		mqqc3(((InterfaceA<ClassAAA>)(new Object())));

		//mqqc4(((InterfaceA<ClassB>)(new Object())));//The method mqqc4(InterfaceA<? super ClassAA>) in the type Exe001 is not applicable for the arguments (InterfaceA<ClassB>)
		mqqc4(((InterfaceA<ClassA>)(new Object())));
		mqqc4(((InterfaceA<ClassAA>)(new Object())));
		//mqqc4(((InterfaceA<ClassAAA>)(new Object())));//The method mqqc4(InterfaceA<? super ClassAA>) in the type Exe001 is not applicable for the arguments (InterfaceA<ClassAAA>)

	}

	static void mqqc1(InterfaceA<?> ia) {
		//ia.m1(new ClassA());////The method m1(capture#1-of ?) in the type InterfaceA<capture#1-of ?> is not applicable for the arguments (ClassA)
	}
	static void mqqc2(InterfaceA<? extends ClassA> ia) {
		//ia.m1(new ClassA());//The method m1(capture#1-of ? extends ClassA) in the type InterfaceA<capture#1-of ? extends ClassA> is not applicable for the arguments (ClassA)
		//ia.m1(new ClassAA());//The method m1(capture#1-of ? extends ClassA) in the type InterfaceA<capture#1-of ? extends ClassA> is not applicable for the arguments (ClassAA)
	}
	static void mqqc3(InterfaceA<? extends ClassAA> ia) {
		//ia.m1(new ClassA());//The method m1(capture#1-of ? extends ClassAA) in the type InterfaceA<capture#1-of ? extends ClassAA> is not applicable for the arguments (ClassA)
		//ia.m1(new ClassAA());//The method m1(capture#1-of ? extends ClassAA) in the type InterfaceA<capture#1-of ? extends ClassAA> is not applicable for the arguments (ClassAA)
		//ia.m1(new ClassAAA());//The method m1(capture#1-of ? extends ClassAA) in the type InterfaceA<capture#1-of ? extends ClassAA> is not applicable for the arguments (ClassAAA)
	}
	static void mqqc4(InterfaceA<? super ClassAA> ia) {
		//ia.m1(new ClassA());//The method m1(capture#1-of ? super ClassAA) in the type InterfaceA<capture#1-of ? super ClassAA> is not applicable for the arguments (ClassA)
		ia.m1(new ClassAA());
		ia.m1(new ClassAAA());
	}

}
